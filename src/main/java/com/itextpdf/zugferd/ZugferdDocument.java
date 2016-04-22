/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2017 iText Group NV
    Authors: iText Software.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License version 3
    as published by the Free Software Foundation with the addition of the
    following permission added to Section 15 as permitted in Section 7(a):
    FOR ANY PART OF THE COVERED WORK IN WHICH THE COPYRIGHT IS OWNED BY
    ITEXT GROUP. ITEXT GROUP DISCLAIMS THE WARRANTY OF NON INFRINGEMENT
    OF THIRD PARTY RIGHTS

    This program is distributed in the hope that it will be useful, but
    WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
    or FITNESS FOR A PARTICULAR PURPOSE.
    See the GNU Affero General Public License for more details.
    You should have received a copy of the GNU Affero General Public License
    along with this program; if not, see http://www.gnu.org/licenses or write to
    the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
    Boston, MA, 02110-1301 USA, or download the license from the following URL:
    http://itextpdf.com/terms-of-use/

    The interactive user interfaces in modified source and object code versions
    of this program must display Appropriate Legal Notices, as required under
    Section 5 of the GNU Affero General Public License.

    In accordance with Section 7(b) of the GNU Affero General Public License,
    a covered work must retain the producer line in every PDF that is created
    or manipulated using iText.

    You can be released from the requirements of the license by purchasing
    a commercial license. Buying such a license is mandatory as soon as you
    develop commercial activities involving the iText software without
    disclosing the source code of your own applications.
    These activities include: offering paid services to customers as an ASP,
    serving PDFs on the fly in a web application, shipping iText with a closed
    source product.

    For more information, please contact iText Software Corp. at this
    address: sales@itextpdf.com */
package com.itextpdf.zugferd;


import com.itextpdf.kernel.pdf.PdfOutputIntent;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.xmp.XMPException;
import com.itextpdf.kernel.xmp.XMPMeta;
import com.itextpdf.kernel.xmp.XMPMetaFactory;
import com.itextpdf.kernel.xmp.XMPUtils;
import com.itextpdf.kernel.pdf.PdfAConformanceLevel;
import com.itextpdf.pdfa.PdfADocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import com.itextpdf.zugferd.ZugferdProductInfo;
import com.itextpdf.kernel.Version;

public class ZugferdDocument extends PdfADocument {
    private static final long serialVersionUID = 1737898087328462098L;

    public ZugferdDocument(PdfWriter writer, PdfAConformanceLevel pdfaConformanceLevel, PdfOutputIntent outputIntent) {
        super(writer, pdfaConformanceLevel, outputIntent);
    }
        String licenseKeyClassName = "com.itextpdf.licensekey.LicenseKey";
        String licenseKeyProductClassName = "com.itextpdf.licensekey.LicenseKeyProduct";
        String licenseKeyFeatureClassName = "com.itextpdf.licensekey.LicenseKeyProductFeature";
        String checkLicenseKeyMethodName = "scheduledCheck";

        try {
            Class licenseKeyClass = Class.forName(licenseKeyClassName);
            Class licenseKeyProductClass = Class.forName(licenseKeyProductClassName);
            Class licenseKeyProductFeatureClass = Class.forName(licenseKeyFeatureClassName);

            Object licenseKeyProductFeatureArray = Array.newInstance(licenseKeyProductFeatureClass, 0);

            Class[] params = new Class[] {
                    String.class,
                    Integer.TYPE,
                    Integer.TYPE,
                    licenseKeyProductFeatureArray.getClass()
            };

            Constructor licenseKeyProductConstructor = licenseKeyProductClass.getConstructor(params);

            Object licenseKeyProductObject = licenseKeyProductConstructor.newInstance(
                    ZugferdProductInfo.PRODUCT_NAME,
                    ZugferdProductInfo.MAJOR_VERSION,
                    ZugferdProductInfo.MINOR_VERSION,
                    licenseKeyProductFeatureArray
            );

            Method method = licenseKeyClass.getMethod(checkLicenseKeyMethodName, licenseKeyProductClass);
            method.invoke(null, licenseKeyProductObject);
        } catch (Exception e) {
            if ( ! Version.isAGPLVersion() ) {
                throw new RuntimeException(e.getCause());
            }
        }

    public ZugferdDocument(PdfWriter writer, PdfOutputIntent outputIntent) {
        super(writer, PdfAConformanceLevel.PDF_A_3B, outputIntent);
        Logger logger = LoggerFactory.getLogger(ZugferdDocument.class);
        logger.warn(ZugferdLogMessageConstant.WRONG_OR_NO_CONFORMANCE_LEVEL);
    }

    @Override
    public void createXmpMetadata() throws XMPException {
        Logger logger = LoggerFactory.getLogger(ZugferdDocument.class);
        logger.warn(ZugferdLogMessageConstant.NO_ZUGFERD_PROFILE_TYPE_SPECIFIED);
        createXmpMetadata(checker.getConformanceLevel(), ZugferdConformanceLevel.ZUGFeRDBasic);
    }

    public void createXmpMetadata(PdfAConformanceLevel pdfaConformanceLevel, ZugferdConformanceLevel zugferdConformanceLevel) throws XMPException {
        super.createXmpMetadata(pdfaConformanceLevel);
        addZugferdRdfDescription(zugferdConformanceLevel);
        System.out.println();
    }

    protected void addZugferdRdfDescription(ZugferdConformanceLevel zugferdConformanceLevel) throws XMPException {
        XMPMeta xmpMeta = XMPMetaFactory.parseFromBuffer(getXmpMetadata());
        switch (zugferdConformanceLevel) {
            case ZUGFeRDBasic:
            case ZUGFeRDComfort:
            case ZUGFeRDExtended:
                XMPMeta taggedExtensionMetaComfort = XMPMetaFactory.parseFromString(getZugferdExtension(zugferdConformanceLevel));
                XMPUtils.appendProperties(taggedExtensionMetaComfort, xmpMeta, true, false);
                break;
            default:
                break;
        }
        setXmpMetadata(xmpMeta);
    }

    @Override
    protected void setChecker(PdfAConformanceLevel conformanceLevel) {
        if (!conformanceLevel.equals(PdfAConformanceLevel.PDF_A_3B)) {
            Logger logger = LoggerFactory.getLogger(ZugferdDocument.class);
            logger.warn(ZugferdLogMessageConstant.WRONG_OR_NO_CONFORMANCE_LEVEL);
            checker = new ZugferdChecker(PdfAConformanceLevel.PDF_A_3B);
        } else {
            checker = new ZugferdChecker(conformanceLevel);
        }
    }

    private String getZugferdExtension(ZugferdConformanceLevel conformanceLevel) {
        switch (conformanceLevel) {
            case ZUGFeRDBasic:
                return String.format(ZugferdXMPUtil.ZUGFERD_EXTENSION, "BASIC");
            case ZUGFeRDComfort:
                return String.format(ZugferdXMPUtil.ZUGFERD_EXTENSION, "COMFORT");
            case ZUGFeRDExtended:
                return String.format(ZugferdXMPUtil.ZUGFERD_EXTENSION, "EXTENDED");
            default:
                return null;
        }
    }
}
