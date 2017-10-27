/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2017 iText Group NV
    Authors: Bruno Lowagie, et al.
    
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
    address: sales@itextpdf.com
 */
package com.itextpdf.zugferd;

import com.itextpdf.kernel.PdfException;
import com.itextpdf.kernel.pdf.PdfDictionary;
import com.itextpdf.kernel.pdf.PdfName;
import com.itextpdf.kernel.xmp.XMPException;
import com.itextpdf.kernel.xmp.XMPMeta;
import com.itextpdf.kernel.xmp.XMPMetaFactory;
import com.itextpdf.kernel.pdf.PdfAConformanceLevel;
import com.itextpdf.pdfa.checker.PdfA3Checker;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@link PdfA3Checker} implementation for ZUGFeRD documents.
 */
public class ZugferdChecker extends PdfA3Checker {
    
    /**  A serial version UID. */
	private static final long serialVersionUID = 4871365089564313135L;
	
	/** The attachments. */
	protected List<PdfDictionary> attachments;

    /**
     * Creates a new {@link ZugferdChecker} instance.
     *
     * @param conformanceLevel the conformance level
     */
    public ZugferdChecker(PdfAConformanceLevel conformanceLevel) {
        super(conformanceLevel);
        attachments = new ArrayList<>();
    }

    /* (non-Javadoc)
     * @see com.itextpdf.pdfa.checker.PdfA3Checker#checkFileSpec(com.itextpdf.kernel.pdf.PdfDictionary)
     */
    @Override
    protected void checkFileSpec(PdfDictionary fileSpec) {
        super.checkFileSpec(fileSpec);
        attachments.add(fileSpec);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.pdfa.checker.PdfA1Checker#checkMetaData(com.itextpdf.kernel.pdf.PdfDictionary)
     */
    @Override
    protected void checkMetaData(PdfDictionary catalog) {
        super.checkMetaData(catalog);
        XMPMeta xmpMeta;
        try {
            xmpMeta = XMPMetaFactory.parseFromBuffer(catalog.getAsStream(PdfName.Metadata).getBytes());
            String docFileName = xmpMeta.getPropertyString(ZugferdXMPUtil.ZUGFERD_SCHEMA_NS, ZugferdXMPUtil.ZUGFERD_DOCUMENT_FILE_NAME);

            for (PdfDictionary attachment : attachments) {
                if ((attachment.getAsString(PdfName.UF) != null && docFileName.equals(attachment.getAsString(PdfName.UF).toString()))
                        || (attachment.getAsString(PdfName.F) != null && docFileName.equals(attachment.getAsString(PdfName.F).toString()))) {
                    PdfName relationship = attachment.getAsName(PdfName.AFRelationship);
                    if (!PdfName.Alternative.equals(relationship)) {
                        throw new ZugferdConformanceException(ZugferdConformanceException.AFRelationshipValueShallbeAlternative);
                    }
                    break;
                }
            }
        } catch (XMPException e) {
            throw new PdfException(e);
        }
    }
}
