/*

    This file is part of the iText (R) project.
    Copyright (c) 1998-2018 iText Group NV
    Authors: Bruno Lowagie, Paulo Soares, et al.

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

import com.itextpdf.kernel.counter.event.IMetaInfo;
import com.itextpdf.kernel.pdf.PdfAConformanceLevel;
import com.itextpdf.kernel.pdf.PdfOutputIntent;

public class ZugferdProperties {

    protected ZugferdConformanceLevel zugferdConformanceLevel = null;

    protected PdfAConformanceLevel pdfaConformanceLevel = null;

    protected PdfOutputIntent pdfOutputIntent = null;

    protected IMetaInfo metaInfo;

    public ZugferdProperties() {
    }

    public ZugferdProperties(ZugferdProperties other) {
        this.metaInfo = other.metaInfo;
        this.zugferdConformanceLevel = other.zugferdConformanceLevel;
        this.pdfaConformanceLevel = other.pdfaConformanceLevel;
        this.pdfOutputIntent = other.pdfOutputIntent;
    }

    /**
     * Sets document meta info. This meta info will be passed to the {@link com.itextpdf.kernel.counter.EventCounter}
     * with {@link com.itextpdf.zugferd.events.PdfInvoiceEvent} and can be used to determine event origin.
     *
     * @param metaInfo meta info to set
     * @return this {@link ZugferdProperties} instance
     */
    public ZugferdProperties setEventCountingMetaInfo(IMetaInfo metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }

    /**
     * Sets ZUGFeRD conformance level, one of  the following: BASIC, COMFORT or EXTENDED.
     *
     * @param zugferdConformanceLevel conformance level to set
     * @return this {@link ZugferdProperties} instance
     */
    public ZugferdProperties setZugferdConformanceLevel(ZugferdConformanceLevel zugferdConformanceLevel) {
        this.zugferdConformanceLevel = zugferdConformanceLevel;
        return this;
    }

    /**
     * Sets PDF/A conformance level.
     *
     * @param pdfaConformanceLevel conformance level to set
     * @return this {@link ZugferdProperties} instance
     */
    public ZugferdProperties setPdfAConformanceLevel(PdfAConformanceLevel pdfaConformanceLevel) {
        this.pdfaConformanceLevel = pdfaConformanceLevel;
        return this;
    }

    /**
     * Sets PDF/A output intent for the document.
     *
     * @param pdfOutputIntent output intent to set
     * @return this {@link ZugferdProperties} instance
     */
    public ZugferdProperties setPdfOutputIntent(PdfOutputIntent pdfOutputIntent) {
        this.pdfOutputIntent = pdfOutputIntent;
        return this;
    }
}
