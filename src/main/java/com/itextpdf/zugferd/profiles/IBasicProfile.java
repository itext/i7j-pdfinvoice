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
package com.itextpdf.zugferd.profiles;

import java.util.Date;

/**
 * If you implement this interface correctly, you provide all the data that
 * is necessary for iText to create an XML that can be used in a ZUGFeRD
 * invoice that conforms with the Basic profile.
 */
public interface IBasicProfile {
    
    /**
     * Gets the test indicator.
     *
     * @return the test indicator
     */
    boolean getTestIndicator();
    
    /**
     * Gets the id.
     *
     * @return the id
     */
    String getId();
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    String getName();
    
    /**
     * Gets the type code.
     *
     * @return the type code
     */
    String getTypeCode();
    
    /**
     * Gets the date time.
     *
     * @return the date time
     */
    Date getDateTime();
    
    /**
     * Gets the date time format.
     *
     * @return the date time format
     */
    String getDateTimeFormat();
    
    /**
     * Gets the notes.
     *
     * @return the notes
     */
    String[][] getNotes();
    
    /**
     * Gets the seller name.
     *
     * @return the seller name
     */
    String getSellerName();
    
    /**
     * Gets the seller postcode.
     *
     * @return the seller postcode
     */
    String getSellerPostcode();
    
    /**
     * Gets the seller line one.
     *
     * @return the seller line one
     */
    String getSellerLineOne();
    
    /**
     * Gets the seller line two.
     *
     * @return the seller line two
     */
    String getSellerLineTwo();
    
    /**
     * Gets the seller city name.
     *
     * @return the seller city name
     */
    String getSellerCityName();
    
    /**
     * Gets the seller country ID.
     *
     * @return the seller country ID
     */
    String getSellerCountryID();
    
    /**
     * Gets the seller tax registration ID.
     *
     * @return the seller tax registration ID
     */
    String[] getSellerTaxRegistrationID();
    
    /**
     * Gets the seller tax registration scheme ID.
     *
     * @return the seller tax registration scheme ID
     */
    String[] getSellerTaxRegistrationSchemeID();
    
    /**
     * Gets the buyer name.
     *
     * @return the buyer name
     */
    String getBuyerName();
    
    /**
     * Gets the buyer postcode.
     *
     * @return the buyer postcode
     */
    String getBuyerPostcode();
    
    /**
     * Gets the buyer line one.
     *
     * @return the buyer line one
     */
    String getBuyerLineOne();
    
    /**
     * Gets the buyer line two.
     *
     * @return the buyer line two
     */
    String getBuyerLineTwo();
    
    /**
     * Gets the buyer city name.
     *
     * @return the buyer city name
     */
    String getBuyerCityName();
    
    /**
     * Gets the buyer country ID.
     *
     * @return the buyer country ID
     */
    String getBuyerCountryID();
    
    /**
     * Gets the buyer tax registration ID.
     *
     * @return the buyer tax registration ID
     */
    String[] getBuyerTaxRegistrationID();
    
    /**
     * Gets the buyer tax registration scheme ID.
     *
     * @return the buyer tax registration scheme ID
     */
    String[] getBuyerTaxRegistrationSchemeID();
    
    /**
     * Gets the delivery date time.
     *
     * @return the delivery date time
     */
    Date getDeliveryDateTime();
    
    /**
     * Gets the delivery date time format.
     *
     * @return the delivery date time format
     */
    String getDeliveryDateTimeFormat();
    
    /**
     * Gets the payment reference.
     *
     * @return the payment reference
     */
    String getPaymentReference();
    
    /**
     * Gets the invoice currency code.
     *
     * @return the invoice currency code
     */
    String getInvoiceCurrencyCode();
    
    /**
     * Gets the payment means ID.
     *
     * @return the payment means ID
     */
    String[] getPaymentMeansID();
    
    /**
     * Gets the payment means scheme agency ID.
     *
     * @return the payment means scheme agency ID
     */
    String[] getPaymentMeansSchemeAgencyID();
    
    /**
     * Gets the payment means payee account IBAN.
     *
     * @return the payment means payee account IBAN
     */
    String[] getPaymentMeansPayeeAccountIBAN();
    
    /**
     * Gets the payment means payee account account name.
     *
     * @return the payment means payee account account name
     */
    String[] getPaymentMeansPayeeAccountAccountName();
    
    /**
     * Gets the payment means payee account proprietary ID.
     *
     * @return the payment means payee account proprietary ID
     */
    String[] getPaymentMeansPayeeAccountProprietaryID();
    
    /**
     * Gets the payment means payee financial institution BIC.
     *
     * @return the payment means payee financial institution BIC
     */
    String[] getPaymentMeansPayeeFinancialInstitutionBIC();
    
    /**
     * Gets the payment means payee financial institution german bankleitzahl ID.
     *
     * @return the payment means payee financial institution german bankleitzahl ID
     */
    String[] getPaymentMeansPayeeFinancialInstitutionGermanBankleitzahlID();
    
    /**
     * Gets the payment means payee financial institution name.
     *
     * @return the payment means payee financial institution name
     */
    String[] getPaymentMeansPayeeFinancialInstitutionName();
    
    /**
     * Gets the tax calculated amount.
     *
     * @return the tax calculated amount
     */
    String[] getTaxCalculatedAmount();
    
    /**
     * Gets the tax calculated amount currency ID.
     *
     * @return the tax calculated amount currency ID
     */
    String[] getTaxCalculatedAmountCurrencyID();
    
    /**
     * Gets the tax type code.
     *
     * @return the tax type code
     */
    String[] getTaxTypeCode();
    
    /**
     * Gets the tax basis amount.
     *
     * @return the tax basis amount
     */
    String[] getTaxBasisAmount();
    
    /**
     * Gets the tax basis amount currency ID.
     *
     * @return the tax basis amount currency ID
     */
    String[] getTaxBasisAmountCurrencyID();
    
    /**
     * Gets the tax applicable percent.
     *
     * @return the tax applicable percent
     */
    String[] getTaxApplicablePercent();
    
    /**
     * Gets the line total amount.
     *
     * @return the line total amount
     */
    String getLineTotalAmount();
    
    /**
     * Gets the line total amount currency ID.
     *
     * @return the line total amount currency ID
     */
    String getLineTotalAmountCurrencyID();
    
    /**
     * Gets the charge total amount.
     *
     * @return the charge total amount
     */
    String getChargeTotalAmount();
    
    /**
     * Gets the charge total amount currency ID.
     *
     * @return the charge total amount currency ID
     */
    String getChargeTotalAmountCurrencyID();
    
    /**
     * Gets the allowance total amount.
     *
     * @return the allowance total amount
     */
    String getAllowanceTotalAmount();
    
    /**
     * Gets the allowance total amount currency ID.
     *
     * @return the allowance total amount currency ID
     */
    String getAllowanceTotalAmountCurrencyID();
    
    /**
     * Gets the tax basis total amount.
     *
     * @return the tax basis total amount
     */
    String getTaxBasisTotalAmount();
    
    /**
     * Gets the tax basis total amount currency ID.
     *
     * @return the tax basis total amount currency ID
     */
    String getTaxBasisTotalAmountCurrencyID();
    
    /**
     * Gets the tax total amount.
     *
     * @return the tax total amount
     */
    String getTaxTotalAmount();
    
    /**
     * Gets the tax total amount currency ID.
     *
     * @return the tax total amount currency ID
     */
    String getTaxTotalAmountCurrencyID();
    
    /**
     * Gets the grand total amount.
     *
     * @return the grand total amount
     */
    String getGrandTotalAmount();
    
    /**
     * Gets the grand total amount currency ID.
     *
     * @return the grand total amount currency ID
     */
    String getGrandTotalAmountCurrencyID();
    
    /**
     * Gets the line item billed quantity.
     *
     * @return the line item billed quantity
     */
    String[] getLineItemBilledQuantity();
    
    /**
     * Gets the line item billed quantity unit code.
     *
     * @return the line item billed quantity unit code
     */
    String[] getLineItemBilledQuantityUnitCode();
    
    /**
     * Gets the line item specified trade product name.
     *
     * @return the line item specified trade product name
     */
    String[] getLineItemSpecifiedTradeProductName();
}
