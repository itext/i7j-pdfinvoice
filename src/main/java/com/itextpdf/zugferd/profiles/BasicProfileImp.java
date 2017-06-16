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
 * conforms with the Basic profile.
 */
public class BasicProfileImp implements IBasicProfile {

    // member-variables storing all the data
	
    /** The test. */
    protected boolean test;
    
    /** The id. */
    protected String id;
    
    /** The name. */
    protected String name;
    
    /** The type code. */
    protected String typeCode;
    
    /** The date. */
    protected Date date;
    
    /** The date format. */
    protected String dateFormat;
    
    /** The notes. */
    protected List<String[]> notes = new ArrayList<String[]>();
    
    /** The seller name. */
    protected String sellerName;
    
    /** The seller post code. */
    protected String sellerPostcode;
    
    /** The seller line one. */
    protected String sellerLineOne;
    
    /** The seller line two. */
    protected String sellerLineTwo;
    
    /** The seller city name. */
    protected String sellerCityName;
    
    /** The seller country ID. */
    protected String sellerCountryID;
    
    /** The seller tax registration ID. */
    protected List<String> sellerTaxRegistrationID = new ArrayList<String>();
    
    /** The seller tax registration scheme ID. */
    protected List<String> sellerTaxRegistrationSchemeID = new ArrayList<String>();
    
    /** The buyer name. */
    protected String buyerName;
    
    /** The buyer postcode. */
    protected String buyerPostcode;
    
    /** The buyer line one. */
    protected String buyerLineOne;
    
    /** The buyer line two. */
    protected String buyerLineTwo;
    
    /** The buyer city name. */
    protected String buyerCityName;
    
    /** The buyer country ID. */
    protected String buyerCountryID;
    
    /** The buyer tax registration ID. */
    protected List<String> buyerTaxRegistrationID = new ArrayList<String>();
    
    /** The buyer tax registration scheme ID. */
    protected List<String> buyerTaxRegistrationSchemeID = new ArrayList<String>();
    
    /** The delivery date. */
    protected Date deliveryDate;
    
    /** The delivery date format. */
    protected String deliveryDateFormat;
    
    /** The payment reference. */
    protected String paymentReference;
    
    /** The invoice currency code. */
    protected String invoiceCurrencyCode;
    
    /** The payment means ID. */
    protected List<String> paymentMeansID = new ArrayList<String>();
    
    /** The payment means scheme agency ID. */
    protected List<String> paymentMeansSchemeAgencyID = new ArrayList<String>();
    
    /** The payment means payee account IBAN. */
    protected List<String> paymentMeansPayeeAccountIBAN = new ArrayList<String>();
    
    /** The payment means payee account name. */
    protected List<String> paymentMeansPayeeAccountName = new ArrayList<String>();
    
    /** The payment means payee account proprietary ID. */
    protected List<String> paymentMeansPayeeAccountProprietaryID = new ArrayList<String>();
    
    /** The payment means payee financial institution BIC. */
    protected List<String> paymentMeansPayeeFinancialInstitutionBIC = new ArrayList<String>();
    
    /** The payment means payee financial institution german bankleitzahl ID. */
    protected List<String> paymentMeansPayeeFinancialInstitutionGermanBankleitzahlID = new ArrayList<String>();
    
    /** The payment means payee financial institution name. */
    protected List<String> paymentMeansPayeeFinancialInstitutionName = new ArrayList<String>();
    
    /** The tax calculated amount. */
    protected List<String> taxCalculatedAmount = new ArrayList<String>();
    
    /** The tax calculated amount currency ID. */
    protected List<String> taxCalculatedAmountCurrencyID = new ArrayList<String>();
    
    /** The tax type code. */
    protected List<String> taxTypeCode = new ArrayList<String>();
    
    /** The tax basis amount. */
    protected List<String> taxBasisAmount = new ArrayList<String>();
    
    /** The tax basis amount currency ID. */
    protected List<String> taxBasisAmountCurrencyID = new ArrayList<String>();
    
    /** The tax applicable percent. */
    protected List<String> taxApplicablePercent = new ArrayList<String>();
    
    /** The line total amount. */
    protected String lineTotalAmount;
    
    /** The line total amount currency ID. */
    protected String lineTotalAmountCurrencyID;
    
    /** The charge total amount. */
    protected String chargeTotalAmount;
    
    /** The charge total amount currency ID. */
    protected String chargeTotalAmountCurrencyID;
    
    /** The allowance total amount. */
    protected String allowanceTotalAmount;
    
    /** The allowance total amount currency ID. */
    protected String allowanceTotalAmountCurrencyID;
    
    /** The tax basis total amount. */
    protected String taxBasisTotalAmount;
    
    /** The tax basis total amount currency ID. */
    protected String taxBasisTotalAmountCurrencyID;
    
    /** The tax total amount. */
    protected String taxTotalAmount;
    
    /** The tax total amount currency ID. */
    protected String taxTotalAmountCurrencyID;
    
    /** The grand total amount. */
    protected String grandTotalAmount;
    
    /** The grand total amount currency ID. */
    protected String grandTotalAmountCurrencyID;
    
    /** The line item billed quantity. */
    protected List<String> lineItemBilledQuantity = new ArrayList<String>();
    
    /** The line item billed quantity unit code. */
    protected List<String> lineItemBilledQuantityUnitCode = new ArrayList<String>();
    
    /** The line item specified trade product name. */
    protected List<String> lineItemSpecifiedTradeProductName = new ArrayList<String>();

    /**
     * Creates a new {@link BasicProfileImp} instance.
     *
     * @param testIndicator the parameter that determines whether a test invoice is going to be created.
     *                      The test indicator can be used when implementing a newly developed system. It is to mark the
     *                      invoice as a "test" and thus not leading to vat issues.
     */
    public BasicProfileImp(boolean testIndicator) {
        this.test = testIndicator;
    }

    // implementation of the getters
    
    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTestIndicator()
     */
    public boolean getTestIndicator() {
        return test;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getId()
     */
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getName()
     */
    public String getName() {
        return name;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTypeCode()
     */
    public String getTypeCode() {
        return typeCode;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getDateTime()
     */
    public Date getDateTime() {
        return date;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getDateTimeFormat()
     */
    public String getDateTimeFormat() {
        return dateFormat;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getNotes()
     */
    public String[][] getNotes() {
        return to2DArray(notes);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getSellerName()
     */
    public String getSellerName() {
        return sellerName;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getSellerPostcode()
     */
    public String getSellerPostcode() {
        return sellerPostcode;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getSellerLineOne()
     */
    public String getSellerLineOne() {
        return sellerLineOne;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getSellerLineTwo()
     */
    public String getSellerLineTwo() {
        return sellerLineTwo;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getSellerCityName()
     */
    public String getSellerCityName() {
        return sellerCityName;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getSellerCountryID()
     */
    public String getSellerCountryID() {
        return sellerCountryID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getSellerTaxRegistrationID()
     */
    public String[] getSellerTaxRegistrationID() {
        return to1DArray(sellerTaxRegistrationID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getSellerTaxRegistrationSchemeID()
     */
    public String[] getSellerTaxRegistrationSchemeID() {
        return to1DArray(sellerTaxRegistrationSchemeID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getBuyerName()
     */
    public String getBuyerName() {
        return buyerName;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getBuyerPostcode()
     */
    public String getBuyerPostcode() {
        return buyerPostcode;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getBuyerLineOne()
     */
    public String getBuyerLineOne() {
        return buyerLineOne;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getBuyerLineTwo()
     */
    public String getBuyerLineTwo() {
        return buyerLineTwo;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getBuyerCityName()
     */
    public String getBuyerCityName() {
        return buyerCityName;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getBuyerCountryID()
     */
    public String getBuyerCountryID() {
        return buyerCountryID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getBuyerTaxRegistrationID()
     */
    public String[] getBuyerTaxRegistrationID() {
        return to1DArray(buyerTaxRegistrationID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getBuyerTaxRegistrationSchemeID()
     */
    public String[] getBuyerTaxRegistrationSchemeID() {
        return to1DArray(buyerTaxRegistrationSchemeID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getDeliveryDateTime()
     */
    public Date getDeliveryDateTime() {
        return deliveryDate;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getDeliveryDateTimeFormat()
     */
    public String getDeliveryDateTimeFormat() {
        return deliveryDateFormat;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getPaymentReference()
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getInvoiceCurrencyCode()
     */
    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getPaymentMeansID()
     */
    public String[] getPaymentMeansID() {
        return to1DArray(paymentMeansID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getPaymentMeansSchemeAgencyID()
     */
    public String[] getPaymentMeansSchemeAgencyID() {
        return to1DArray(paymentMeansSchemeAgencyID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getPaymentMeansPayeeAccountIBAN()
     */
    public String[] getPaymentMeansPayeeAccountIBAN() {
        return to1DArray(paymentMeansPayeeAccountIBAN);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getPaymentMeansPayeeAccountAccountName()
     */
    public String[] getPaymentMeansPayeeAccountAccountName() {
        return to1DArray(paymentMeansPayeeAccountName);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getPaymentMeansPayeeAccountProprietaryID()
     */
    public String[] getPaymentMeansPayeeAccountProprietaryID() {
        return to1DArray(paymentMeansPayeeAccountProprietaryID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getPaymentMeansPayeeFinancialInstitutionBIC()
     */
    public String[] getPaymentMeansPayeeFinancialInstitutionBIC() {
        return to1DArray(paymentMeansPayeeFinancialInstitutionBIC);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getPaymentMeansPayeeFinancialInstitutionGermanBankleitzahlID()
     */
    public String[] getPaymentMeansPayeeFinancialInstitutionGermanBankleitzahlID() {
        return to1DArray(paymentMeansPayeeFinancialInstitutionGermanBankleitzahlID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getPaymentMeansPayeeFinancialInstitutionName()
     */
    public String[] getPaymentMeansPayeeFinancialInstitutionName() {
        return to1DArray(paymentMeansPayeeFinancialInstitutionName);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTaxCalculatedAmount()
     */
    public String[] getTaxCalculatedAmount() {
        return to1DArray(taxCalculatedAmount);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTaxCalculatedAmountCurrencyID()
     */
    public String[] getTaxCalculatedAmountCurrencyID() {
        return to1DArray(taxCalculatedAmountCurrencyID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTaxTypeCode()
     */
    public String[] getTaxTypeCode() {
        return to1DArray(taxTypeCode);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTaxBasisAmount()
     */
    public String[] getTaxBasisAmount() {
        return to1DArray(taxBasisAmount);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTaxBasisAmountCurrencyID()
     */
    public String[] getTaxBasisAmountCurrencyID() {
        return to1DArray(taxBasisAmountCurrencyID);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTaxApplicablePercent()
     */
    public String[] getTaxApplicablePercent() {
        return to1DArray(taxApplicablePercent);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getLineTotalAmount()
     */
    public String getLineTotalAmount() {
        return lineTotalAmount;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getLineTotalAmountCurrencyID()
     */
    public String getLineTotalAmountCurrencyID() {
        return lineTotalAmountCurrencyID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getChargeTotalAmount()
     */
    public String getChargeTotalAmount() {
        return chargeTotalAmount;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getChargeTotalAmountCurrencyID()
     */
    public String getChargeTotalAmountCurrencyID() {
        return chargeTotalAmountCurrencyID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getAllowanceTotalAmount()
     */
    public String getAllowanceTotalAmount() {
        return allowanceTotalAmount;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getAllowanceTotalAmountCurrencyID()
     */
    public String getAllowanceTotalAmountCurrencyID() {
        return allowanceTotalAmountCurrencyID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTaxBasisTotalAmount()
     */
    public String getTaxBasisTotalAmount() {
        return taxBasisTotalAmount;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTaxBasisTotalAmountCurrencyID()
     */
    public String getTaxBasisTotalAmountCurrencyID() {
        return taxBasisTotalAmountCurrencyID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTaxTotalAmount()
     */
    public String getTaxTotalAmount() {
        return taxTotalAmount;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getTaxTotalAmountCurrencyID()
     */
    public String getTaxTotalAmountCurrencyID() {
        return taxTotalAmountCurrencyID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getGrandTotalAmount()
     */
    public String getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getGrandTotalAmountCurrencyID()
     */
    public String getGrandTotalAmountCurrencyID() {
        return grandTotalAmountCurrencyID;
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getLineItemBilledQuantity()
     */
    public String[] getLineItemBilledQuantity() {
        return to1DArray(lineItemBilledQuantity);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getLineItemBilledQuantityUnitCode()
     */
    public String[] getLineItemBilledQuantityUnitCode() {
        return to1DArray(lineItemBilledQuantityUnitCode);
    }

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.profiles.IBasicProfile#getLineItemSpecifiedTradeProductName()
     */
    public String[] getLineItemSpecifiedTradeProductName() {
        return to1DArray(lineItemSpecifiedTradeProductName);
    }

    // implementation of the setters
    
    /**
     * Sets the test.
     *
     * @param test the new test
     */
    public void setTest(boolean test) {
        this.test = test;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the type code.
     *
     * @param typeCode the new type code
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * Sets the date.
     *
     * @param date the date
     * @param dateFormat the date format
     */
    public void setDate(Date date, String dateFormat) {
        this.date = date;
        this.dateFormat = dateFormat;
    }

    /**
     * Adds the note.
     *
     * @param note the note
     */
    public void addNote(String[] note) {
        notes.add(note);
    }

    /**
     * Sets the seller name.
     *
     * @param sellerName the new seller name
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    /**
     * Sets the seller postcode.
     *
     * @param sellerPostcode the new seller postcode
     */
    public void setSellerPostcode(String sellerPostcode) {
        this.sellerPostcode = sellerPostcode;
    }

    /**
     * Sets the seller line one.
     *
     * @param sellerLineOne the new seller line one
     */
    public void setSellerLineOne(String sellerLineOne) {
        this.sellerLineOne = sellerLineOne;
    }

    /**
     * Sets the seller line two.
     *
     * @param sellerLineTwo the new seller line two
     */
    public void setSellerLineTwo(String sellerLineTwo) {
        this.sellerLineTwo = sellerLineTwo;
    }

    /**
     * Sets the seller city name.
     *
     * @param sellerCityName the new seller city name
     */
    public void setSellerCityName(String sellerCityName) {
        this.sellerCityName = sellerCityName;
    }

    /**
     * Sets the seller country ID.
     *
     * @param sellerCountryID the new seller country ID
     */
    public void setSellerCountryID(String sellerCountryID) {
        this.sellerCountryID = sellerCountryID;
    }

    /**
     * Adds the seller tax registration.
     *
     * @param schemeID the scheme ID
     * @param taxId the tax id
     */
    public void addSellerTaxRegistration(String schemeID, String taxId) {
        sellerTaxRegistrationSchemeID.add(schemeID);
        sellerTaxRegistrationID.add(taxId);
    }

    /**
     * Sets the buyer name.
     *
     * @param buyerName the new buyer name
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    /**
     * Sets the buyer postcode.
     *
     * @param buyerPostcode the new buyer postcode
     */
    public void setBuyerPostcode(String buyerPostcode) {
        this.buyerPostcode = buyerPostcode;
    }

    /**
     * Sets the buyer line one.
     *
     * @param buyerLineOne the new buyer line one
     */
    public void setBuyerLineOne(String buyerLineOne) {
        this.buyerLineOne = buyerLineOne;
    }

    /**
     * Sets the buyer line two.
     *
     * @param buyerLineTwo the new buyer line two
     */
    public void setBuyerLineTwo(String buyerLineTwo) {
        this.buyerLineTwo = buyerLineTwo;
    }

    /**
     * Sets the buyer city name.
     *
     * @param buyerCityName the new buyer city name
     */
    public void setBuyerCityName(String buyerCityName) {
        this.buyerCityName = buyerCityName;
    }

    /**
     * Sets the buyer country ID.
     *
     * @param buyerCountryID the new buyer country ID
     */
    public void setBuyerCountryID(String buyerCountryID) {
        this.buyerCountryID = buyerCountryID;
    }

    /**
     * Adds the buyer tax registration.
     *
     * @param schemeID the scheme ID
     * @param taxId the tax id
     */
    public void addBuyerTaxRegistration(String schemeID, String taxId) {
        buyerTaxRegistrationSchemeID.add(schemeID);
        buyerTaxRegistrationID.add(taxId);
    }

    /**
     * Sets the delivery date.
     *
     * @param deliveryDate the delivery date
     * @param deliveryDateFormat the delivery date format
     */
    public void setDeliveryDate(Date deliveryDate, String deliveryDateFormat) {
        this.deliveryDate = deliveryDate;
        this.deliveryDateFormat = deliveryDateFormat;
    }

    /**
     * Sets the payment reference.
     *
     * @param paymentReference the new payment reference
     */
    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    /**
     * Sets the invoice currency code.
     *
     * @param invoiceCurrencyCode the new invoice currency code
     */
    public void setInvoiceCurrencyCode(String invoiceCurrencyCode) {
        this.invoiceCurrencyCode = invoiceCurrencyCode;
    }

    /**
     * Adds the payment means.
     *
     * @param schemeAgencyID the scheme agency ID
     * @param id the id
     * @param iban the iban
     * @param accountname the accountname
     * @param proprietaryID the proprietary ID
     * @param bic the bic
     * @param germanBankleitzahlID the german bankleitzahl ID
     * @param institutionname the institutionname
     */
    public void addPaymentMeans(String schemeAgencyID, String id, String iban, String accountname, String proprietaryID, String bic, String germanBankleitzahlID, String institutionname) {
        paymentMeansID.add(id);
        paymentMeansSchemeAgencyID.add(schemeAgencyID);
        paymentMeansPayeeAccountIBAN.add(iban);
        paymentMeansPayeeAccountName.add(accountname);
        paymentMeansPayeeAccountProprietaryID.add(proprietaryID);
        paymentMeansPayeeFinancialInstitutionBIC.add(bic);
        paymentMeansPayeeFinancialInstitutionGermanBankleitzahlID.add(germanBankleitzahlID);
        paymentMeansPayeeFinancialInstitutionName.add(institutionname);
    }

    /**
     * Adds the applicable trade tax.
     *
     * @param calculatedAmount the calculated amount
     * @param calculatedAmountCurrencyID the calculated amount currency ID
     * @param typeCode the type code
     * @param basisAmount the basis amount
     * @param basisAmountCurrencyID the basis amount currency ID
     * @param applicablePercent the applicable percent
     */
    public void addApplicableTradeTax(String calculatedAmount, String calculatedAmountCurrencyID, String typeCode,
            String basisAmount, String basisAmountCurrencyID, String applicablePercent) {
        taxCalculatedAmount.add(calculatedAmount);
        taxCalculatedAmountCurrencyID.add(calculatedAmountCurrencyID);
        taxTypeCode.add(typeCode);
        taxBasisAmount.add(basisAmount);
        taxBasisAmountCurrencyID.add(basisAmountCurrencyID);
        taxApplicablePercent.add(applicablePercent);
    }

    /**
     * Sets the monetary summation.
     *
     * @param lineTotalAmount the line total amount
     * @param lineTotalAmountCurrencyID the line total amount currency ID
     * @param chargeTotalAmount the charge total amount
     * @param chargeTotalAmountCurrencyID the charge total amount currency ID
     * @param allowanceTotalAmount the allowance total amount
     * @param allowanceTotalAmountCurrencyID the allowance total amount currency ID
     * @param taxBasisTotalAmount the tax basis total amount
     * @param taxBasisTotalAmountCurrencyID the tax basis total amount currency ID
     * @param taxTotalAmount the tax total amount
     * @param taxTotalAmountCurrencyID the tax total amount currency ID
     * @param grandTotalAmount the grand total amount
     * @param grandTotalAmountCurrencyID the grand total amount currency ID
     */
    public void setMonetarySummation(String lineTotalAmount, String lineTotalAmountCurrencyID,
            String chargeTotalAmount, String chargeTotalAmountCurrencyID,
            String allowanceTotalAmount, String allowanceTotalAmountCurrencyID,
            String taxBasisTotalAmount, String taxBasisTotalAmountCurrencyID,
            String taxTotalAmount, String taxTotalAmountCurrencyID,
            String grandTotalAmount, String grandTotalAmountCurrencyID) {
        this.lineTotalAmount = lineTotalAmount;
        this.lineTotalAmountCurrencyID = lineTotalAmountCurrencyID;
        this.chargeTotalAmount = chargeTotalAmount;
        this.chargeTotalAmountCurrencyID = chargeTotalAmountCurrencyID;
        this.allowanceTotalAmount = allowanceTotalAmount;
        this.allowanceTotalAmountCurrencyID = allowanceTotalAmountCurrencyID;
        this.taxBasisTotalAmount = taxBasisTotalAmount;
        this.taxBasisTotalAmountCurrencyID = taxBasisTotalAmountCurrencyID;
        this.taxTotalAmount = taxTotalAmount;
        this.taxTotalAmountCurrencyID = taxTotalAmountCurrencyID;
        this.grandTotalAmount = grandTotalAmount;
        this.grandTotalAmountCurrencyID = grandTotalAmountCurrencyID;
    }

    /**
     * Adds the included supply chain trade line item.
     *
     * @param billedQuantity the billed quantity
     * @param billedQuantityUnitCode the billed quantity unit code
     * @param specifiedTradeProductName the specified trade product name
     */
    public void addIncludedSupplyChainTradeLineItem(String billedQuantity, String billedQuantityUnitCode, String specifiedTradeProductName) {
        this.lineItemBilledQuantity.add(billedQuantity);
        this.lineItemBilledQuantityUnitCode.add(billedQuantityUnitCode);
        this.lineItemSpecifiedTradeProductName.add(specifiedTradeProductName);
    }

    // helper methods
    
    /**
     * To 1D array.
     *
     * @param list the list
     * @return the string[]
     */
    protected String[] to1DArray(List<String> list) {
        return (String[]) list.toArray(new String[list.size()]);
    }

    /**
     * To 1D array (for boolean values).
     *
     * @param list the list
     * @return the boolean[]
     */
    protected boolean[] to1DArrayB(List<Boolean> list) {
        boolean[] b = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++) {
            b[i] = list.get(i);
        }
        return b;
    }

    /**
     * To 2D array.
     *
     * @param list the list
     * @return the string[][]
     */
    protected String[][] to2DArray(List<String[]> list) {
        int n = list.size();
        String[][] array = new String[n][];
        for (int i = 0; i < n; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    /**
     * To 2D array (for boolean values).
     *
     * @param list the list
     * @return the boolean[][]
     */
    protected boolean[][] to2DArrayB(List<boolean[]> list) {
        int n = list.size();
        boolean[][] array = new boolean[n][];
        for (int i = 0; i < n; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    /**
     * To 3D array.
     *
     * @param list the list
     * @return the string[][][]
     */
    protected String[][][] to3DArray(List<String[][]> list) {
        int n = list.size();
        String[][][] array = new String[n][][];
        for (int i = 0; i < n; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
