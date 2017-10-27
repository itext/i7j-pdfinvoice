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
package com.itextpdf.zugferd.validation.extended;

import com.itextpdf.zugferd.validation.CodeValidation;

/**
 * Series of codes that can be used for quantities.
 * These codes are used only in the context of the Extended profile.
 */
public class QuantityCode extends CodeValidation {

    /** The Constant BARREL. */
    public static final String BARREL = "BA";
    
    /** The Constant BOTTLECRATE. */
    public static final String BOTTLECRATE = "BC";
    
    /** The Constant BAG. */
    public static final String BAG = "BG";
    
    /** The Constant BOTTLE. */
    public static final String BOTTLE = "BO";
    
    /** The Constant BOX. */
    public static final String BOX = "BX";
    
    /** The Constant CASE. */
    public static final String CASE = "CS";
    
    /** The Constant CARTON. */
    public static final String CARTON = "CT";
    
    /** The Constant CAN. */
    public static final String CAN = "CX";
    
    /** The Constant UNPACKAGED. */
    public static final String UNPACKAGED = "NE";
    
    /** The Constant PALLET. */
    public static final String PALLET = "PX";
    
    /** The Constant ROLL. */
    public static final String ROLL = "RO";
    
    /** The Constant SACK. */
    public static final String SACK = "SA";

    /**
     * The code list provided with the ZUGFeRD standard only lists twelve codes.
     * There are more codes available (in UNCL 7065).
     * We won't check the presence of a code in UNCL 7065, but we'll check if
     * the code consists of two letters and if it's uppercase.
     * @param code the code to be tested
     * @return true if the code has the correct format
     */
    public boolean isValid(String code) {
        return isUppercase(code, 2);
    }
}
