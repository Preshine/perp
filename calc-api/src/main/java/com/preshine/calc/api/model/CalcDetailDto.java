package com.preshine.calc.api.model;




import java.io.Serializable;
import java.util.Date;

/**
 *
 * 交易计算表
 *
 */
public class CalcDetailDto implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 *
	 * @since 1.0
	 */
//	@ApiModelProperty(required = true, value = "期初余额ID")
	private String id;

	/**  */
//	@ApiModelProperty(required = true, value = "交易号")
	private String transCode;

	/** 交易类型: 如"采购入库"  ; (方便核销计算的时候查询)  */
//	@ApiModelProperty(required = true, value = "交易类型")
	private String transType;

//	@ApiModelProperty(required = true, value = "计算关系")
	private String calcRelCode;

	/** 交易属性1st : 自定义; 存货:  (stock_code)  ;  供应商往来: deal_code ;    资金;  */
//	@ApiModelProperty(required = true, value = "存货编码/对象编码")
	private String transObjCode;

	/** 第二个交易属性 : 自定义; 存货:  ( 仓库)  */
//	@ApiModelProperty(required = true, value = "仓库编码")
	private String containerCode;

	/** 第三个交易属性 : 自定义; 存货:  ( 批次号)  */
//	@ApiModelProperty(required = true, value = "批次号")
	private String batchNo;

	/** 第四个交易属性 : 自定义; 存货:  ( 批次时间yyyy-mm-dd hh:mm:ss) ；  针对大多数计算关系，可能只用到第一个属性(第2,3,4个交易属性用不到) */
//	@ApiModelProperty(required = true, value = "批次时间")
	private Date batchTime;

	/** 被核销交易号 (对应核销交易号的被核销交易号) */
//	@ApiModelProperty(required = true, value = "被核销的交易号")
	private String transMatchedCode;

	/** 交易主体;   内部的一个利润中心 , 采购部，各个采购部门.  和用户，角色, 组织要一起考虑  ; 连到用户组来定义一个一个利润中心 */
//	@ApiModelProperty(required = true, value = "交易主体")
	private String transEntity;

	/** 核销序号 */
	private Integer transMatchedSeq;

	/** Quantity 数量 */
//	@ApiModelProperty(required = true, value = "发生数量")
	private Double qty;

	/** AVAILABLE_ quantity (可用余额)  每个交易的被核销余额 (同一个SKU)  */
//	@ApiModelProperty(required = true, value = "数量流水余额")
	private Double qtyWaterBal;

	/** 可被核销余额中, 被锁定部分。 该值<QTY_TB_CLEAR */
	private Double qtyLocked;

	/** quantity to be cleared 可被核销余额 */
//	@ApiModelProperty(required = true, value = "数量余额")
	private Double qtyTbMatched;

	/** 不含税金额( Amount without TAX) */
//	@ApiModelProperty(required = true, value = "发生金额")
	private Double amount;

	/** AVAILABLE_ AMOUNT 可用余额(金额）(针对存货, 具体到批次) ； 实际业务中应该没有用.  */
//	@ApiModelProperty(required = true, value = "金额流水余额")
	private Double amntWaterBal;

	/** 可被核销余额中, 被锁定部分。 */
	private Double amntLocked;

	/** 可被核销余额 */
//	@ApiModelProperty(required = true, value = "金额余额")
	private Double amntTbMatched;

	/** 汇率 */
//	@ApiModelProperty(required = true, value = "汇率")
	private double exRate;//汇率

	private String measureUnit;//汇率

	/** 只有2个值, 表示是否为被核销方,
	 1 :  被核销方, 借记资产费，表示资产费用增加; 或者 贷记，负债增加
	 0:  核销方, 贷记资产费用, 资产费用减少 ;  ; 或者借记，负债减少 */
//	@ApiModelProperty(required = true, value = "核销方向 ，1 :  被核销方 0:  核销方")
	private Integer matchDirection;

	/** 供应商or 客户 */
//	@ApiModelProperty(required = true, value = "往来编码")
	private String dealerCode;

	/** 是否参加平衡校验；0表示不参与平衡校验；-1表示“-”运算 */
//	@ApiModelProperty(required = true, value = "是否参加平衡校验；0表示不参与平衡校验")
	private Integer checkDirection;

	/** 表示计算关系是否增加财务校验 */
	private Integer isFinanceCheck;

	/** 用来记录 交易明细ID ，方便追踪数据，要不计算出错了都不知道是因为哪条记录算出来的结果 */
	private String transDetailId;

	/**  */
	private String transMatchedDetailId;

	/**  */
//	@ApiModelProperty(required = true, value = "交易生效时间")
	private Date effectiveTime;
	
	private boolean isUpdate=true;
	
//	@ApiModelProperty(required = true, value = "单价")
	private Double price;

	/** -1 : to be archived
	 0:  表示无效.
	 1:表示有效
	 */
	private Integer status;

	/**  */
	private Date crtTime;

	/**  */
	private String creator;

	/**  */
	private Date modTime;

	/**  */
	private String modifier;

	/**  */
	private String comment;

	/* 数据类型*/
//	@ApiModelProperty(required = true, value = "数据类型,存货")
	private String dataTpye;

	public CalcDetailDto(){}

	public CalcDetailDto(String transCode){
		this.transCode = transCode;
	}


	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
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

	public String getTransEntity() {
		return this.transEntity;
	}

	public void setTransEntity(String transEntity) {
		this.transEntity = transEntity;
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

	public String getDataTpye() {
		return dataTpye;
	}

	public void setDataTpye(String dataTpye) {
		this.dataTpye = dataTpye;
	}

	public double getExRate() {
		return exRate;
	}

	public void setExRate(double exRate) {
		this.exRate = exRate;
	}

	public String getMeasureUnit() {
		return measureUnit;
	}

	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
	}

	@Override
	public String toString() {
		return "CalcDetailDto{" +
				"id='" + id + '\'' +
				", transCode='" + transCode + '\'' +
				", transType='" + transType + '\'' +
				", calcRelCode='" + calcRelCode + '\'' +
				", transObjCode='" + transObjCode + '\'' +
				", containerCode='" + containerCode + '\'' +
				", batchNo='" + batchNo + '\'' +
				", batchTime=" + batchTime +
				", transMatchedCode='" + transMatchedCode + '\'' +
				", transEntity='" + transEntity + '\'' +
				", transMatchedSeq=" + transMatchedSeq +
				", qty=" + qty +
				", qtyWaterBal=" + qtyWaterBal +
				", qtyLocked=" + qtyLocked +
				", qtyTbMatched=" + qtyTbMatched +
				", amount=" + amount +
				", amntWaterBal=" + amntWaterBal +
				", amntLocked=" + amntLocked +
				", amntTbMatched=" + amntTbMatched +
				", exRate=" + exRate +
				", measureUnit='" + measureUnit + '\'' +
				", matchDirection=" + matchDirection +
				", dealerCode='" + dealerCode + '\'' +
				", checkDirection=" + checkDirection +
				", isFinanceCheck=" + isFinanceCheck +
				", transDetailId='" + transDetailId + '\'' +
				", transMatchedDetailId='" + transMatchedDetailId + '\'' +
				", effectiveTime=" + effectiveTime +
				", isUpdate=" + isUpdate +
				", status=" + status +
				", crtTime=" + crtTime +
				", creator='" + creator + '\'' +
				", modTime=" + modTime +
				", modifier='" + modifier + '\'' +
				", comment='" + comment + '\'' +
				", dataTpye='" + dataTpye + '\'' +
				'}';
	}
}
