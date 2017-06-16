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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This implementation of the BasicProfile contains member-variables that store
 * all the data needed to create an XML attachment for a ZUGFeRD invoice that
 * conforms with the Comfort profile.
 */
public class ComfortProfileImp extends BasicProfileImp implements IComfortProfile {

    /** The notes codes. */
    protected List<String> notesCodes = new ArrayList<String>();
    
    /** The buyer reference. */
    protected String buyerReference;
    
    /** The seller ID. */
    protected String sellerID;
    
    /** The seller global ID. */
    protected List<String> sellerGlobalID = new ArrayList<String>();
    
    /** The seller global scheme ID. */
    protected List<String> sellerGlobalSchemeID = new ArrayList<String>();
    
    /** The buyer ID. */
    protected String buyerID;
    
    /** The buyer global ID. */
    protected List<String> buyerGlobalID = new ArrayList<String>();
    
    /** The buyer global scheme ID. */
    protected List<String> buyerGlobalSchemeID = new ArrayList<String>();
    
    /** The buyer order referenced document issue date time. */
    protected Date buyerOrderReferencedDocumentIssueDateTime;
    
    /** The buyer order referenced document issue date time format. */
    protected String buyerOrderReferencedDocumentIssueDateTimeFormat;
    
    /** The buyer order referenced document ID. */
    protected String buyerOrderReferencedDocumentID;
    
    /** The contract referenced document issue date time. */
    protected Date contractReferencedDocumentIssueDateTime;
    
    /** The contract referenced document issue date time format. */
    protected String contractReferencedDocumentIssueDateTimeFormat;
    
    /** The contract referenced document ID. */
    protected String contractReferencedDocumentID;
    
    /** The customer order referenced document issue date time. */
    protected Date customerOrderReferencedDocumentIssueDateTime;
    
    /** The customer order referenced document issue date time format. */
    protected String customerOrderReferencedDocumentIssueDateTimeFormat;
    
    /** The customer order referenced document ID. */
    protected String customerOrderReferencedDocumentID;
    
    /** The delivery note referenced document issue date time. */
    protected Date deliveryNoteReferencedDocumentIssueDateTime;
    
    /** The delivery note referenced document issue date time format. */
    protected String deliveryNoteReferencedDocumentIssueDateTimeFormat;
    
    /** The delivery note referenced document ID. */
    protected String deliveryNoteReferencedDocumentID;
    
    /** The invoicee ID. */
    protected String invoiceeID;
    
    /** The invoicee global ID. */
    protected List<String> invoiceeGlobalID = new ArrayList<String>();
    
    /** The invoicee global scheme ID. */
    protected List<String> invoiceeGlobalSchemeID = new ArrayList<String>();
    
    /** The invoicee name. */
    protected String invoiceeName;
    
    /** The invoicee postcode. */
    protected String invoiceePostcode;
    
    /** The invoicee line one. */
    protected String invoiceeLineOne;
    
    /** The invoicee line two. */
    protected String invoiceeLineTwo;
    
    /** The invoicee city name. */
    protected String invoiceeCityName;
    
    /** The invoicee country ID. */
    protected String invoiceeCountryID;
    
    /** The invoicee tax registration ID. */
    protected List<String> invoiceeTaxRegistrationID = new ArrayList<String>();
    
    /** The invoicee tax registration scheme ID. */
    protected List<String> invoiceeTaxRegistrationSchemeID = new ArrayList<String>();
    
    /** The payment means type code. */
    protected List<String> paymentMeansTypeCode = new ArrayList<String>();
    
    /** The payment means information. */
    protected List<String[]> paymentMeansInformation = new ArrayList<String[]>();
    
    /** The payment means payer account IBAN. */
    protected List<String> paymentMeansPayerAccountIBAN = new ArrayList<String>();
    
    /** The payment means payer account proprietary ID. */
    protected List<String> paymentMeansPayerAccountProprietaryID = new ArrayList<String>();
    
    /** The payment means payer financial institution BIC. */
    protected List<String> paymentMeansPayerFinancialInstitutionBIC = new ArrayList<String>();
    
    /** The payment means payer financial institution german bankleitzahl ID. */
    protected List<String> paymentMeansPayerFinancialInstitutionGermanBankleitzahlID = new ArrayList<String>();
    
    /** The payment means payer financial institution name. */
    protected List<String> paymentMeansPayerFinancialInstitutionName = new ArrayList<String>();
    
    /** The tax exemption reason. */
    protected List<String> taxExemptionReason = new ArrayList<String>();
    
    /** The tax category code. */
    protected List<String> taxCategoryCode = new ArrayList<String>();
    
    /** The billing start date time. */
    protected Date billingStartDateTime;
    
    /** The billing start date time format. */
    protected String billingStartDateTimeFormat;
    
    /** The billing end date time. */
    protected Date billingEndDateTime;
    
    /** The billing end date time format. */
    protected String billingEndDateTimeFormat;
    
    /** The trade allowance charge indicator. */
    protected List<Boolean> tradeAllowanceChargeIndicator = new ArrayList<Boolean>();
    
    /** The trade allowance charge actual amount. */
    protected List<String> tradeAllowanceChargeActualAmount = new ArrayList<String>();
    
    /** The trade allowance charge actual amount currency. */
    protected List<String> tradeAllowanceChargeActualAmountCurrency = new ArrayList<String>();
    
    /** The trade allowance charge reason. */
    protected List<String> tradeAllowanceChargeReason = new ArrayList<String>();
    
    /** The trade allowance charge tax type code. */
    protected List<String[]> tradeAllowanceChargeTaxTypeCode = new ArrayList<String[]>();
    
    /** The trade allowance charge tax category code. */
    protected List<String[]> tradeAllowanceChargeTaxCategoryCode = new ArrayList<String[]>();
    
    /** The trade allowance charge tax applicable percent. */
    protected List<String[]> tradeAllowanceChargeTaxApplicablePercent = new ArrayList<String[]>();
    
    /** The logistics service charge description. */
    protected List<String[]> logisticsServiceChargeDescription = new ArrayList<String[]>();
    
    /** The logistics service charge amount. */
    protected List<String> logisticsServiceChargeAmount = new ArrayList<String>();
    
    /** The logistics service charge amount currency. */
    protected List<String> logisticsServiceChargeAmountCurrency = new ArrayList<String>();
    
    /** The logistics service charge tax type code. */
    protected List<String[]> logisticsServiceChargeTaxTypeCode = new ArrayList<String[]>();
    
    /** The logistics service charge tax category code. */
    protected List<String[]> logisticsServiceChargeTaxCategoryCode = new ArrayList<String[]>();
    
    /** The logistics service charge tax applicable percent. */
    protected List<String[]> logisticsServiceChargeTaxApplicablePercent = new ArrayList<String[]>();
    
    /** The trade payment terms information. */
    protected List<String[]> tradePaymentTermsInformation = new ArrayList<String[]>();
    
    /** The trade payment terms due date time. */
    protected List<Date> tradePaymentTermsDueDateTime = new ArrayList<Date>();
    
    /** The trade payment terms due date time format. */
    protected List<String> tradePaymentTermsDueDateTimeFormat = new ArrayList<String>();
    
    /** The total prepaid amount. */
    protected String totalPrepaidAmount;
    
    /** The total prepaid amount currency ID. */
    protected String totalPrepaidAmountCurrencyID;
    
    /** The due payable amount. */
    protected String duePayableAmount;
    
    /** The due payable amount currency ID. */
    protected String duePayableAmountCurrencyID;
    
    /** The line item line ID. */
    protected List<String> lineItemLineID = new ArrayList<String>();
    
    /** The line item included note. */
    protected List<String[][]> lineItemIncludedNote = new ArrayList<String[][]>();
    
    /** The line item gross price charge amount. */
    protected List<String> lineItemGrossPriceChargeAmount = new ArrayList<String>();
    
    /** The line item gross price charge amount currency ID. */
    protected List<String> lineItemGrossPriceChargeAmountCurrencyID = new ArrayList<String>();
    
    /** The line item gross price basis quantity. */
    protected List<String> lineItemGrossPriceBasisQuantity = new ArrayList<String>();
    
    /** The line item gross price basis quantity code. */
    protected List<String> lineItemGrossPriceBasisQuantityCode = new ArrayList<String>();
    
    /** The line item gross price trade allowance charge indicator. */
    protected List<boolean[]> lineItemGrossPriceTradeAllowanceChargeIndicator = new ArrayList<boolean[]>();
    
    /** The line item gross price trade allowance charge actual amount. */
    protected List<String[]> lineItemGrossPriceTradeAllowanceChargeActualAmount = new ArrayList<String[]>();
    
    /** The line item gross price trade allowance charge actual amount currency ID. */
    protected List<String[]> lineItemGrossPriceTradeAllowanceChargeActualAmountCurrencyID = new ArrayList<String[]>();
    
    /** The line item gross price trade allowance charge reason. */
    protected List<String[]> lineItemGrossPriceTradeAllowanceChargeReason = new ArrayList<String[]>();
    
    /** The line item net price charge amount. */
    protected List<String> lineItemNetPriceChargeAmount = new ArrayList<String>();
    
    /** The line item net price charge amount currency ID. */
    protected List<String> lineItemNetPriceChargeAmountCurrencyID = new ArrayList<String>();
    
    /** The line item net price basis quantity. */
    protected List<String> lineItemNetPriceBasisQuantity = new ArrayList<String>();
    
    /** The line item net price basis quantity code. */
    protected List<String> lineItemNetPriceBasisQuantityCode = new ArrayList<String>();
    
    /** The line item settlement tax type code. */
    protected List<String[]> lineItemSettlementTaxTypeCode = new ArrayList<String[]>();
    
    /** The line item settlement tax exemption reason. */
    protected List<String[]> lineItemSettlementTaxExemptionReason = new ArrayList<String[]>();
    
    /** The line item settlement tax category code. */
    protected List<String[]> lineItemSettlementTaxCategoryCode = new ArrayList<String[]>();
    
    /** The line item settlement tax applicable percent. */
    protected List<String[]> lineItemSettlementTaxApplicablePercent = new ArrayList<String[]>();
    
    /** The line item line total amount. */
    protected List<String> lineItemLineTotalAmount = new ArrayList<String>();
    
    /** The line item line total amount currency ID. */
    protected List<String> lineItemLineTotalAmountCurrencyID = new ArrayList<String>();
    
    /** The line item specified trade product global ID. */
    protected List<String> lineItemSpecifiedTradeProductGlobalID = new ArrayList<String>();
    
    /** The line item specified trade product scheme ID. */
    protected List<String> lineItemSpecifiedTradeProductSchemeID = new ArrayList<String>();
    
    /** The line item specified trade product seller assigned ID. */
    protected List<String> lineItemSpecifiedTradeProductSellerAssignedID = new ArrayList<String>();
    
    /** The line item specified trade product buyer assigned ID. */
    protected List<String> lineItemSpecifiedTradeProductBuyerAssignedID = new ArrayList<String>();
    
    /** The line item specified trade product description. */
    protected List<String> lineItemSpecifiedTradeProductDescription = new ArrayList<String>();

    /**
     * Creates a new {@link ComfortProfileImp} instance.
     *
     * @param testIndicator the parameter that determines whether a test invoice is going to be created.
     *                      The test indicator can be used when implementing a newly developed system. It is to mark the
     *                      invoice as a "test" and thus not leading to vat issues.
     */
    public ComfortProfileImp(boolean testIndicator) {
        super(testIndicator);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getNotesCodes()
     */
    public String[] getNotesCodes() {
        return to1DArray(notesCodes);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBuyerReference()
     */
    public String getBuyerReference() {
        return buyerReference;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSellerID()
     */
    public String getSellerID() {
        return sellerID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSellerGlobalID()
     */
    public String[] getSellerGlobalID() {
        return to1DArray(sellerGlobalID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSellerGlobalSchemeID()
     */
    public String[] getSellerGlobalSchemeID() {
        return to1DArray(sellerGlobalSchemeID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBuyerID()
     */
    public String getBuyerID() {
        return buyerID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBuyerGlobalID()
     */
    public String[] getBuyerGlobalID() {
        return to1DArray(buyerGlobalID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBuyerGlobalSchemeID()
     */
    public String[] getBuyerGlobalSchemeID() {
        return to1DArray(buyerGlobalSchemeID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBuyerOrderReferencedDocumentIssueDateTime()
     */
    public Date getBuyerOrderReferencedDocumentIssueDateTime() {
        return buyerOrderReferencedDocumentIssueDateTime;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBuyerOrderReferencedDocumentIssueDateTimeFormat()
     */
    public String getBuyerOrderReferencedDocumentIssueDateTimeFormat() {
        return buyerOrderReferencedDocumentIssueDateTimeFormat;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBuyerOrderReferencedDocumentID()
     */
    public String getBuyerOrderReferencedDocumentID() {
        return buyerOrderReferencedDocumentID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getContractReferencedDocumentIssueDateTime()
     */
    public Date getContractReferencedDocumentIssueDateTime() {
        return contractReferencedDocumentIssueDateTime;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getContractReferencedDocumentIssueDateTimeFormat()
     */
    public String getContractReferencedDocumentIssueDateTimeFormat() {
        return contractReferencedDocumentIssueDateTimeFormat;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getContractReferencedDocumentID()
     */
    public String getContractReferencedDocumentID() {
        return contractReferencedDocumentID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getCustomerOrderReferencedDocumentIssueDateTime()
     */
    public Date getCustomerOrderReferencedDocumentIssueDateTime() {
        return customerOrderReferencedDocumentIssueDateTime;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getCustomerOrderReferencedDocumentIssueDateTimeFormat()
     */
    public String getCustomerOrderReferencedDocumentIssueDateTimeFormat() {
        return customerOrderReferencedDocumentIssueDateTimeFormat;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getCustomerOrderReferencedDocumentID()
     */
    public String getCustomerOrderReferencedDocumentID() {
        return customerOrderReferencedDocumentID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getDeliveryNoteReferencedDocumentIssueDateTime()
     */
    public Date getDeliveryNoteReferencedDocumentIssueDateTime() {
        return deliveryNoteReferencedDocumentIssueDateTime;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getDeliveryNoteReferencedDocumentIssueDateTimeFormat()
     */
    public String getDeliveryNoteReferencedDocumentIssueDateTimeFormat() {
        return deliveryNoteReferencedDocumentIssueDateTimeFormat;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getDeliveryNoteReferencedDocumentID()
     */
    public String getDeliveryNoteReferencedDocumentID() {
        return deliveryNoteReferencedDocumentID;
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceeID()
     */
    public String getInvoiceeID() {
        return invoiceeID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceeGlobalID()
     */
    public String[] getInvoiceeGlobalID() {
        return to1DArray(invoiceeGlobalID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceeGlobalSchemeID()
     */
    public String[] getInvoiceeGlobalSchemeID() {
        return to1DArray(invoiceeGlobalSchemeID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceeName()
     */
    public String getInvoiceeName() {
        return invoiceeName;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceePostcode()
     */
    public String getInvoiceePostcode() {
        return invoiceePostcode;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceeLineOne()
     */
    public String getInvoiceeLineOne() {
        return invoiceeLineOne;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceeLineTwo()
     */
    public String getInvoiceeLineTwo() {
        return invoiceeLineTwo;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceeCityName()
     */
    public String getInvoiceeCityName() {
        return invoiceeCityName;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceeCountryID()
     */
    public String getInvoiceeCountryID() {
        return invoiceeCountryID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceeTaxRegistrationID()
     */
    public String[] getInvoiceeTaxRegistrationID() {
        return to1DArray(invoiceeTaxRegistrationID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getInvoiceeTaxRegistrationSchemeID()
     */
    public String[] getInvoiceeTaxRegistrationSchemeID() {
        return to1DArray(invoiceeTaxRegistrationSchemeID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getPaymentMeansTypeCode()
     */
    public String[] getPaymentMeansTypeCode() {
        return to1DArray(paymentMeansTypeCode);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getPaymentMeansInformation()
     */
    public String[][] getPaymentMeansInformation() {
        return to2DArray(paymentMeansInformation);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getPaymentMeansPayerAccountIBAN()
     */
    public String[] getPaymentMeansPayerAccountIBAN() {
        return to1DArray(paymentMeansPayerAccountIBAN);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getPaymentMeansPayerAccountProprietaryID()
     */
    public String[] getPaymentMeansPayerAccountProprietaryID() {
        return to1DArray(paymentMeansPayerAccountProprietaryID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getPaymentMeansPayerFinancialInstitutionBIC()
     */
    public String[] getPaymentMeansPayerFinancialInstitutionBIC() {
        return to1DArray(paymentMeansPayerFinancialInstitutionBIC);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getPaymentMeansPayerFinancialInstitutionGermanBankleitzahlID()
     */
    public String[] getPaymentMeansPayerFinancialInstitutionGermanBankleitzahlID() {
        return to1DArray(paymentMeansPayerFinancialInstitutionGermanBankleitzahlID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getPaymentMeansPayerFinancialInstitutionName()
     */
    public String[] getPaymentMeansPayerFinancialInstitutionName() {
        return to1DArray(paymentMeansPayerFinancialInstitutionName);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getTaxExemptionReason()
     */
    public String[] getTaxExemptionReason() {
        return to1DArray(taxExemptionReason);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getTaxCategoryCode()
     */
    public String[] getTaxCategoryCode() {
        return to1DArray(taxCategoryCode);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBillingStartDateTime()
     */
    public Date getBillingStartDateTime() {
        return billingStartDateTime;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBillingStartDateTimeFormat()
     */
    public String getBillingStartDateTimeFormat() {
        return billingStartDateTimeFormat;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBillingEndDateTime()
     */
    public Date getBillingEndDateTime() {
        return billingEndDateTime;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getBillingEndDateTimeFormat()
     */
    public String getBillingEndDateTimeFormat() {
        return billingEndDateTimeFormat;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedTradeAllowanceChargeIndicator()
     */
    public boolean[] getSpecifiedTradeAllowanceChargeIndicator() {
        return to1DArrayB(tradeAllowanceChargeIndicator);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedTradeAllowanceChargeActualAmount()
     */
    public String[] getSpecifiedTradeAllowanceChargeActualAmount() {
        return to1DArray(tradeAllowanceChargeActualAmount);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedTradeAllowanceChargeActualAmountCurrency()
     */
    public String[] getSpecifiedTradeAllowanceChargeActualAmountCurrency() {
        return to1DArray(tradeAllowanceChargeActualAmountCurrency);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedTradeAllowanceChargeReason()
     */
    public String[] getSpecifiedTradeAllowanceChargeReason() {
        return to1DArray(tradeAllowanceChargeReason);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedTradeAllowanceChargeTaxTypeCode()
     */
    public String[][] getSpecifiedTradeAllowanceChargeTaxTypeCode() {
        return to2DArray(tradeAllowanceChargeTaxTypeCode);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedTradeAllowanceChargeTaxCategoryCode()
     */
    public String[][] getSpecifiedTradeAllowanceChargeTaxCategoryCode() {
        return to2DArray(tradeAllowanceChargeTaxCategoryCode);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedTradeAllowanceChargeTaxApplicablePercent()
     */
    public String[][] getSpecifiedTradeAllowanceChargeTaxApplicablePercent() {
        return to2DArray(tradeAllowanceChargeTaxApplicablePercent);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedLogisticsServiceChargeDescription()
     */
    public String[][] getSpecifiedLogisticsServiceChargeDescription() {
        return to2DArray(logisticsServiceChargeDescription);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedLogisticsServiceChargeAmount()
     */
    public String[] getSpecifiedLogisticsServiceChargeAmount() {
        return to1DArray(logisticsServiceChargeAmount);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedLogisticsServiceChargeAmountCurrency()
     */
    public String[] getSpecifiedLogisticsServiceChargeAmountCurrency() {
        return to1DArray(logisticsServiceChargeAmountCurrency);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedLogisticsServiceChargeTaxTypeCode()
     */
    public String[][] getSpecifiedLogisticsServiceChargeTaxTypeCode() {
        return to2DArray(logisticsServiceChargeTaxTypeCode);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedLogisticsServiceChargeTaxCategoryCode()
     */
    public String[][] getSpecifiedLogisticsServiceChargeTaxCategoryCode() {
        return to2DArray(logisticsServiceChargeTaxCategoryCode);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedLogisticsServiceChargeTaxApplicablePercent()
     */
    public String[][] getSpecifiedLogisticsServiceChargeTaxApplicablePercent() {
        return to2DArray(logisticsServiceChargeTaxApplicablePercent);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedTradePaymentTermsDescription()
     */
    public String[][] getSpecifiedTradePaymentTermsDescription() {
        return to2DArray(tradePaymentTermsInformation);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedTradePaymentTermsDueDateTime()
     */
    public Date[] getSpecifiedTradePaymentTermsDueDateTime() {
        return (Date[]) tradePaymentTermsDueDateTime.toArray(new Date[tradePaymentTermsDueDateTime.size()]);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getSpecifiedTradePaymentTermsDueDateTimeFormat()
     */
    public String[] getSpecifiedTradePaymentTermsDueDateTimeFormat() {
        return to1DArray(tradePaymentTermsDueDateTimeFormat);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getTotalPrepaidAmount()
     */
    public String getTotalPrepaidAmount() {
        return totalPrepaidAmount;
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getTotalPrepaidAmountCurrencyID()
     */
    public String getTotalPrepaidAmountCurrencyID() {
        return totalPrepaidAmountCurrencyID;
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getDuePayableAmount()
     */
    public String getDuePayableAmount() {
        return duePayableAmount;
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getDuePayableAmountCurrencyID()
     */
    public String getDuePayableAmountCurrencyID() {
        return duePayableAmountCurrencyID;
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemLineID()
     */
    public String[] getLineItemLineID() {
        return to1DArray(lineItemLineID);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemIncludedNote()
     */
    public String[][][] getLineItemIncludedNote() {
        return to3DArray(lineItemIncludedNote);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemGrossPriceChargeAmount()
     */
    public String[] getLineItemGrossPriceChargeAmount() {
        return to1DArray(lineItemGrossPriceChargeAmount);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemGrossPriceChargeAmountCurrencyID()
     */
    public String[] getLineItemGrossPriceChargeAmountCurrencyID() {
        return to1DArray(lineItemGrossPriceChargeAmountCurrencyID);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemGrossPriceBasisQuantity()
     */
    public String[] getLineItemGrossPriceBasisQuantity() {
        return to1DArray(lineItemGrossPriceBasisQuantity);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemGrossPriceBasisQuantityCode()
     */
    public String[] getLineItemGrossPriceBasisQuantityCode() {
        return to1DArray(lineItemGrossPriceBasisQuantityCode);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemGrossPriceTradeAllowanceChargeIndicator()
     */
    public boolean[][] getLineItemGrossPriceTradeAllowanceChargeIndicator() {
        return to2DArrayB(lineItemGrossPriceTradeAllowanceChargeIndicator);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemGrossPriceTradeAllowanceChargeActualAmount()
     */
    public String[][] getLineItemGrossPriceTradeAllowanceChargeActualAmount() {
        return to2DArray(lineItemGrossPriceTradeAllowanceChargeActualAmount);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemGrossPriceTradeAllowanceChargeActualAmountCurrencyID()
     */
    public String[][] getLineItemGrossPriceTradeAllowanceChargeActualAmountCurrencyID() {
        return to2DArray(lineItemGrossPriceTradeAllowanceChargeActualAmountCurrencyID);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemGrossPriceTradeAllowanceChargeReason()
     */
    public String[][] getLineItemGrossPriceTradeAllowanceChargeReason() {
        return to2DArray(lineItemGrossPriceTradeAllowanceChargeReason);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemNetPriceChargeAmount()
     */
    public String[] getLineItemNetPriceChargeAmount() {
        return to1DArray(lineItemNetPriceChargeAmount);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemNetPriceChargeAmountCurrencyID()
     */
    public String[] getLineItemNetPriceChargeAmountCurrencyID() {
        return to1DArray(lineItemNetPriceChargeAmountCurrencyID);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemNetPriceBasisQuantity()
     */
    public String[] getLineItemNetPriceBasisQuantity() {
        return to1DArray(lineItemNetPriceBasisQuantity);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemNetPriceBasisQuantityCode()
     */
    public String[] getLineItemNetPriceBasisQuantityCode() {
        return to1DArray(lineItemNetPriceBasisQuantityCode);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemSettlementTaxTypeCode()
     */
    public String[][] getLineItemSettlementTaxTypeCode() {
        return to2DArray(lineItemSettlementTaxTypeCode);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemSettlementTaxExemptionReason()
     */
    public String[][] getLineItemSettlementTaxExemptionReason() {
        return to2DArray(lineItemSettlementTaxExemptionReason);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemSettlementTaxCategoryCode()
     */
    public String[][] getLineItemSettlementTaxCategoryCode() {
        return to2DArray(lineItemSettlementTaxCategoryCode);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemSettlementTaxApplicablePercent()
     */
    public String[][] getLineItemSettlementTaxApplicablePercent() {
        return to2DArray(lineItemSettlementTaxApplicablePercent);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemLineTotalAmount()
     */
    public String[] getLineItemLineTotalAmount() {
        return to1DArray(lineItemLineTotalAmount);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemLineTotalAmountCurrencyID()
     */
    public String[] getLineItemLineTotalAmountCurrencyID() {
        return to1DArray(lineItemLineTotalAmountCurrencyID);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemSpecifiedTradeProductGlobalID()
     */
    public String[] getLineItemSpecifiedTradeProductGlobalID() {
        return to1DArray(lineItemSpecifiedTradeProductGlobalID);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemSpecifiedTradeProductSchemeID()
     */
    public String[] getLineItemSpecifiedTradeProductSchemeID() {
        return to1DArray(lineItemSpecifiedTradeProductSchemeID);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemSpecifiedTradeProductSellerAssignedID()
     */
    public String[] getLineItemSpecifiedTradeProductSellerAssignedID() {
        return to1DArray(lineItemSpecifiedTradeProductSellerAssignedID);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemSpecifiedTradeProductBuyerAssignedID()
     */
    public String[] getLineItemSpecifiedTradeProductBuyerAssignedID() {
        return to1DArray(lineItemSpecifiedTradeProductBuyerAssignedID);
    }
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IComfortProfile#getLineItemSpecifiedTradeProductDescription()
     */
    public String[] getLineItemSpecifiedTradeProductDescription() {
        return to1DArray(lineItemSpecifiedTradeProductDescription);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.BasicProfileImp#addNote(java.lang.String[])
     */
    @Override
    public void addNote(String[] note) {
        throw new UnsupportedOperationException("This method can only be used for the BASIC level.");
    }

    /**
     * Adds the note.
     *
     * @param note the note
     * @param code the code
     */
    public void addNote(String[] note, String code) {
        notes.add(note);
        notesCodes.add(code);
    }

    /**
     * Sets the buyer reference.
     *
     * @param buyerReference the new buyer reference
     */
    public void setBuyerReference(String buyerReference) {
        this.buyerReference = buyerReference;
    }

    /**
     * Sets the seller ID.
     *
     * @param sellerID the new seller ID
     */
    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    /**
     * Adds the seller global ID.
     *
     * @param sellerGlobalSchemeID the seller global scheme ID
     * @param sellerGlobalID the seller global ID
     */
    public void addSellerGlobalID(String sellerGlobalSchemeID, String sellerGlobalID) {
        this.sellerGlobalID.add(sellerGlobalID);
        this.sellerGlobalSchemeID.add(sellerGlobalSchemeID);
    }

    /**
     * Sets the buyer ID.
     *
     * @param buyerID the new buyer ID
     */
    public void setBuyerID(String buyerID) {
        this.buyerID = buyerID;
    }

    /**
     * Adds the buyer global ID.
     *
     * @param buyerGlobalSchemeID the buyer global scheme ID
     * @param buyerGlobalID the buyer global ID
     */
    public void addBuyerGlobalID(String buyerGlobalSchemeID, String buyerGlobalID) {
        this.buyerGlobalID.add(buyerGlobalID);
        this.buyerGlobalSchemeID.add(buyerGlobalSchemeID);
    }

    /**
     * Sets the buyer order referenced document issue date time.
     *
     * @param buyerOrderReferencedDocumentIssueDateTime the buyer order referenced document issue date time
     * @param buyerOrderReferencedDocumentIssueDateTimeFormat the buyer order referenced document issue date time format
     */
    public void setBuyerOrderReferencedDocumentIssueDateTime(Date buyerOrderReferencedDocumentIssueDateTime, String buyerOrderReferencedDocumentIssueDateTimeFormat) {
        this.buyerOrderReferencedDocumentIssueDateTime = buyerOrderReferencedDocumentIssueDateTime;
        this.buyerOrderReferencedDocumentIssueDateTimeFormat = buyerOrderReferencedDocumentIssueDateTimeFormat;
    }

    /**
     * Sets the buyer order referenced document ID.
     *
     * @param buyerOrderReferencedDocumentID the new buyer order referenced document ID
     */
    public void setBuyerOrderReferencedDocumentID(String buyerOrderReferencedDocumentID) {
        this.buyerOrderReferencedDocumentID = buyerOrderReferencedDocumentID;
    }

    /**
     * Sets the contract referenced document issue date time.
     *
     * @param contractReferencedDocumentIssueDateTime the contract referenced document issue date time
     * @param contractReferencedDocumentIssueDateTimeFormat the contract referenced document issue date time format
     */
    public void setContractReferencedDocumentIssueDateTime(Date contractReferencedDocumentIssueDateTime, String contractReferencedDocumentIssueDateTimeFormat) {
        this.contractReferencedDocumentIssueDateTime = contractReferencedDocumentIssueDateTime;
        this.contractReferencedDocumentIssueDateTimeFormat = contractReferencedDocumentIssueDateTimeFormat;
    }

    /**
     * Sets the contract referenced document ID.
     *
     * @param contractReferencedDocumentID the new contract referenced document ID
     */
    public void setContractReferencedDocumentID(String contractReferencedDocumentID) {
        this.contractReferencedDocumentID = contractReferencedDocumentID;
    }

    /**
     * Sets the customer order referenced document issue date time.
     *
     * @param customerOrderReferencedDocumentIssueDateTime the customer order referenced document issue date time
     * @param customerOrderReferencedDocumentIssueDateTimeFormat the customer order referenced document issue date time format
     */
    public void setCustomerOrderReferencedDocumentIssueDateTime(Date customerOrderReferencedDocumentIssueDateTime, String customerOrderReferencedDocumentIssueDateTimeFormat) {
        this.customerOrderReferencedDocumentIssueDateTime = customerOrderReferencedDocumentIssueDateTime;
        this.customerOrderReferencedDocumentIssueDateTimeFormat = customerOrderReferencedDocumentIssueDateTimeFormat;
    }

    /**
     * Sets the customer order referenced document ID.
     *
     * @param customerOrderReferencedDocumentID the new customer order referenced document ID
     */
    public void setCustomerOrderReferencedDocumentID(String customerOrderReferencedDocumentID) {
        this.customerOrderReferencedDocumentID = customerOrderReferencedDocumentID;
    }

    /**
     * Sets the delivery note referenced document issue date time.
     *
     * @param deliveryNoteReferencedDocumentIssueDateTime the delivery note referenced document issue date time
     * @param deliveryNoteReferencedDocumentIssueDateTimeFormat the delivery note referenced document issue date time format
     */
    public void setDeliveryNoteReferencedDocumentIssueDateTime(Date deliveryNoteReferencedDocumentIssueDateTime, String deliveryNoteReferencedDocumentIssueDateTimeFormat) {
        this.deliveryNoteReferencedDocumentIssueDateTime = deliveryNoteReferencedDocumentIssueDateTime;
        this.deliveryNoteReferencedDocumentIssueDateTimeFormat = deliveryNoteReferencedDocumentIssueDateTimeFormat;
    }

    /**
     * Sets the delivery note referenced document ID.
     *
     * @param deliveryNoteReferencedDocumentID the new delivery note referenced document ID
     */
    public void setDeliveryNoteReferencedDocumentID(String deliveryNoteReferencedDocumentID) {
        this.deliveryNoteReferencedDocumentID = deliveryNoteReferencedDocumentID;
    }
    
    /**
     * Sets the invoicee ID.
     *
     * @param invoiceeID the new invoicee ID
     */
    public void setInvoiceeID(String invoiceeID) {
        this.invoiceeID = invoiceeID;
    }

    /**
     * Adds the invoicee global ID.
     *
     * @param invoiceeGlobalSchemeID the invoicee global scheme ID
     * @param invoiceeGlobalID the invoicee global ID
     */
    public void addInvoiceeGlobalID(String invoiceeGlobalSchemeID, String invoiceeGlobalID) {
        this.invoiceeGlobalSchemeID.add(invoiceeGlobalSchemeID);
        this.invoiceeGlobalID.add(invoiceeGlobalID);
    }

    /**
     * Sets the invoicee name.
     *
     * @param invoiceeName the new invoicee name
     */
    public void setInvoiceeName(String invoiceeName) {
        this.invoiceeName = invoiceeName;
    }

    /**
     * Sets the invoicee postcode.
     *
     * @param invoiceePostcode the new invoicee postcode
     */
    public void setInvoiceePostcode(String invoiceePostcode) {
        this.invoiceePostcode = invoiceePostcode;
    }

    /**
     * Sets the invoicee line one.
     *
     * @param invoiceeLineOne the new invoicee line one
     */
    public void setInvoiceeLineOne(String invoiceeLineOne) {
        this.invoiceeLineOne = invoiceeLineOne;
    }

    /**
     * Sets the invoicee line two.
     *
     * @param invoiceeLineTwo the new invoicee line two
     */
    public void setInvoiceeLineTwo(String invoiceeLineTwo) {
        this.invoiceeLineTwo = invoiceeLineTwo;
    }

    /**
     * Sets the invoicee city name.
     *
     * @param invoiceeCityName the new invoicee city name
     */
    public void setInvoiceeCityName(String invoiceeCityName) {
        this.invoiceeCityName = invoiceeCityName;
    }

    /**
     * Sets the invoicee country ID.
     *
     * @param invoiceeCountryID the new invoicee country ID
     */
    public void setInvoiceeCountryID(String invoiceeCountryID) {
        this.invoiceeCountryID = invoiceeCountryID;
    }

    /**
     * Adds the invoicee tax registration.
     *
     * @param schemeID the scheme ID
     * @param taxId the tax id
     */
    public void addInvoiceeTaxRegistration(String schemeID, String taxId) {
        invoiceeTaxRegistrationSchemeID.add(schemeID);
        invoiceeTaxRegistrationID.add(taxId);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.BasicProfileImp#addPaymentMeans(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void addPaymentMeans(String schemeAgencyID, String id, String iban, String accountname, String proprietaryID, String bic, String germanBankleitzahlID, String institutionname) {
        throw new UnsupportedOperationException("This method can only be used for the BASIC level.");
    }

    /**
     * Adds the payment means.
     *
     * @param typeCode the type code
     * @param information the information
     * @param schemeAgencyID the scheme agency ID
     * @param id the id
     * @param ibanDebtor the iban debtor
     * @param proprietaryIDDebtor the proprietary ID debtor
     * @param ibanCreditor the iban creditor
     * @param accountnameCreditor the accountname creditor
     * @param proprietaryIDCreditor the proprietary ID creditor
     * @param bicDebtor the bic debtor
     * @param germanBankleitzahlIDDebtor the german bankleitzahl ID debtor
     * @param institutionnameDebtor the institutionname debtor
     * @param bicCreditor the bic creditor
     * @param germanBankleitzahlIDCreditor the german bankleitzahl ID creditor
     * @param institutionnameCreditor the institutionname creditor
     */
    public void addPaymentMeans(
            String typeCode, String[] information,
            String schemeAgencyID, String id,
            String ibanDebtor, String proprietaryIDDebtor,
            String ibanCreditor, String accountnameCreditor, String proprietaryIDCreditor,
            String bicDebtor, String germanBankleitzahlIDDebtor, String institutionnameDebtor,
            String bicCreditor, String germanBankleitzahlIDCreditor, String institutionnameCreditor
    ) {
        paymentMeansTypeCode.add(typeCode);
        paymentMeansInformation.add(information);
        paymentMeansID.add(id);
        paymentMeansSchemeAgencyID.add(schemeAgencyID);
        paymentMeansPayerAccountIBAN.add(ibanDebtor);
        paymentMeansPayerAccountProprietaryID.add(proprietaryIDDebtor);
        paymentMeansPayeeAccountIBAN.add(ibanCreditor);
        paymentMeansPayeeAccountName.add(accountnameCreditor);
        paymentMeansPayeeAccountProprietaryID.add(proprietaryIDCreditor);
        paymentMeansPayerFinancialInstitutionBIC.add(bicDebtor);
        paymentMeansPayerFinancialInstitutionGermanBankleitzahlID.add(germanBankleitzahlIDDebtor);
        paymentMeansPayerFinancialInstitutionName.add(institutionnameDebtor);
        paymentMeansPayeeFinancialInstitutionBIC.add(bicCreditor);
        paymentMeansPayeeFinancialInstitutionGermanBankleitzahlID.add(germanBankleitzahlIDCreditor);
        paymentMeansPayeeFinancialInstitutionName.add(institutionnameCreditor);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.BasicProfileImp#addApplicableTradeTax(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void addApplicableTradeTax(String calculatedAmount, String calculatedAmountCurrencyID, String typeCode,
            String basisAmount, String basisAmountCurrencyID, String applicablePercent) {
        throw new UnsupportedOperationException("This method can only be used for the BASIC level.");
    }

    /**
     * Adds the applicable trade tax.
     *
     * @param calculatedAmount the calculated amount
     * @param calculatedAmountCurrencyID the calculated amount currency ID
     * @param typeCode the type code
     * @param exemptionReason the exemption reason
     * @param basisAmount the basis amount
     * @param basisAmountCurrencyID the basis amount currency ID
     * @param categoryCode the category code
     * @param applicablePercent the applicable percent
     */
    public void addApplicableTradeTax(String calculatedAmount, String calculatedAmountCurrencyID, String typeCode,
            String exemptionReason, String basisAmount, String basisAmountCurrencyID, String categoryCode, String applicablePercent) {
        taxCalculatedAmount.add(calculatedAmount);
        taxCalculatedAmountCurrencyID.add(calculatedAmountCurrencyID);
        taxTypeCode.add(typeCode);
        taxExemptionReason.add(exemptionReason);
        taxBasisAmount.add(basisAmount);
        taxBasisAmountCurrencyID.add(basisAmountCurrencyID);
        taxCategoryCode.add(categoryCode);
        taxApplicablePercent.add(applicablePercent);
    }

    /**
     * Sets the billing start end.
     *
     * @param billingStartDateTime the billing start date time
     * @param billingStartDateTimeFormat the billing start date time format
     * @param billingEndDateTime the billing end date time
     * @param billingEndDateTimeFormat the billing end date time format
     */
    public void setBillingStartEnd(Date billingStartDateTime, String billingStartDateTimeFormat,
            Date billingEndDateTime, String billingEndDateTimeFormat) {
        this.billingStartDateTime = billingStartDateTime;
        this.billingStartDateTimeFormat = billingStartDateTimeFormat;
        this.billingEndDateTime = billingEndDateTime;
        this.billingEndDateTimeFormat = billingEndDateTimeFormat;
    }

    /**
     * Adds the specified trade allowance charge.
     *
     * @param indicator the indicator
     * @param actualAmount the actual amount
     * @param actualAmountCurrency the actual amount currency
     * @param reason the reason
     * @param typeCodes the type codes
     * @param categoryCodes the category codes
     * @param applicablePercent the applicable percent
     */
    public void addSpecifiedTradeAllowanceCharge(boolean indicator, String actualAmount, String actualAmountCurrency,
            String reason, String[] typeCodes, String[] categoryCodes, String[] applicablePercent) {
        this.tradeAllowanceChargeIndicator.add(indicator);
        this.tradeAllowanceChargeActualAmount.add(actualAmount);
        this.tradeAllowanceChargeActualAmountCurrency.add(actualAmountCurrency);
        this.tradeAllowanceChargeReason.add(reason);
        this.tradeAllowanceChargeTaxTypeCode.add(typeCodes);
        this.tradeAllowanceChargeTaxCategoryCode.add(categoryCodes);
        this.tradeAllowanceChargeTaxApplicablePercent.add(applicablePercent);
    }

    /**
     * Adds the specified logistics service charge.
     *
     * @param description the description
     * @param actualAmount the actual amount
     * @param actualAmountCurrency the actual amount currency
     * @param typeCodes the type codes
     * @param categoryCodes the category codes
     * @param applicablePercent the applicable percent
     */
    public void addSpecifiedLogisticsServiceCharge(String[] description, String actualAmount, String actualAmountCurrency,
            String[] typeCodes, String[] categoryCodes, String[] applicablePercent) {
        this.logisticsServiceChargeDescription.add(description);
        this.logisticsServiceChargeAmount.add(actualAmount);
        this.logisticsServiceChargeAmountCurrency.add(actualAmountCurrency);
        this.logisticsServiceChargeTaxTypeCode.add(typeCodes);
        this.logisticsServiceChargeTaxCategoryCode.add(categoryCodes);
        this.logisticsServiceChargeTaxApplicablePercent.add(applicablePercent);
    }

    /**
     * Adds the specified trade payment terms.
     *
     * @param information the information
     * @param dateTime the date time
     * @param dateTimeFormat the date time format
     */
    public void addSpecifiedTradePaymentTerms(String[] information, Date dateTime, String dateTimeFormat) {
        this.tradePaymentTermsInformation.add(information);
        this.tradePaymentTermsDueDateTime.add(dateTime);
        this.tradePaymentTermsDueDateTimeFormat.add(dateTimeFormat);
    }

    /**
     * Sets the total prepaid amount.
     *
     * @param totalPrepaidAmount the total prepaid amount
     * @param totalPrepaidCurrencyID the total prepaid currency ID
     */
    public void setTotalPrepaidAmount(String totalPrepaidAmount, String totalPrepaidCurrencyID) {
        this.totalPrepaidAmount = totalPrepaidAmount;
        this.totalPrepaidAmountCurrencyID = totalPrepaidCurrencyID;
    }
    
    /**
     * Sets the due payable amount.
     *
     * @param duePayableAmount the due payable amount
     * @param duePayableAmountCurrencyID the due payable amount currency ID
     */
    public void setDuePayableAmount(String duePayableAmount, String duePayableAmountCurrencyID) {
        this.duePayableAmount = duePayableAmount;
        this.duePayableAmountCurrencyID = duePayableAmountCurrencyID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.BasicProfileImp#addIncludedSupplyChainTradeLineItem(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void addIncludedSupplyChainTradeLineItem(String billedQuantity, String billedQuantityUnitCode, String specifiedTradeProductName) {
        throw new UnsupportedOperationException("This method can only be used for the BASIC level.");
    }

    /**
     * Adds the included supply chain trade line item.
     *
     * @param id the id
     * @param notes the notes
     * @param grossPriceChargeAmount the gross price charge amount
     * @param grossPriceChargeAmountCurrencyID the gross price charge amount currency ID
     * @param grossPriceBasisQuantity the gross price basis quantity
     * @param grossPriceBasisQuantityCode the gross price basis quantity code
     * @param grossPriceTradeAllowanceChargeIndicator the gross price trade allowance charge indicator
     * @param grossPriceTradeAllowanceChargeActualAmount the gross price trade allowance charge actual amount
     * @param grossPriceTradeAllowanceChargeActualAmountCurrencyID the gross price trade allowance charge actual amount currency ID
     * @param grossPriceTradeAllowanceChargeReason the gross price trade allowance charge reason
     * @param netPriceChargeAmount the net price charge amount
     * @param netPriceChargeAmountCurrencyID the net price charge amount currency ID
     * @param netPriceBasisQuantity the net price basis quantity
     * @param netPriceBasisQuantityCode the net price basis quantity code
     * @param billedQuantity the billed quantity
     * @param billedQuantityUnitCode the billed quantity unit code
     * @param lineItemSettlementTaxTypeCode the line item settlement tax type code
     * @param lineItemSettlementTaxExemptionReason the line item settlement tax exemption reason
     * @param lineItemSettlementTaxCategoryCode the line item settlement tax category code
     * @param lineItemSettlementTaxApplicablePercent the line item settlement tax applicable percent
     * @param lineItemLineTotalAmount the line item line total amount
     * @param lineItemLineTotalAmountCurrencyID the line item line total amount currency ID
     * @param lineItemSpecifiedTradeProductGlobalID the line item specified trade product global ID
     * @param lineItemSpecifiedTradeProductSchemeID the line item specified trade product scheme ID
     * @param lineItemSpecifiedTradeProductSellerAssignedID the line item specified trade product seller assigned ID
     * @param lineItemSpecifiedTradeProductBuyerAssignedID the line item specified trade product buyer assigned ID
     * @param lineItemSpecifiedTradeProductName the line item specified trade product name
     * @param lineItemSpecifiedTradeProductDescription the line item specified trade product description
     */
    public void addIncludedSupplyChainTradeLineItem(String id, String[][] notes,
            String grossPriceChargeAmount, String grossPriceChargeAmountCurrencyID,
            String grossPriceBasisQuantity, String grossPriceBasisQuantityCode,
            boolean[] grossPriceTradeAllowanceChargeIndicator,
            String[] grossPriceTradeAllowanceChargeActualAmount,
            String[] grossPriceTradeAllowanceChargeActualAmountCurrencyID,
            String[] grossPriceTradeAllowanceChargeReason,
            String netPriceChargeAmount, String netPriceChargeAmountCurrencyID,
            String netPriceBasisQuantity, String netPriceBasisQuantityCode,
            String billedQuantity, String billedQuantityUnitCode,
            String[] lineItemSettlementTaxTypeCode,
            String[] lineItemSettlementTaxExemptionReason,
            String[] lineItemSettlementTaxCategoryCode,
            String[] lineItemSettlementTaxApplicablePercent,
            String lineItemLineTotalAmount,
            String lineItemLineTotalAmountCurrencyID,
            String lineItemSpecifiedTradeProductGlobalID,
            String lineItemSpecifiedTradeProductSchemeID,
            String lineItemSpecifiedTradeProductSellerAssignedID,
            String lineItemSpecifiedTradeProductBuyerAssignedID,
            String lineItemSpecifiedTradeProductName,
            String lineItemSpecifiedTradeProductDescription) {
        this.lineItemLineID.add(id);
        this.lineItemIncludedNote.add(notes);
        this.lineItemGrossPriceChargeAmount.add(grossPriceChargeAmount);
        this.lineItemGrossPriceChargeAmountCurrencyID.add(grossPriceChargeAmountCurrencyID);
        this.lineItemGrossPriceBasisQuantity.add(grossPriceBasisQuantity);
        this.lineItemGrossPriceBasisQuantityCode.add(grossPriceBasisQuantityCode);
        this.lineItemGrossPriceTradeAllowanceChargeIndicator.add(grossPriceTradeAllowanceChargeIndicator);
        this.lineItemGrossPriceTradeAllowanceChargeActualAmount.add(grossPriceTradeAllowanceChargeActualAmount);
        this.lineItemGrossPriceTradeAllowanceChargeActualAmountCurrencyID.add(grossPriceTradeAllowanceChargeActualAmountCurrencyID);
        this.lineItemGrossPriceTradeAllowanceChargeReason.add(grossPriceTradeAllowanceChargeReason);
        this.lineItemNetPriceChargeAmount.add(netPriceChargeAmount);
        this.lineItemNetPriceChargeAmountCurrencyID.add(netPriceChargeAmountCurrencyID);
        this.lineItemNetPriceBasisQuantity.add(netPriceBasisQuantity);
        this.lineItemNetPriceBasisQuantityCode.add(netPriceBasisQuantityCode);
        this.lineItemBilledQuantity.add(billedQuantity);
        this.lineItemBilledQuantityUnitCode.add(billedQuantityUnitCode);
        this.lineItemSettlementTaxTypeCode.add(lineItemSettlementTaxTypeCode);
        this.lineItemSettlementTaxExemptionReason.add(lineItemSettlementTaxExemptionReason);
        this.lineItemSettlementTaxCategoryCode.add(lineItemSettlementTaxCategoryCode);
        this.lineItemSettlementTaxApplicablePercent.add(lineItemSettlementTaxApplicablePercent);
        this.lineItemLineTotalAmount.add(lineItemLineTotalAmount);
        this.lineItemLineTotalAmountCurrencyID.add(lineItemLineTotalAmountCurrencyID);
        this.lineItemSpecifiedTradeProductGlobalID.add(lineItemSpecifiedTradeProductGlobalID);
        this.lineItemSpecifiedTradeProductSchemeID.add(lineItemSpecifiedTradeProductSchemeID);
        this.lineItemSpecifiedTradeProductSellerAssignedID.add(lineItemSpecifiedTradeProductSellerAssignedID);
        this.lineItemSpecifiedTradeProductBuyerAssignedID.add(lineItemSpecifiedTradeProductBuyerAssignedID);
        this.lineItemSpecifiedTradeProductName.add(lineItemSpecifiedTradeProductName);
        this.lineItemSpecifiedTradeProductDescription.add(lineItemSpecifiedTradeProductDescription);
    }
}
