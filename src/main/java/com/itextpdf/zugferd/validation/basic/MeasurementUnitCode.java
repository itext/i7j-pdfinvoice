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
package com.itextpdf.zugferd.validation.basic;

import com.itextpdf.zugferd.validation.CodeValidation;

/**
 * Class that can be used to check if a measurement unit code is valid.
 */
public class MeasurementUnitCode extends CodeValidation {
    
    /** The Constant ITEM. */
    public static final String ITEM = "C62";
    
    /** The Constant DAY. */
    public static final String DAY = "DAY"; 
    
    /** The Constant HA. */
    public static final String HA = "HAR"; 
    
    /** The Constant HR. */
    public static final String HR = "HUR"; 
    
    /** The Constant KG. */
    public static final String KG = "KGM"; 
    
    /** The Constant KM. */
    public static final String KM = "KTM"; 
    
    /** The Constant KWH. */
    public static final String KWH = "KWH"; 
    
    /** The Constant SUM. */
    public static final String SUM = "LS"; 
    
    /** The Constant L. */
    public static final String L = "LTR"; 
    
    /** The Constant MIN. */
    public static final String MIN = "MIN";
    
    /** The Constant MM2. */
    public static final String MM2 = "MMK"; 
    
    /** The Constant MM. */
    public static final String MM = "MMT"; 
    
    /** The Constant M2. */
    public static final String M2 = "MTK"; 
    
    /** The Constant M3. */
    public static final String M3 = "MTQ";
    
    /** The Constant M. */
    public static final String M = "MTR"; 
    
    /** The Constant NO. */
    public static final String NO = "NAR"; 
    
    /** The Constant PR. */
    public static final String PR = "NPR"; 
    
    /** The Constant PCT. */
    public static final String PCT = "P1";
    
    /** The Constant SET. */
    public static final String SET = "SET"; 
    
    /** The Constant T. */
    public static final String T = "TNE"; 
    
    /** The Constant WK. */
    public static final String WK = "WEE";     
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.validation.CodeValidation#isValid(java.lang.String)
     */
    public boolean isValid(String code) {
        return code.equals(ITEM) ||
               code.equals(DAY) ||
               code.equals(HA) ||
               code.equals(HR) ||
               code.equals(KG) ||
               code.equals(KM) ||
               code.equals(KWH) ||
               code.equals(SUM) ||
               code.equals(L) ||
               code.equals(MIN) ||
               code.equals(MM2) ||
               code.equals(MM) ||
               code.equals(M2) ||
               code.equals(M3) ||
               code.equals(M) ||
               code.equals(NO) ||
               code.equals(PR) ||
               code.equals(PCT) ||
               code.equals(SET) ||
               code.equals(T) ||
               code.equals(WK);
    }
    
}
