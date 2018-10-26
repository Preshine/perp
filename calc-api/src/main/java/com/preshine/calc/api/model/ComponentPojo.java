package com.preshine.calc.api.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 *
 *
 */
@TableName(value = "C_COMPONENT")
public class ComponentPojo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 计算关系ID */
	@TableId(type = IdType.INPUT)
	private String id;

	/** 计算关系ID */
	@TableField(value = "COMPONENT_CODE")
	private String componentCode;

	/** 主体ID */
	@TableField(value = "ENTITY_ID")
	private String entityId;

	/** 计算关系ID */
	@TableField(value = "CALC_REL_CODE")
	private String calcRelCode;

	/** 数据获取器ID */
	@TableField(exist = false)
	private String dataCollectorId;

	/** 计算组件名称 */
	@TableField(value = "COMPONENT_NAME")
	private String componentName;

	/** 计算方向 */
	@TableField(value = "CHECK_DIRECTION")
	private Integer checkDirection;

	/** 核销方向 */
	@TableField(value = "MATCH_DIRECTION")
	private Integer matchDirection;

	/** 是否锁库存 */
	@TableField(value = "IS_LOCK")
	private Integer isLock;

	/**
	 * -1 : to be archived
	 * 0:  表示无效.
	 * 1:表示有效
	 */
	private Integer status;

	/**  */
	@TableField(value = "CRT_TIME")
	private Date crtTime;

	/**  */
	private String creator;

	/**  */
	@TableField(value = "MOD_TIME")
	private Date modTime;

	/**  */
	private String modifier;

	/**  */
	private String comment;

	/** 是否允许负库存 */
	@TableField(exist = false)
	private Integer isAllowedNegative;

	/** 核销关系编码 */
	@TableField(exist = false)
	private String matchRelCode;

	/** 字段组编码 */
	@TableField(exist = false)
	private String fgCode;

	/** 是否参与财务效验 */
	@TableField(exist = false)
	private Integer isFinanceCheck;

	/** 计算关系名称 */
	@TableField(exist = false)
	private String calcRelName;

	/** 是否默认核销 */
	@TableField(exist = false)
	private Integer isDefaultComponent;

	/** 计算字段 */
	@TableField(exist = false)
	private String calcField;

	/** 流程类型 */
	@TableField(exist = false)
	private String transType;

	/** 核销类型 */
	@TableField(exist = false)
	private Integer matchType;

	/** 数据获取器对象 */
	@TableField(exist = false)
	private DataCollectorPojo dataCollectorPojo;

	@TableField(exist = false)
	private List<CalcDetailPojo> calcDetailPojos;

	@TableField(exist = false)
	private transient List<Map<String,Object>> fields;

	@TableField(exist = false)
	private transient TransDetail transDetail;

	@TableField(exist = false)
	private transient List<CalcFieldPojo> locationFields;

	public TransDetail getTransDetail() {
		return transDetail;
	}

	public void setTransDtail(TransDetail transDetail) {
		this.transDetail = transDetail;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<CalcDetailPojo> getCalcDetailPojos() {
		return calcDetailPojos;
	}

	public List<Map<String, Object>> getFields() {
		return fields;
	}

	public void setFields(List<Map<String, Object>> fields) {
		this.fields = fields;
	}

	public List<CalcFieldPojo> getLocationFields() {
		return locationFields;
	}

	public void setLocationFields(List<CalcFieldPojo> locationFields) {
		this.locationFields = locationFields;
	}

	/**
	 * <p>查询核销对象使用</p>
	 */
	public ComponentPojo(String calcRelCode, int checkDirection, int matchDirection){
		this.calcRelCode = calcRelCode;
		this.checkDirection = checkDirection;
		this.matchDirection = matchDirection;
	}

	/**
	 * <p>有BOM使用，在有BOM的情况下计算中的明细是拆分后的多条明细，
	 * 需要依次计算，calcRelCode用于判断如果有计算关系参数，则给BOM使用</p>
	 */
	public ComponentPojo(String componentCode, String calcRelCode){
		this.componentCode = componentCode;
		if(!StringUtils.isEmpty(calcRelCode)){
			this.calcRelCode = calcRelCode;
		}
	}

	/**
	 * 根据计算组件编码查询
	 */
	public ComponentPojo(String componentCode){
		this.componentCode = componentCode;
	}

	public void setCalcDetailPojos(List<CalcDetailPojo> calcDetailPojos) {
		this.calcDetailPojos = calcDetailPojos;
	}

	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getCalcRelCode() {
		return this.calcRelCode;
	}

	public void setCalcRelCode(String calcRelCode) {
		this.calcRelCode = calcRelCode;
	}

	public String getDataCollectorId() {
		return this.dataCollectorId;
	}

	public void setDataCollectorId(String dataCollectorId) {
		this.dataCollectorId = dataCollectorId;
	}

	public String getComponentName() {
		return this.componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentCode() {
		return this.componentCode;
	}

	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}

	public Integer getCheckDirection() {
		return this.checkDirection;
	}

	public void setCheckDirection(Integer checkDirection) {
		this.checkDirection = checkDirection;
	}

	public Integer getMatchDirection() {
		return this.matchDirection;
	}

	public void setMatchDirection(Integer matchDirection) {
		this.matchDirection = matchDirection;
	}

	public Integer getIsLock() {
		return this.isLock;
	}

	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}

	public Integer getIsAllowedNegative() {
		return this.isAllowedNegative;
	}

	public void setIsAllowedNegative(Integer isAllowedNegative) {
		this.isAllowedNegative = isAllowedNegative;
	}

	public String getMatchRelCode() {
		return this.matchRelCode;
	}

	public void setMatchRelCode(String matchRelCode) {
		this.matchRelCode = matchRelCode;
	}

	public Integer getIsFinanceCheck() {
		return isFinanceCheck;
	}

	public void setIsFinanceCheck(Integer isFinanceCheck) {
		this.isFinanceCheck = isFinanceCheck;
	}

	public String getCalcRelName() {
		return calcRelName;
	}

	public void setCalcRelName(String calcRelName) {
		this.calcRelName = calcRelName;
	}

	public ComponentPojo(){

	}

	public DataCollectorPojo getDataCollectorPojo() {
		return dataCollectorPojo;
	}

	public void setDataCollectorPojo(DataCollectorPojo dataCollectorPojo) {
		this.dataCollectorPojo = dataCollectorPojo;
	}

	public String getCalcField() {
		return calcField;
	}

	public void setCalcField(String calcField) {
		this.calcField = calcField;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public Integer getIsDefaultComponent() {
		return isDefaultComponent;
	}

	public void setIsDefaultComponent(Integer isDefaultComponent) {
		this.isDefaultComponent = isDefaultComponent;
	}
	public String getFgCode() {
		return fgCode;
	}
	public void setFgCode(String fgCode) {
		this.fgCode = fgCode;
	}

	public Integer getMatchType() {
		return matchType;
	}

	public void setMatchType(Integer matchType) {
		this.matchType = matchType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCrtTime() {
		return crtTime;
	}

	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "ComponentPojo{" +
				"id='" + id + '\'' +
				", componentCode='" + componentCode + '\'' +
				", entityId='" + entityId + '\'' +
				", calcRelCode='" + calcRelCode + '\'' +
				", dataCollectorId='" + dataCollectorId + '\'' +
				", componentName='" + componentName + '\'' +
				", checkDirection=" + checkDirection +
				", matchDirection=" + matchDirection +
				", isLock=" + isLock +
				", isAllowedNegative=" + isAllowedNegative +
				", matchRelCode='" + matchRelCode + '\'' +
				", fgCode='" + fgCode + '\'' +
				", isFinanceCheck=" + isFinanceCheck +
				", calcRelName='" + calcRelName + '\'' +
				", isDefaultComponent=" + isDefaultComponent +
				", calcField='" + calcField + '\'' +
				", transType='" + transType + '\'' +
				", matchType=" + matchType +
				", dataCollectorPojo=" + dataCollectorPojo +
				", calcDetailPojos=" + calcDetailPojos +
				", fields=" + fields +
				'}';
	}
}