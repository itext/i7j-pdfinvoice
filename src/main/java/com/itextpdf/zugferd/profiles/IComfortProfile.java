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
 * invoice that conforms with the Comfort profile.
 */
public interface IComfortProfile extends IBasicProfile {
    
    /**
     * Gets the notes codes.
     *
     * @return the notes codes
     */
    String[] getNotesCodes();
    
    /**
     * Gets the buyer reference.
     *
     * @return the buyer reference
     */
    String getBuyerReference();
    
    /**
     * Gets the seller ID.
     *
     * @return the seller ID
     */
    String getSellerID();
    
    /**
     * Gets the seller global ID.
     *
     * @return the seller global ID
     */
    String[] getSellerGlobalID();
    
    /**
     * Gets the seller global scheme ID.
     *
     * @return the seller global scheme ID
     */
    String[] getSellerGlobalSchemeID();
    
    /**
     * Gets the buyer ID.
     *
     * @return the buyer ID
     */
    String getBuyerID();
    
    /**
     * Gets the buyer global ID.
     *
     * @return the buyer global ID
     */
    String[] getBuyerGlobalID();
    
    /**
     * Gets the buyer global scheme ID.
     *
     * @return the buyer global scheme ID
     */
    String[] getBuyerGlobalSchemeID();
    
    /**
     * Gets the buyer order referenced document issue date time.
     *
     * @return the buyer order referenced document issue date time
     */
    Date getBuyerOrderReferencedDocumentIssueDateTime();
    
    /**
     * Gets the buyer order referenced document issue date time format.
     *
     * @return the buyer order referenced document issue date time format
     */
    String getBuyerOrderReferencedDocumentIssueDateTimeFormat();
    
    /**
     * Gets the buyer order referenced document ID.
     *
     * @return the buyer order referenced document ID
     */
    String getBuyerOrderReferencedDocumentID();
    
    /**
     * Gets the contract referenced document issue date time.
     *
     * @return the contract referenced document issue date time
     */
    Date getContractReferencedDocumentIssueDateTime();
    
    /**
     * Gets the contract referenced document issue date time format.
     *
     * @return the contract referenced document issue date time format
     */
    String getContractReferencedDocumentIssueDateTimeFormat();
    
    /**
     * Gets the contract referenced document ID.
     *
     * @return the contract referenced document ID
     */
    String getContractReferencedDocumentID();
    
    /**
     * Gets the customer order referenced document issue date time.
     *
     * @return the customer order referenced document issue date time
     */
    Date getCustomerOrderReferencedDocumentIssueDateTime();
    
    /**
     * Gets the customer order referenced document issue date time format.
     *
     * @return the customer order referenced document issue date time format
     */
    String getCustomerOrderReferencedDocumentIssueDateTimeFormat();
    
    /**
     * Gets the customer order referenced document ID.
     *
     * @return the customer order referenced document ID
     */
    String getCustomerOrderReferencedDocumentID();
    
    /**
     * Gets the delivery note referenced document issue date time.
     *
     * @return the delivery note referenced document issue date time
     */
    Date getDeliveryNoteReferencedDocumentIssueDateTime();
    
    /**
     * Gets the delivery note referenced document issue date time format.
     *
     * @return the delivery note referenced document issue date time format
     */
    String getDeliveryNoteReferencedDocumentIssueDateTimeFormat();
    
    /**
     * Gets the delivery note referenced document ID.
     *
     * @return the delivery note referenced document ID
     */
    String getDeliveryNoteReferencedDocumentID();
    
    /**
     * Gets the invoicee ID.
     *
     * @return the invoicee ID
     */
    String getInvoiceeID();
    
    /**
     * Gets the invoicee global ID.
     *
     * @return the invoicee global ID
     */
    String[] getInvoiceeGlobalID();
    
    /**
     * Gets the invoicee global scheme ID.
     *
     * @return the invoicee global scheme ID
     */
    String[] getInvoiceeGlobalSchemeID();
    
    /**
     * Gets the invoicee name.
     *
     * @return the invoicee name
     */
    String getInvoiceeName();
    
    /**
     * Gets the invoicee postcode.
     *
     * @return the invoicee postcode
     */
    String getInvoiceePostcode();
    
    /**
     * Gets the invoicee line one.
     *
     * @return the invoicee line one
     */
    String getInvoiceeLineOne();
    
    /**
     * Gets the invoicee line two.
     *
     * @return the invoicee line two
     */
    String getInvoiceeLineTwo();
    
    /**
     * Gets the invoicee city name.
     *
     * @return the invoicee city name
     */
    String getInvoiceeCityName();
    
    /**
     * Gets the invoicee country ID.
     *
     * @return the invoicee country ID
     */
    String getInvoiceeCountryID();
    
    /**
     * Gets the invoicee tax registration ID.
     *
     * @return the invoicee tax registration ID
     */
    String[] getInvoiceeTaxRegistrationID();
    
    /**
     * Gets the invoicee tax registration scheme ID.
     *
     * @return the invoicee tax registration scheme ID
     */
    String[] getInvoiceeTaxRegistrationSchemeID();
    
    /**
     * Gets the payment means type code.
     *
     * @return the payment means type code
     */
    String[] getPaymentMeansTypeCode();
    
    /**
     * Gets the payment means information.
     *
     * @return the payment means information
     */
    String[][] getPaymentMeansInformation();
    
    /**
     * Gets the payment means payer account IBAN.
     *
     * @return the payment means payer account IBAN
     */
    String[] getPaymentMeansPayerAccountIBAN();
    
    /**
     * Gets the payment means payer account proprietary ID.
     *
     * @return the payment means payer account proprietary ID
     */
    String[] getPaymentMeansPayerAccountProprietaryID();
    
    /**
     * Gets the payment means payer financial institution BIC.
     *
     * @return the payment means payer financial institution BIC
     */
    String[] getPaymentMeansPayerFinancialInstitutionBIC();
    
    /**
     * Gets the payment means payer financial institution german bankleitzahl ID.
     *
     * @return the payment means payer financial institution german bankleitzahl ID
     */
    String[] getPaymentMeansPayerFinancialInstitutionGermanBankleitzahlID();
    
    /**
     * Gets the payment means payer financial institution name.
     *
     * @return the payment means payer financial institution name
     */
    String[] getPaymentMeansPayerFinancialInstitutionName();
    
    /**
     * Gets the tax exemption reason.
     *
     * @return the tax exemption reason
     */
    String[] getTaxExemptionReason();
    
    /**
     * Gets the tax category code.
     *
     * @return the tax category code
     */
    String[] getTaxCategoryCode();
    
    /**
     * Gets the billing start date time.
     *
     * @return the billing start date time
     */
    Date getBillingStartDateTime();
    
    /**
     * Gets the billing start date time format.
     *
     * @return the billing start date time format
     */
    String getBillingStartDateTimeFormat();
    
    /**
     * Gets the billing end date time.
     *
     * @return the billing end date time
     */
    Date getBillingEndDateTime();
    
    /**
     * Gets the billing end date time format.
     *
     * @return the billing end date time format
     */
    String getBillingEndDateTimeFormat();
    
    /**
     * Gets the specified trade allowance charge indicator.
     *
     * @return the specified trade allowance charge indicator
     */
    boolean[] getSpecifiedTradeAllowanceChargeIndicator();
    
    /**
     * Gets the specified trade allowance charge actual amount.
     *
     * @return the specified trade allowance charge actual amount
     */
    String[] getSpecifiedTradeAllowanceChargeActualAmount();
    
    /**
     * Gets the specified trade allowance charge actual amount currency.
     *
     * @return the specified trade allowance charge actual amount currency
     */
    String[] getSpecifiedTradeAllowanceChargeActualAmountCurrency();
    
    /**
     * Gets the specified trade allowance charge reason.
     *
     * @return the specified trade allowance charge reason
     */
    String[] getSpecifiedTradeAllowanceChargeReason();
    
    /**
     * Gets the specified trade allowance charge tax type code.
     *
     * @return the specified trade allowance charge tax type code
     */
    String[][] getSpecifiedTradeAllowanceChargeTaxTypeCode();
    
    /**
     * Gets the specified trade allowance charge tax category code.
     *
     * @return the specified trade allowance charge tax category code
     */
    String[][] getSpecifiedTradeAllowanceChargeTaxCategoryCode();
    
    /**
     * Gets the specified trade allowance charge tax applicable percent.
     *
     * @return the specified trade allowance charge tax applicable percent
     */
    String[][] getSpecifiedTradeAllowanceChargeTaxApplicablePercent();
    
    /**
     * Gets the specified logistics service charge description.
     *
     * @return the specified logistics service charge description
     */
    String[][] getSpecifiedLogisticsServiceChargeDescription();
    
    /**
     * Gets the specified logistics service charge amount.
     *
     * @return the specified logistics service charge amount
     */
    String[] getSpecifiedLogisticsServiceChargeAmount();
    
    /**
     * Gets the specified logistics service charge amount currency.
     *
     * @return the specified logistics service charge amount currency
     */
    String[] getSpecifiedLogisticsServiceChargeAmountCurrency();
    
    /**
     * Gets the specified logistics service charge tax type code.
     *
     * @return the specified logistics service charge tax type code
     */
    String[][] getSpecifiedLogisticsServiceChargeTaxTypeCode();
    
    /**
     * Gets the specified logistics service charge tax category code.
     *
     * @return the specified logistics service charge tax category code
     */
    String[][] getSpecifiedLogisticsServiceChargeTaxCategoryCode();
    
    /**
     * Gets the specified logistics service charge tax applicable percent.
     *
     * @return the specified logistics service charge tax applicable percent
     */
    String[][] getSpecifiedLogisticsServiceChargeTaxApplicablePercent();
    
    /**
     * Gets the specified trade payment terms description.
     *
     * @return the specified trade payment terms description
     */
    String[][] getSpecifiedTradePaymentTermsDescription();
    
    /**
     * Gets the specified trade payment terms due date time.
     *
     * @return the specified trade payment terms due date time
     */
    Date[] getSpecifiedTradePaymentTermsDueDateTime();
    
    /**
     * Gets the specified trade payment terms due date time format.
     *
     * @return the specified trade payment terms due date time format
     */
    String[] getSpecifiedTradePaymentTermsDueDateTimeFormat();
    
    /**
     * Gets the total prepaid amount.
     *
     * @return the total prepaid amount
     */
    String getTotalPrepaidAmount();
    
    /**
     * Gets the total prepaid amount currency ID.
     *
     * @return the total prepaid amount currency ID
     */
    String getTotalPrepaidAmountCurrencyID();
    
    /**
     * Gets the due payable amount.
     *
     * @return the due payable amount
     */
    String getDuePayableAmount();
    
    /**
     * Gets the due payable amount currency ID.
     *
     * @return the due payable amount currency ID
     */
    String getDuePayableAmountCurrencyID();
    
    /**
     * Gets the line item line ID.
     *
     * @return the line item line ID
     */
    String[] getLineItemLineID();
    
    /**
     * Gets the line item included note.
     *
     * @return the line item included note
     */
    String[][][] getLineItemIncludedNote();
    
    /**
     * Gets the line item gross price charge amount.
     *
     * @return the line item gross price charge amount
     */
    String[] getLineItemGrossPriceChargeAmount();
    
    /**
     * Gets the line item gross price charge amount currency ID.
     *
     * @return the line item gross price charge amount currency ID
     */
    String[] getLineItemGrossPriceChargeAmountCurrencyID();
    
    /**
     * Gets the line item gross price basis quantity.
     *
     * @return the line item gross price basis quantity
     */
    String[] getLineItemGrossPriceBasisQuantity();
    
    /**
     * Gets the line item gross price basis quantity code.
     *
     * @return the line item gross price basis quantity code
     */
    String[] getLineItemGrossPriceBasisQuantityCode();
    
    /**
     * Gets the line item gross price trade allowance charge indicator.
     *
     * @return the line item gross price trade allowance charge indicator
     */
    boolean[][] getLineItemGrossPriceTradeAllowanceChargeIndicator();
    
    /**
     * Gets the line item gross price trade allowance charge actual amount.
     *
     * @return the line item gross price trade allowance charge actual amount
     */
    String[][] getLineItemGrossPriceTradeAllowanceChargeActualAmount();
    
    /**
     * Gets the line item gross price trade allowance charge actual amount currency ID.
     *
     * @return the line item gross price trade allowance charge actual amount currency ID
     */
    String[][] getLineItemGrossPriceTradeAllowanceChargeActualAmountCurrencyID();
    
    /**
     * Gets the line item gross price trade allowance charge reason.
     *
     * @return the line item gross price trade allowance charge reason
     */
    String[][] getLineItemGrossPriceTradeAllowanceChargeReason();
    
    /**
     * Gets the line item net price charge amount.
     *
     * @return the line item net price charge amount
     */
    String[] getLineItemNetPriceChargeAmount();
    
    /**
     * Gets the line item net price charge amount currency ID.
     *
     * @return the line item net price charge amount currency ID
     */
    String[] getLineItemNetPriceChargeAmountCurrencyID();
    
    /**
     * Gets the line item net price basis quantity.
     *
     * @return the line item net price basis quantity
     */
    String[] getLineItemNetPriceBasisQuantity();
    
    /**
     * Gets the line item net price basis quantity code.
     *
     * @return the line item net price basis quantity code
     */
    String[] getLineItemNetPriceBasisQuantityCode();
    
    /**
     * Gets the line item settlement tax type code.
     *
     * @return the line item settlement tax type code
     */
    String[][] getLineItemSettlementTaxTypeCode();
    
    /**
     * Gets the line item settlement tax exemption reason.
     *
     * @return the line item settlement tax exemption reason
     */
    String[][] getLineItemSettlementTaxExemptionReason();
    
    /**
     * Gets the line item settlement tax category code.
     *
     * @return the line item settlement tax category code
     */
    String[][] getLineItemSettlementTaxCategoryCode();
    
    /**
     * Gets the line item settlement tax applicable percent.
     *
     * @return the line item settlement tax applicable percent
     */
    String[][] getLineItemSettlementTaxApplicablePercent();
    
    /**
     * Gets the line item line total amount.
     *
     * @return the line item line total amount
     */
    String[] getLineItemLineTotalAmount();
    
    /**
     * Gets the line item line total amount currency ID.
     *
     * @return the line item line total amount currency ID
     */
    String[] getLineItemLineTotalAmountCurrencyID();
    
    /**
     * Gets the line item specified trade product global ID.
     *
     * @return the line item specified trade product global ID
     */
    String[] getLineItemSpecifiedTradeProductGlobalID();
    
    /**
     * Gets the line item specified trade product scheme ID.
     *
     * @return the line item specified trade product scheme ID
     */
    String[] getLineItemSpecifiedTradeProductSchemeID();
    
    /**
     * Gets the line item specified trade product seller assigned ID.
     *
     * @return the line item specified trade product seller assigned ID
     */
    String[] getLineItemSpecifiedTradeProductSellerAssignedID();
    
    /**
     * Gets the line item specified trade product buyer assigned ID.
     *
     * @return the line item specified trade product buyer assigned ID
     */
    String[] getLineItemSpecifiedTradeProductBuyerAssignedID();
    
    /**
     * Gets the line item specified trade product description.
     *
     * @return the line item specified trade product description
     */
    String[] getLineItemSpecifiedTradeProductDescription();
}
