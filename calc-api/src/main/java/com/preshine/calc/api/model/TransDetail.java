package com.preshine.calc.api.model;


import com.greenpineyu.fel.common.StringUtils;
import com.refordom.roleplay.corebusiness.transdata.dto.TransBomDto;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * <p>交易明细</p>
 *
 * @author zhongzhong
 * @version 0.1.0
 */
public class TransDetail implements DetailBase {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String id;
    private String transType;
    private Double qty;
    private Double amount;
    private Double taxAmount;
    private String transObjId;
    private String transObjCode;
    //出库仓库
    private String containerId;
    private String containerCode;
    private String batchNo;
    private Date batchTime;
    private String dealerId;
    private String dealerCode;
    private String contactId;
    private String measureUnit;//计量单位
    private Double price;
    private String remark;
    private Double amountCost;
    private Double taxRate;
    private boolean transBomFlag;
    private String transCode;
    private String fgCode;
    private String transMatchedCode;
    private String calcRelCode;
    private Date promDeliTime;
    private Date effectiveTime;
    private String transDExt;
    private String processCode;
    private int seq;
    private Integer detailInOut;
    private String entityId;

    private double auStandardWeight;//金标重
    private double agStandardWeight;//银标重

    private double auPrice;//金单价
    private double agPrice;//银单价

    private double auLossRate;//金损耗率
    private double agLossRate;//银损耗率

    private String currency;//币种
    private Double exRate;//汇率
    private Double exAmount;//外币金额
    private Double manufactureCost;//制造费用

    private String creator;
    private Date crtTime;
    private String modifier;
    private Date modTime;
    private String comment;
    private Integer status;
    private List<TransBomDto> transBomDtos;

    private Date calcTime;

    private List<ComponentPojo> componentPojos;


    //出库生效时间
    private Date tradingInTime;

    //入库仓库
    private String containerInId;
    private boolean red;

    private boolean isBalanceValidate;
    private Integer calcStatus;

    public TransDetail(){

    }

    public TransDetail(String transType, String fgCode){
        this.transType = transType;
        if(!StringUtils.isEmpty(fgCode)){
            this.fgCode = fgCode;
        }
    }

    public boolean isBalanceValidate() {
        return isBalanceValidate;
    }

    public void setBalanceValidate(boolean balanceValidate) {
        isBalanceValidate = balanceValidate;
    }

    public Date getCalcTime() {
        return calcTime;
    }

    public void setCalcTime(Date calcTime) {
        this.calcTime = calcTime;
    }

    public double getAuLossRate() {
        return auLossRate;
    }

    public void setAuLossRate(double auLossRate) {
        this.auLossRate = auLossRate;
    }

    public double getAgLossRate() {
        return agLossRate;
    }

    public void setAgLossRate(double agLossRate) {
        this.agLossRate = agLossRate;
    }

    public double getAuPrice() {
        return auPrice;
    }

    public void setAuPrice(double auPrice) {
        this.auPrice = auPrice;
    }

    public double getAgPrice() {
        return agPrice;
    }

    public void setAgPrice(double agPrice) {
        this.agPrice = agPrice;
    }

    public double getAuStandardWeight() {
        return auStandardWeight;
    }

    public void setAuStandardWeight(double auStandardWeight) {
        this.auStandardWeight = auStandardWeight;
    }

    public double getAgStandardWeight() {
        return agStandardWeight;
    }

    public void setAgStandardWeight(double agStandardWeight) {
        this.agStandardWeight = agStandardWeight;
    }

    public Double getManufactureCost() {
        return manufactureCost;
    }

    public void setManufactureCost(Double manufactureCost) {
        this.manufactureCost = manufactureCost;
    }

    public List<TransBomDto> getTransBomDtos() {
        return transBomDtos;
    }

    public void setTransBomDtos(List<TransBomDto> transBomDtos) {
        this.transBomDtos = transBomDtos;
    }

    public Double getExAmount() {
        return exAmount;
    }

    public void setExAmount(Double exAmount) {
        this.exAmount = exAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getExRate() {
        return exRate;
    }

    public void setExRate(Double exRate) {
        this.exRate = exRate;
    }

    public String getTransObjCode() {
        return transObjCode;
    }

    public void setTransObjCode(String transObjCode) {
        this.transObjCode = transObjCode;
    }

    public String getContainerCode() {
        return containerCode;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public void setContainerCode(String containerCode) {
        this.containerCode = containerCode;
    }

    public List<ComponentPojo> getComponentPojos() {
        return componentPojos;
    }

    public void setComponentPojos(List<ComponentPojo> componentPojos) {
        this.componentPojos = componentPojos;
    }

    public Integer getDetailInOut() {
        return detailInOut;
    }

    public void setDetailInOut(Integer detailInOut) {
        this.detailInOut = detailInOut;
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public Date getPromDeliTime() {
        return promDeliTime;
    }

    public void setPromDeliTime(Date promDeliTime) {
        this.promDeliTime = promDeliTime;
    }

    public String getTransDExt() {
        return transDExt;
    }

    public void setTransDExt(String transDExt) {
        this.transDExt = transDExt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAmountCost() {
        return amountCost;
    }

    public void setAmountCost(Double amountCost) {
        this.amountCost = amountCost;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Date getBatchTime() {
        return batchTime;
    }

    public void setBatchTime(Date batchTime) {
        this.batchTime = batchTime;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public boolean isTransBomFlag() {
        return transBomFlag;
    }

    public void setTransBomFlag(boolean transBomFlag) {
        this.transBomFlag = transBomFlag;
    }

    public String getFgCode() {
        return fgCode;
    }

    public void setFgCode(String fgCode) {
        this.fgCode = fgCode;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransObjId() {
        return transObjId;
    }

    public void setTransObjId(String transObjId) {
        this.transObjId = transObjId;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getTransCode() {
        return this.transCode;
    }

    public String getTransMatchedCode() {
        return transMatchedCode;
    }

    public void setTransMatchedCode(String transMatchedCode) {
        this.transMatchedCode = transMatchedCode;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getCalcRelCode() {
        return calcRelCode;
    }

    public void setCalcRelCode(String calcRelCode) {
        this.calcRelCode = calcRelCode;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContainerInId() {
        return containerInId;
    }

    public void setContainerInId(String containerInId) {
        this.containerInId = containerInId;
    }

    public Date getTradingInTime() {
        return tradingInTime;
    }

    public void setTradingInTime(Date tradingInTime) {
        this.tradingInTime = tradingInTime;
    }

    public boolean isRed() {
        return this.red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public Integer getCalcStatus() {
        return calcStatus;
    }

    public void setCalcStatus(Integer calcStatus) {
        this.calcStatus = calcStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransDetail that = (TransDetail) o;
        return transBomFlag == that.transBomFlag &&
                seq == that.seq &&
                Double.compare(that.auStandardWeight, auStandardWeight) == 0 &&
                Double.compare(that.agStandardWeight, agStandardWeight) == 0 &&
                Double.compare(that.auPrice, auPrice) == 0 &&
                Double.compare(that.agPrice, agPrice) == 0 &&
                Double.compare(that.auLossRate, auLossRate) == 0 &&
                Double.compare(that.agLossRate, agLossRate) == 0 &&
                red == that.red &&
                isBalanceValidate == that.isBalanceValidate &&
                Objects.equals(id, that.id) &&
                Objects.equals(transType, that.transType) &&
                Objects.equals(qty, that.qty) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(taxAmount, that.taxAmount) &&
                Objects.equals(transObjId, that.transObjId) &&
                Objects.equals(transObjCode, that.transObjCode) &&
                Objects.equals(containerId, that.containerId) &&
                Objects.equals(containerCode, that.containerCode) &&
                Objects.equals(batchNo, that.batchNo) &&
                Objects.equals(batchTime, that.batchTime) &&
                Objects.equals(dealerId, that.dealerId) &&
                Objects.equals(dealerCode, that.dealerCode) &&
                Objects.equals(contactId, that.contactId) &&
                Objects.equals(measureUnit, that.measureUnit) &&
                Objects.equals(price, that.price) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(amountCost, that.amountCost) &&
                Objects.equals(taxRate, that.taxRate) &&
                Objects.equals(transCode, that.transCode) &&
                Objects.equals(fgCode, that.fgCode) &&
                Objects.equals(transMatchedCode, that.transMatchedCode) &&
                Objects.equals(calcRelCode, that.calcRelCode) &&
                Objects.equals(promDeliTime, that.promDeliTime) &&
                Objects.equals(effectiveTime, that.effectiveTime) &&
                Objects.equals(transDExt, that.transDExt) &&
                Objects.equals(processCode, that.processCode) &&
                Objects.equals(detailInOut, that.detailInOut) &&
                Objects.equals(entityId, that.entityId) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(exRate, that.exRate) &&
                Objects.equals(exAmount, that.exAmount) &&
                Objects.equals(manufactureCost, that.manufactureCost) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(crtTime, that.crtTime) &&
                Objects.equals(modifier, that.modifier) &&
                Objects.equals(modTime, that.modTime) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(status, that.status) &&
                Objects.equals(calcTime, that.calcTime) &&
                Objects.equals(tradingInTime, that.tradingInTime) &&
                Objects.equals(containerInId, that.containerInId) &&
                Objects.equals(calcStatus, that.calcStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transType, qty, amount, taxAmount, transObjId, transObjCode, containerId, containerCode, batchNo, batchTime, dealerId, dealerCode, contactId, measureUnit, price, remark, amountCost, taxRate, transBomFlag, transCode, fgCode, transMatchedCode, calcRelCode, promDeliTime, effectiveTime, transDExt, processCode, seq, detailInOut, entityId, auStandardWeight, agStandardWeight, auPrice, agPrice, auLossRate, agLossRate, currency, exRate, exAmount, manufactureCost, creator, crtTime, modifier, modTime, comment, status, calcTime, tradingInTime, containerInId, red, isBalanceValidate, calcStatus);
    }

    @Override
    public String toString() {
        return "TransDetail{" +
                "id='" + id + '\'' +
                ", transType='" + transType + '\'' +
                ", qty=" + qty +
                ", amount=" + amount +
                ", taxAmount=" + taxAmount +
                ", transObjId='" + transObjId + '\'' +
                ", transObjCode='" + transObjCode + '\'' +
                ", containerId='" + containerId + '\'' +
                ", containerCode='" + containerCode + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", batchTime=" + batchTime +
                ", dealerId='" + dealerId + '\'' +
                ", dealerCode='" + dealerCode + '\'' +
                ", contactId='" + contactId + '\'' +
                ", measureUnit='" + measureUnit + '\'' +
                ", price=" + price +
                ", remark='" + remark + '\'' +
                ", amountCost=" + amountCost +
                ", taxRate=" + taxRate +
                ", transBomFlag=" + transBomFlag +
                ", transCode='" + transCode + '\'' +
                ", fgCode='" + fgCode + '\'' +
                ", transMatchedCode='" + transMatchedCode + '\'' +
                ", calcRelCode='" + calcRelCode + '\'' +
                ", promDeliTime=" + promDeliTime +
                ", effectiveTime=" + effectiveTime +
                ", transDExt='" + transDExt + '\'' +
                ", processCode='" + processCode + '\'' +
                ", seq=" + seq +
                ", detailInOut=" + detailInOut +
                ", entityId='" + entityId + '\'' +
                ", auStandardWeight=" + auStandardWeight +
                ", agStandardWeight=" + agStandardWeight +
                ", auPrice=" + auPrice +
                ", agPrice=" + agPrice +
                ", auLossRate=" + auLossRate +
                ", agLossRate=" + agLossRate +
                ", currency='" + currency + '\'' +
                ", exRate=" + exRate +
                ", exAmount=" + exAmount +
                ", manufactureCost=" + manufactureCost +
                ", creator='" + creator + '\'' +
                ", crtTime=" + crtTime +
                ", modifier='" + modifier + '\'' +
                ", modTime=" + modTime +
                ", comment='" + comment + '\'' +
                ", status=" + status +
                ", transBomDtos=" + transBomDtos +
                ", calcTime=" + calcTime +
                ", componentPojos=" + componentPojos +
                ", tradingInTime=" + tradingInTime +
                ", containerInId='" + containerInId + '\'' +
                ", red=" + red +
                ", isBalanceValidate=" + isBalanceValidate +
                ", calcStatus=" + calcStatus +
                '}';
    }
}
