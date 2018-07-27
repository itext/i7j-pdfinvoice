/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2018 iText Group NV
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
package com.itextpdf.zugferd.validation.extended;

import com.itextpdf.zugferd.validation.CodeValidation;

/**
 * Series of codes that can be used for incoterms.
 * These codes are used only in the context of the Extended profile.
 */
public class IncotermsCode extends CodeValidation {

    /** The Constant EX_WORKS. */
    public static final String EX_WORKS = "EXW";
    
    /** The Constant FREE_CARRIER. */
    public static final String FREE_CARRIER = "FCA";
    
    /** The Constant FREE_ALONGSIDE_SHIP. */
    public static final String FREE_ALONGSIDE_SHIP = "FAS";
    
    /** The Constant FREE_ON_BOARD. */
    public static final String FREE_ON_BOARD = "FOB";
    
    /** The Constant COST_AND_FREIGHT. */
    public static final String COST_AND_FREIGHT = "CFR";
    
    /** The Constant COST_INSURANCE_FREIGHT. */
    public static final String COST_INSURANCE_FREIGHT = "CIF";
    
    /** The Constant DELIVERED_AT_TERMINAL. */
    public static final String DELIVERED_AT_TERMINAL = "DAT";
    
    /** The Constant DELIVERED_AT_PLACE. */
    public static final String DELIVERED_AT_PLACE = "DAP";
    
    /** The Constant CARRIAGE_PAID_TO. */
    public static final String CARRIAGE_PAID_TO = "CPT";
    
    /** The Constant CARRIAGE_INSURANCE_PAID. */
    public static final String CARRIAGE_INSURANCE_PAID = "CIP";
    
    /** The Constant DELIVERED_DUTY_PAID. */
    public static final String DELIVERED_DUTY_PAID = "DDP";

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.validation.CodeValidation#isValid(java.lang.String)
     */
    public boolean isValid(String code) {
        return code.equals(EX_WORKS)
                || code.equals(FREE_CARRIER)
                || code.equals(FREE_ALONGSIDE_SHIP)
                || code.equals(FREE_ON_BOARD)
                || code.equals(COST_AND_FREIGHT)
                || code.equals(COST_INSURANCE_FREIGHT)
                || code.equals(DELIVERED_AT_TERMINAL)
                || code.equals(DELIVERED_AT_PLACE)
                || code.equals(CARRIAGE_PAID_TO)
                || code.equals(CARRIAGE_INSURANCE_PAID)
                || code.equals(DELIVERED_DUTY_PAID);
    }
}
