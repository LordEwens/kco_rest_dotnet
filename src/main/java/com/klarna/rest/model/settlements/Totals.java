/*
 * Klarna Settlements API
 * This API gives you access to your payouts and transactions.     Resources are split into two broad types:     * Collections, including pagination information:      collections are queryable, typically by the attributes of the sub-resource      as well as pagination.    * Entity resources containing a single entity.
 *
 * OpenAPI spec version: 1.0.0-rc2
 * Contact: integration@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.model.settlements;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Totals
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T11:11:59.241Z")
public class Totals {
  @JsonProperty("commission_amount")
  private Long commissionAmount = null;

  @JsonProperty("repay_amount")
  private Long repayAmount = null;

  @JsonProperty("sale_amount")
  private Long saleAmount = null;

  @JsonProperty("holdback_amount")
  private Long holdbackAmount = null;

  @JsonProperty("tax_amount")
  private Long taxAmount = null;

  @JsonProperty("settlement_amount")
  private Long settlementAmount = null;

  @JsonProperty("fee_correction_amount")
  private Long feeCorrectionAmount = null;

  @JsonProperty("reversal_amount")
  private Long reversalAmount = null;

  @JsonProperty("release_amount")
  private Long releaseAmount = null;

  @JsonProperty("return_amount")
  private Long returnAmount = null;

  @JsonProperty("fee_amount")
  private Long feeAmount = null;

  public Totals commissionAmount(Long commissionAmount) {
    this.commissionAmount = commissionAmount;
    return this;
  }

   /**
   * The total amount of commissions, in minor units
   * @return commissionAmount
  **/
  @ApiModelProperty(example = "550", required = true, value = "The total amount of commissions, in minor units")
  public Long getCommissionAmount() {
    return commissionAmount;
  }

  public void setCommissionAmount(Long commissionAmount) {
    this.commissionAmount = commissionAmount;
  }

  public Totals repayAmount(Long repayAmount) {
    this.repayAmount = repayAmount;
    return this;
  }

   /**
   * The total amount of money that has been repaid by the merchant from the debt to Klarna, in minor units
   * @return repayAmount
  **/
  @ApiModelProperty(example = "550", required = true, value = "The total amount of money that has been repaid by the merchant from the debt to Klarna, in minor units")
  public Long getRepayAmount() {
    return repayAmount;
  }

  public void setRepayAmount(Long repayAmount) {
    this.repayAmount = repayAmount;
  }

  public Totals saleAmount(Long saleAmount) {
    this.saleAmount = saleAmount;
    return this;
  }

   /**
   * The total amount of sales, in minor units
   * @return saleAmount
  **/
  @ApiModelProperty(example = "500", required = true, value = "The total amount of sales, in minor units")
  public Long getSaleAmount() {
    return saleAmount;
  }

  public void setSaleAmount(Long saleAmount) {
    this.saleAmount = saleAmount;
  }

  public Totals holdbackAmount(Long holdbackAmount) {
    this.holdbackAmount = holdbackAmount;
    return this;
  }

   /**
   * The total amount of money withheld by Klarna, in minor units
   * @return holdbackAmount
  **/
  @ApiModelProperty(example = "550", required = true, value = "The total amount of money withheld by Klarna, in minor units")
  public Long getHoldbackAmount() {
    return holdbackAmount;
  }

  public void setHoldbackAmount(Long holdbackAmount) {
    this.holdbackAmount = holdbackAmount;
  }

  public Totals taxAmount(Long taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * The total amount of tax, in minor units
   * @return taxAmount
  **/
  @ApiModelProperty(example = "550", value = "The total amount of tax, in minor units")
  public Long getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Long taxAmount) {
    this.taxAmount = taxAmount;
  }

  public Totals settlementAmount(Long settlementAmount) {
    this.settlementAmount = settlementAmount;
    return this;
  }

   /**
   * The total amount of the settlement in question, in minor units
   * @return settlementAmount
  **/
  @ApiModelProperty(example = "550", required = true, value = "The total amount of the settlement in question, in minor units")
  public Long getSettlementAmount() {
    return settlementAmount;
  }

  public void setSettlementAmount(Long settlementAmount) {
    this.settlementAmount = settlementAmount;
  }

  public Totals feeCorrectionAmount(Long feeCorrectionAmount) {
    this.feeCorrectionAmount = feeCorrectionAmount;
    return this;
  }

   /**
   * The total amount of fee correction, in minor units
   * @return feeCorrectionAmount
  **/
  @ApiModelProperty(example = "550", value = "The total amount of fee correction, in minor units")
  public Long getFeeCorrectionAmount() {
    return feeCorrectionAmount;
  }

  public void setFeeCorrectionAmount(Long feeCorrectionAmount) {
    this.feeCorrectionAmount = feeCorrectionAmount;
  }

  public Totals reversalAmount(Long reversalAmount) {
    this.reversalAmount = reversalAmount;
    return this;
  }

   /**
   * The total amount of reversals, in minor units
   * @return reversalAmount
  **/
  @ApiModelProperty(example = "550", required = true, value = "The total amount of reversals, in minor units")
  public Long getReversalAmount() {
    return reversalAmount;
  }

  public void setReversalAmount(Long reversalAmount) {
    this.reversalAmount = reversalAmount;
  }

  public Totals releaseAmount(Long releaseAmount) {
    this.releaseAmount = releaseAmount;
    return this;
  }

   /**
   * The total amount of money released from holdback by Klarna, in minor units
   * @return releaseAmount
  **/
  @ApiModelProperty(example = "550", required = true, value = "The total amount of money released from holdback by Klarna, in minor units")
  public Long getReleaseAmount() {
    return releaseAmount;
  }

  public void setReleaseAmount(Long releaseAmount) {
    this.releaseAmount = releaseAmount;
  }

  public Totals returnAmount(Long returnAmount) {
    this.returnAmount = returnAmount;
    return this;
  }

   /**
   * The total amount of returns, in minor units
   * @return returnAmount
  **/
  @ApiModelProperty(example = "550", required = true, value = "The total amount of returns, in minor units")
  public Long getReturnAmount() {
    return returnAmount;
  }

  public void setReturnAmount(Long returnAmount) {
    this.returnAmount = returnAmount;
  }

  public Totals feeAmount(Long feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * The total amount of fees, in minor units
   * @return feeAmount
  **/
  @ApiModelProperty(example = "500", required = true, value = "The total amount of fees, in minor units")
  public Long getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(Long feeAmount) {
    this.feeAmount = feeAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Totals totals = (Totals) o;
    return Objects.equals(this.commissionAmount, totals.commissionAmount) &&
        Objects.equals(this.repayAmount, totals.repayAmount) &&
        Objects.equals(this.saleAmount, totals.saleAmount) &&
        Objects.equals(this.holdbackAmount, totals.holdbackAmount) &&
        Objects.equals(this.taxAmount, totals.taxAmount) &&
        Objects.equals(this.settlementAmount, totals.settlementAmount) &&
        Objects.equals(this.feeCorrectionAmount, totals.feeCorrectionAmount) &&
        Objects.equals(this.reversalAmount, totals.reversalAmount) &&
        Objects.equals(this.releaseAmount, totals.releaseAmount) &&
        Objects.equals(this.returnAmount, totals.returnAmount) &&
        Objects.equals(this.feeAmount, totals.feeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissionAmount, repayAmount, saleAmount, holdbackAmount, taxAmount, settlementAmount, feeCorrectionAmount, reversalAmount, releaseAmount, returnAmount, feeAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Totals {\n");
    
    sb.append("    commissionAmount: ").append(toIndentedString(commissionAmount)).append("\n");
    sb.append("    repayAmount: ").append(toIndentedString(repayAmount)).append("\n");
    sb.append("    saleAmount: ").append(toIndentedString(saleAmount)).append("\n");
    sb.append("    holdbackAmount: ").append(toIndentedString(holdbackAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    settlementAmount: ").append(toIndentedString(settlementAmount)).append("\n");
    sb.append("    feeCorrectionAmount: ").append(toIndentedString(feeCorrectionAmount)).append("\n");
    sb.append("    reversalAmount: ").append(toIndentedString(reversalAmount)).append("\n");
    sb.append("    releaseAmount: ").append(toIndentedString(releaseAmount)).append("\n");
    sb.append("    returnAmount: ").append(toIndentedString(returnAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

