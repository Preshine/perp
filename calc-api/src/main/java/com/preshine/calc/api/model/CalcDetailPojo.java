package com.preshine.calc.api.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>交易计算表</p>
 * @since 1.0.0
 */
@TableName(value = "TRANS_DETAIL_CALC")
public class CalcDetailPojo implements Serializable {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * 初始化平衡计算关系编码
     */
    @TableField(exist = false)
    public static final String INIT_CODE = "crinit";

    /**
     * 期初数据类型
     *
     * @since 0.1.0
     */
    @TableField(exist = false)
    public static final String INIT_TYPE = "initial";

    /**
     * 主键
     *  @since 0.0.1
     */
    @TableId(type = IdType.INPUT)
    private String id;

    /**
     * 交易号
     * @since 0.0.1
     */
    @TableField(value = "TRANS_CODE")
    private String transCode;

    /**
     * 交易类型: 如"采购入库"  ; (方便核销计算的时候查询)
     * @since 0.0.1
     */
    @TableField(value = "TRANS_TYPE")
    private String transType;

    /**
     * 计算关系/科目代码，参考中国会计科目明细
     * @since 0.0.1
     */
    @TableField(value = "CALC_REL_CODE")
    private String calcRelCode;

    /** 存货，资金;
     * @since 1.0.0
     * */
    @TableField(value = "TRANS_OBJ_ID")
    private String transObjId;

    /**
     * 交易属性1st : 自定义; 存货:  (stock_code)  ;  供应商往来: deal_code ;    资金;
     * @since 0.0.1
     */
    @TableField(value = "TRANS_OBJ_CODE")
    private String transObjCode;

    /**
     * 第二个交易属性 : 自定义; 存货:  ( 仓库)
     * @since 0.0.1
     */
    @TableField(value = "CONTAINER_CODE")
    private String containerCode;

    /**
     * 第三个交易属性 : 自定义; 存货:  ( 批次号)
     * @since 0.0.1
     */
    @TableField(value = "BATCH_NO")
    private String batchNo;

    /**
     * 第四个交易属性 : 自定义; 存货:  ( 批次时间yyyy-mm-dd hh:mm:ss) ；  针对大多数计算关系，可能只用到第一个属性(第2,3,4个交易属性用不到)
     * @since 0.0.1
     */
    @TableField(value = "BATCH_TIME")
    private Date batchTime;

    /**
     * 被核销交易号 (对应核销交易号的被核销交易号)
     * @since 0.0.1
     */
    @TableField(value = "TRANS_MATCHED_CODE")
    private String transMatchedCode;

    /**
     * 交易主体;   内部的一个利润中心 , 采购部，各个采购部门.  和用户，角色, 组织要一起考虑  ; 连到用户组来定义一个一个利润中心
     * @since 0.0.1
     */
    @TableField(value = "ENTITY_ID")
    private String entityId;

    /**
     * 核销序号
     * @since 0.0.1
     */
    @TableField(value = "TRANS_MATCHED_SEQ")
    private Integer transMatchedSeq;

    /**
     * Quantity 数量
     * @since 0.0.1
     */
    private Double qty;

    /**
     * Quantity 实时数量余额
     * @since 0.3.0
     */
    @TableField(value = "ACTUAL_QTY")
    private Double actualQty;

    /**
     * AVAILABLE_ quantity (可用余额)  每个交易的被核销余额 (同一个SKU)
     * @since 0.0.1
     */
    @TableField(value = "QTY_WATER_BAL")
    private Double qtyWaterBal;

    /**
     * 可被核销余额中, 被锁定部分。 该值<QTY_TB_CLEAR
     * @since 0.0.1
     */
    @TableField(value = "QTY_LOCKED")
    private Double qtyLocked;

    /**
     * quantity to be cleared 可被核销余额
     * @since 0.0.1
     */
    @TableField(value = "QTY_TB_MATCHED")
    private Double qtyTbMatched;

    /**
     * 不含税金额( Amount without TAX)
     * @since 0.0.1
     */
    private Double amount;

    /**
     * Quantity 实时金额余额
     * @since 0.3.0
     */
    @TableField(value = "ACTUAL_AMOUNT")
    private Double actualAmount;

    /**
     * AVAILABLE_ AMOUNT 可用余额(金额）(针对存货, 具体到批次) ； 实际业务中应该没有用.
     * @since 0.0.1
     */
    @TableField(value = "AMNT_WATER_BAL")
    private Double amntWaterBal;

    /**
     * 可被核销余额中, 被锁定部分。
     * @since 0.0.1
     */
    @TableField(value = "AMNT_LOCKED")
    private Double amntLocked;

    /**
     * 可被核销余额
     * @since 0.0.1
     */
    @TableField(value = "AMNT_TB_MATCHED")
    private Double amntTbMatched;

    /**
     * 计算顺序
     * @since 0.3.0
     */
    @TableField(value = "CALC_SEQ")
    private String calcSeq;
    /**
     * 汇率
     * @since 0.0.3
     */
    @TableField(value = "EX_RATE")
    private Double exRate;

    /**
     * 计量单位
     * @since 0.0.3
     */
    @TableField(value = "MEASURE_UNIT")
    private String measureUnit;

    /**
     * 只有2个值, 表示是否为被核销方,
     * 1 :  被核销方, 借记资产费，表示资产费用增加; 或者 贷记，负债增加
     * 0:  核销方, 贷记资产费用, 资产费用减少 ;  ; 或者借记，负债减少
     * @since 0.0.1
     */
    @TableField(value = "MATCH_DIRECTION")
    private Integer matchDirection;

    /**
     * 供应商or 客户
     * @since 0.0.1
     */
    @TableField(value = "DEALER_CODE")
    private String dealerCode;

    /**
     * 是否参加平衡校验；0表示不参与平衡校验；-1表示“-”运算
     * @since 0.0.1
     */
    @TableField(value = "CHECK_DIRECTION")
    private Integer checkDirection;

    /**
     * 表示计算关系是否增加财务校验
     * @since 0.0.1
     */
    @TableField(value = "IS_FINANCE_CHECK")
    private Integer isFinanceCheck;

    /**
     * 用来记录 交易明细ID ，方便追踪数据，要不计算出错了都不知道是因为哪条记录算出来的结果
     * @since 0.0.1
     */
    @TableField(value = "TRANS_DETAIL_ID")
    private String transDetailId;

    /**
     * 被核销交易明细ID
     * @since 0.0.1
     */
    @TableField(value = "TRANS_MATCHED_DETAIL_ID")
    private String transMatchedDetailId;

    /**
     *交易生效时间
     * @since 0.0.1
     */
    @TableField(value = "EFFECTIVE_TIME")
    private Date effectiveTime;

    /**
     *入库生效时间(国富即时调拨使用，添加字段不是用于存储，用于计算库龄)
     * @since 0.3.2
     */
    @TableField(exist = false)
    private Date tradingInTime;

    /**计算时间*/
    @TableField(value = "CALC_TIME")
    private Date calcTime;

    @TableField(exist = false)
    private boolean isUpdate = true;

    /**
     * -1 : to be archived
     * 0:  表示无效.
     * 1:表示有效
     * @since 0.0.1
     */
    private Integer status;

    /**
     * 创建时间
     * @since 0.0.1
     */
    @TableField(value = "CRT_TIME")
    private Date crtTime;

    /**
     * 创建人
     * @since 0.0.1
     */
    private String creator;

    /**
     * 修改时间
     * @since 0.0.1
     */
    @TableField(value = "MOD_TIME")
    private Date modTime;

    /**
     * 修改人
     * @since 0.0.1
     */
    private String modifier;

    /**
     * 备注
     * @since 0.0.1
     */
    private String comment;

    /**
     * 承诺交付时间
     * @since 0.0.1
     */
    @TableField(value = "PROM_DELI_TIME")
    private Date promDeliTime;

    /**
     * 完工产品计划ID
     * @since 1.0.0
     */
    @TableField(value = "BASE_PLAN_ID")
    private String basePlanId;

    /**
     * 计划ID
     * @since 1.0.0
     */
    @TableField(value = "PLAN_ID")
    private String planId;

    /**
     * 计划BOM父ID
     * @since 1.0.0
     */
    @TableField(value = "PARENT_ID")
    private String parentId;

    /**
     * 被核销的计算ID
     * @since 1.0.0
     */
    @TableField(value = "CALC_ID")
    private String calcId;

    /**
     * 核销时间
     * @since 1.0.0
     */
   /* @TableField(value = "MATCHED_TIME")
    private Date matchedTime;*/

    public CalcDetailPojo() {
    }

    public CalcDetailPojo(String transCode) {
        this.transCode = transCode;
    }

    public static CalcDetailPojo addStock(ComponentPojo componentPojo, TransDetail transDetail){
        CalcDetailPojo calcDetailPojo = new CalcDetailPojo();
//        List<CalcFieldPojo> calcFieldPojoList = CacheUtils.getLocationField(componentPojo.getComponentCode(),transDetail.getTransType());
//        for(CalcFieldPojo calcFieldPojo:calcFieldPojoList){
//            String fieldName = calcFieldPojo.getExpression().getExpBalance();
//            String fieldValue = String.valueOf(CalcUtils.getValue(transDetail, fieldName.split("\\.")[1]));
//            Class c = calcDetailPojo.getClass();
//            try {
//                Field field = c.getDeclaredField(calcFieldPojo.getCalcFieldName());
//                field.setAccessible(true);
//                field.set(calcDetailPojo,fieldValue);
//            } catch (Exception e) {
//                throw new CalcException("系统补库存时转换对象属性失败!",e);
//            }
//        }
        String publicMessage = "系统补单("+transDetail.getTransCode()+")";
//        calcDetailPojo.setId(IDUtils.getId());
        calcDetailPojo.setTransCode(publicMessage);
        calcDetailPojo.setTransType("initial");
        calcDetailPojo.setCalcRelCode(componentPojo.getCalcRelCode());
        calcDetailPojo.setMeasureUnit(transDetail.getMeasureUnit());
        calcDetailPojo.setEntityId(transDetail.getEntityId());
        calcDetailPojo.setTransMatchedSeq(0);
        calcDetailPojo.setQty(10000000d);
        calcDetailPojo.setQtyLocked(0d);
        calcDetailPojo.setQtyWaterBal(-componentPojo.getMatchDirection()*10000000d);
        calcDetailPojo.setQtyTbMatched(-componentPojo.getMatchDirection()*10000000d);
        calcDetailPojo.setAmount(0d);
        calcDetailPojo.setAmntLocked(0d);
        calcDetailPojo.setAmntWaterBal(0d);
        calcDetailPojo.setAmntTbMatched(0d);
        calcDetailPojo.setExRate(1d);
        calcDetailPojo.setMatchDirection(-componentPojo.getMatchDirection());
        calcDetailPojo.setCheckDirection(-componentPojo.getCheckDirection());
        calcDetailPojo.setIsFinanceCheck(componentPojo.getIsFinanceCheck());
        calcDetailPojo.setTransDetailId(publicMessage);
        calcDetailPojo.setTransMatchedDetailId(publicMessage);
        //生效时间减1秒
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(transDetail.getEffectiveTime());
        calendar.add(Calendar.SECOND,-1);
        calcDetailPojo.setEffectiveTime(calendar.getTime());
        calcDetailPojo.setCalcTime(calendar.getTime());
        calcDetailPojo.setTransObjId(transDetail.getTransObjId());
        return calcDetailPojo;
    }
    public CalcDetailPojo(String transCode, String transType, String transObjCode, String containerCode, String calcRelCode, double amount) {
        this.transCode = transCode;
        this.transType = transType;
        this.transObjCode = transObjCode;
        this.containerCode = containerCode;
        this.calcRelCode = calcRelCode;
        this.amount = amount;
    }

    public Date getTradingInTime() {
        return tradingInTime;
    }

    public void setTradingInTime(Date tradingInTime) {
        this.tradingInTime = tradingInTime;
    }

    public String getCalcSeq() {
        return calcSeq;
    }

    public void setCalcSeq(String calcSeq) {
        this.calcSeq = calcSeq;
    }

    public Double getActualQty() {
        return actualQty;
    }

    public void setActualQty(Double actualQty) {
        this.actualQty = actualQty;
    }

    public Double getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(Double actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Date getCalcTime() {
        return calcTime;
    }

    public void setCalcTime(Date calcTime) {
        this.calcTime = calcTime;
    }

    public Double getExRate() {
        return exRate;
    }

    public void setExRate(Double exRate) {
        this.exRate = exRate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransCode() {
        return this.transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getTransType() {
        return this.transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getCalcRelCode() {
        return this.calcRelCode;
    }

    public void setCalcRelCode(String calcRelCode) {
        this.calcRelCode = calcRelCode;
    }

    public String getTransObjId() {
        return this.transObjId;
    }

    public void setTransObjId(String transObjId) {
        this.transObjId = transObjId;
    }

    public String getTransObjCode() {
        return this.transObjCode;
    }

    public void setTransObjCode(String transObjCode) {
        this.transObjCode = transObjCode;
    }

    public String getContainerCode() {
        return this.containerCode;
    }

    public void setContainerCode(String containerCode) {
        this.containerCode = containerCode;
    }

    public String getBatchNo() {
        return this.batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Date getBatchTime() {
        return this.batchTime;
    }

    public void setBatchTime(Date batchTime) {
        this.batchTime = batchTime;
    }

    public String getTransMatchedCode() {
        return this.transMatchedCode;
    }

    public void setTransMatchedCode(String transMatchedCode) {
        this.transMatchedCode = transMatchedCode;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public Integer getTransMatchedSeq() {
        return this.transMatchedSeq;
    }

    public void setTransMatchedSeq(Integer transMatchedSeq) {
        this.transMatchedSeq = transMatchedSeq;
    }

    public Double getQty() {
        return this.qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getQtyWaterBal() {
        return this.qtyWaterBal;
    }

    public void setQtyWaterBal(Double qtyWaterBal) {
        this.qtyWaterBal = qtyWaterBal;
    }

    public Double getQtyLocked() {
        return this.qtyLocked;
    }

    public void setQtyLocked(Double qtyLocked) {
        this.qtyLocked = qtyLocked;
    }

    public Double getQtyTbMatched() {
        return this.qtyTbMatched;
    }

    public void setQtyTbMatched(Double qtyTbMatched) {
        this.qtyTbMatched = qtyTbMatched;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmntWaterBal() {
        return this.amntWaterBal;
    }

    public void setAmntWaterBal(Double amntWaterBal) {
        this.amntWaterBal = amntWaterBal;
    }

    public Double getAmntLocked() {
        return this.amntLocked;
    }

    public void setAmntLocked(Double amntLocked) {
        this.amntLocked = amntLocked;
    }

    public Double getAmntTbMatched() {
        return this.amntTbMatched;
    }

    public void setAmntTbMatched(Double amntTbMatched) {
        this.amntTbMatched = amntTbMatched;
    }

    public Integer getMatchDirection() {
        return this.matchDirection;
    }

    public void setMatchDirection(Integer matchDirection) {
        this.matchDirection = matchDirection;
    }

    public String getDealerCode() {
        return this.dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public Integer getCheckDirection() {
        return this.checkDirection;
    }

    public void setCheckDirection(Integer checkDirection) {
        this.checkDirection = checkDirection;
    }

    public Integer getIsFinanceCheck() {
        return this.isFinanceCheck;
    }

    public void setIsFinanceCheck(Integer isFinanceCheck) {
        this.isFinanceCheck = isFinanceCheck;
    }

    public String getTransDetailId() {
        return this.transDetailId;
    }

    public void setTransDetailId(String transDetailId) {
        this.transDetailId = transDetailId;
    }

    public String getTransMatchedDetailId() {
        return this.transMatchedDetailId;
    }

    public void setTransMatchedDetailId(String transMatchedDetailId) {
        this.transMatchedDetailId = transMatchedDetailId;
    }

    public Date getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCrtTime() {
        return this.crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getModTime() {
        return this.modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public String getModifier() {
        return this.modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isUpdate() {
        return isUpdate;
    }

    public void setUpdate(boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getBasePlanId() {
        return basePlanId;
    }

    public void setBasePlanId(String basePlanId) {
        this.basePlanId = basePlanId;
    }

    public Date getPromDeliTime() {
        return this.promDeliTime;
    }

    public void setPromDeliTime(Date promDeliTime) {
        this.promDeliTime = promDeliTime;
    }

    public String getCalcId() {
        return calcId;
    }

    public void setCalcId(String calcId) {
        this.calcId = calcId;
    }

   /* public Date getMatchedTime() {
        return matchedTime;
    }

    public void setMatchedTime(Date matchedTime) {
        this.matchedTime = matchedTime;
    }*/

    @Override
    public String toString() {
        return "CalcDetailPojo{" +
                "id='" + id + '\'' +
                ", transCode='" + transCode + '\'' +
                ", transType='" + transType + '\'' +
                ", calcRelCode='" + calcRelCode + '\'' +
                ", transObjId='" + transObjId + '\'' +
                ", transObjCode='" + transObjCode + '\'' +
                ", containerCode='" + containerCode + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", batchTime=" + batchTime +
                ", transMatchedCode='" + transMatchedCode + '\'' +
                ", entityId='" + entityId + '\'' +
                ", transMatchedSeq=" + transMatchedSeq +
                ", qty=" + qty +
                ", actualQty=" + actualQty +
                ", qtyWaterBal=" + qtyWaterBal +
                ", qtyLocked=" + qtyLocked +
                ", qtyTbMatched=" + qtyTbMatched +
                ", amount=" + amount +
                ", actualAmount=" + actualAmount +
                ", amntWaterBal=" + amntWaterBal +
                ", amntLocked=" + amntLocked +
                ", amntTbMatched=" + amntTbMatched +
                ", calcSeq='" + calcSeq + '\'' +
                ", exRate=" + exRate +
                ", measureUnit='" + measureUnit + '\'' +
                ", matchDirection=" + matchDirection +
                ", dealerCode='" + dealerCode + '\'' +
                ", checkDirection=" + checkDirection +
                ", isFinanceCheck=" + isFinanceCheck +
                ", transDetailId='" + transDetailId + '\'' +
                ", transMatchedDetailId='" + transMatchedDetailId + '\'' +
                ", effectiveTime=" + effectiveTime +
                ", tradingInTime=" + tradingInTime +
                ", calcTime=" + calcTime +
                ", isUpdate=" + isUpdate +
                ", status=" + status +
                ", crtTime=" + crtTime +
                ", creator='" + creator + '\'' +
                ", modTime=" + modTime +
                ", modifier='" + modifier + '\'' +
                ", comment='" + comment + '\'' +
                ", promDeliTime=" + promDeliTime +
                ", basePlanId='" + basePlanId + '\'' +
                ", planId='" + planId + '\'' +
                ", parentId='" + parentId + '\'' +
                ", calcId='" + calcId + '\'' +
                '}';
    }

    /**
     * 判断是否是正验证方向
     * @return  true -- 正方   false -- 负方
     * @since 0.1.0
     */
    public boolean isPositiveCheckDirection(){
        return 1 == this.getCheckDirection();
    }

    public static CalcDetailPojo buildInitial(){
        CalcDetailPojo calcDetailPojo = new CalcDetailPojo();
        calcDetailPojo.setTransType(INIT_TYPE);
        return calcDetailPojo;
    }

//    public void from(CalcDetailDto calcDetailDto) {
//        BeanUtils.copyProperties(calcDetailDto, this); // Copy部分同名的字段值
//    }

    /**
     * 转为DTO
     *
     * @return
     */
//    public CalcDetailDto toDto() {
//        CalcDetailDto dto = new CalcDetailDto();
//        BeanUtils.copyProperties(this, dto);
//        return dto;
//    }

}
