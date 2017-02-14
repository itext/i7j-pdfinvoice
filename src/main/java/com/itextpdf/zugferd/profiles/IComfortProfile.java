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
package com.itextpdf.zugferd.profiles;

import java.util.Date;

/**
 * If you implement this interface correctly, you provide all the data that
 * is necessary for iText to create an XML that can be used in a ZUGFeRD
 * invoice that conforms with the Comfort profile.
 */
public interface IComfortProfile extends IBasicProfile {
    String[] getNotesCodes();
    String getBuyerReference();
    String getSellerID();
    String[] getSellerGlobalID();
    String[] getSellerGlobalSchemeID();
    String getBuyerID();
    String[] getBuyerGlobalID();
    String[] getBuyerGlobalSchemeID();
    Date getBuyerOrderReferencedDocumentIssueDateTime();
    String getBuyerOrderReferencedDocumentIssueDateTimeFormat();
    String getBuyerOrderReferencedDocumentID();
    Date getContractReferencedDocumentIssueDateTime();
    String getContractReferencedDocumentIssueDateTimeFormat();
    String getContractReferencedDocumentID();
    Date getCustomerOrderReferencedDocumentIssueDateTime();
    String getCustomerOrderReferencedDocumentIssueDateTimeFormat();
    String getCustomerOrderReferencedDocumentID();
    Date getDeliveryNoteReferencedDocumentIssueDateTime();
    String getDeliveryNoteReferencedDocumentIssueDateTimeFormat();
    String getDeliveryNoteReferencedDocumentID();
    String getInvoiceeID();
    String[] getInvoiceeGlobalID();
    String[] getInvoiceeGlobalSchemeID();
    String getInvoiceeName();
    String getInvoiceePostcode();
    String getInvoiceeLineOne();
    String getInvoiceeLineTwo();
    String getInvoiceeCityName();
    String getInvoiceeCountryID();
    String[] getInvoiceeTaxRegistrationID();
    String[] getInvoiceeTaxRegistrationSchemeID();
    String[] getPaymentMeansTypeCode();
    String[][] getPaymentMeansInformation();
    String[] getPaymentMeansPayerAccountIBAN();
    String[] getPaymentMeansPayerAccountProprietaryID();
    String[] getPaymentMeansPayerFinancialInstitutionBIC();
    String[] getPaymentMeansPayerFinancialInstitutionGermanBankleitzahlID();
    String[] getPaymentMeansPayerFinancialInstitutionName();
    String[] getTaxExemptionReason();
    String[] getTaxCategoryCode();
    Date getBillingStartDateTime();
    String getBillingStartDateTimeFormat();
    Date getBillingEndDateTime();
    String getBillingEndDateTimeFormat();
    boolean[] getSpecifiedTradeAllowanceChargeIndicator();
    String[] getSpecifiedTradeAllowanceChargeActualAmount();
    String[] getSpecifiedTradeAllowanceChargeActualAmountCurrency();
    String[] getSpecifiedTradeAllowanceChargeReason();
    String[][] getSpecifiedTradeAllowanceChargeTaxTypeCode();
    String[][] getSpecifiedTradeAllowanceChargeTaxCategoryCode();
    String[][] getSpecifiedTradeAllowanceChargeTaxApplicablePercent();
    String[][] getSpecifiedLogisticsServiceChargeDescription();
    String[] getSpecifiedLogisticsServiceChargeAmount();
    String[] getSpecifiedLogisticsServiceChargeAmountCurrency();
    String[][] getSpecifiedLogisticsServiceChargeTaxTypeCode();
    String[][] getSpecifiedLogisticsServiceChargeTaxCategoryCode();
    String[][] getSpecifiedLogisticsServiceChargeTaxApplicablePercent();
    String[][] getSpecifiedTradePaymentTermsDescription();
    Date[] getSpecifiedTradePaymentTermsDueDateTime();
    String[] getSpecifiedTradePaymentTermsDueDateTimeFormat();
    String getTotalPrepaidAmount();
    String getTotalPrepaidAmountCurrencyID();
    String getDuePayableAmount();
    String getDuePayableAmountCurrencyID();
    String[] getLineItemLineID();
    String[][][] getLineItemIncludedNote();
    String[] getLineItemGrossPriceChargeAmount();
    String[] getLineItemGrossPriceChargeAmountCurrencyID();
    String[] getLineItemGrossPriceBasisQuantity();
    String[] getLineItemGrossPriceBasisQuantityCode();
    boolean[][] getLineItemGrossPriceTradeAllowanceChargeIndicator();
    String[][] getLineItemGrossPriceTradeAllowanceChargeActualAmount();
    String[][] getLineItemGrossPriceTradeAllowanceChargeActualAmountCurrencyID();
    String[][] getLineItemGrossPriceTradeAllowanceChargeReason();
    String[] getLineItemNetPriceChargeAmount();
    String[] getLineItemNetPriceChargeAmountCurrencyID();
    String[] getLineItemNetPriceBasisQuantity();
    String[] getLineItemNetPriceBasisQuantityCode();
    String[][] getLineItemSettlementTaxTypeCode();
    String[][] getLineItemSettlementTaxExemptionReason();
    String[][] getLineItemSettlementTaxCategoryCode();
    String[][] getLineItemSettlementTaxApplicablePercent();
    String[] getLineItemLineTotalAmount();
    String[] getLineItemLineTotalAmountCurrencyID();
    String[] getLineItemSpecifiedTradeProductGlobalID();
    String[] getLineItemSpecifiedTradeProductSchemeID();
    String[] getLineItemSpecifiedTradeProductSellerAssignedID();
    String[] getLineItemSpecifiedTradeProductBuyerAssignedID();
    String[] getLineItemSpecifiedTradeProductDescription();
}
