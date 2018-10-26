package com.preshine.calc.api.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 
 *
 */
@TableName(value = "C_COM_FIELD_EXP_REL")
public class ComFieldExpRelPojo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.INPUT)
	private String id;

	/** 计算组件ID */
	@TableField(value = "COMPONENT_CODE")
	private String componentCode;

	/** 计算字段ID */
	@TableField(value = "CALC_FIELD_ID")
	private String calcFieldId;

	/**  字段组，这是第二版本新添加字段，在同一个流程下两个不同明细添加一模一样计算组件时区分开其拥有的字段 */
	@TableField(value = "FG_CODE")
	private String fgCode;
	
	/** 表达式ID */
	@TableField(value = "EXP_ID")
	private String expId;
	
	/** 流程类型 */
	@TableField(value = "TRANS_TYPE")
	private String transType;
	
	/** 是否是主计算字段 */
	@TableField(value = "IS_PRIMARY")
	private Boolean isPrimary=false;
	
	/** 是否是主计算字段 */
	@TableField(value = "IS_FIRST")
	private Boolean isFirst;
	
	/** 计算字段的重命名描述 */
	private String remark;

	/** 字段在某个流程下某个字段组的排序*/
	private Integer sort;
	
	@TableField(exist = false)
	private CalcFieldPojo calcFieldPojo;
	
	@TableField(exist = false)
	private ExpressionPojo expressionPojo;
	
	@TableField(exist = false)
	private List<ExpressionResourcePojo> expressionResources;
	
	public ComFieldExpRelPojo(){
		
	}
	
	public ComFieldExpRelPojo(String componentCode, String calcFieldId, String transType, String fgCode){
		this.componentCode = componentCode;
		this.calcFieldId = calcFieldId;
		this.transType = transType;
		this.fgCode = fgCode;
	}
	
	public ComFieldExpRelPojo(String componentCode){
		this.componentCode = componentCode;
	}
	
	public ComFieldExpRelPojo(String componentCode, String calcFieldId, boolean isFirst){
		this.componentCode = componentCode;
		this.calcFieldId = calcFieldId;
		this.isFirst = isFirst;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComponentCode() {
		return componentCode;
	}

	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}

	public String getCalcFieldId() {
		return calcFieldId;
	}

	public void setCalcFieldId(String calcFieldId) {
		this.calcFieldId = calcFieldId;
	}

	public String getExpId() {
		return expId;
	}

	public void setExpId(String expId) {
		this.expId = expId;
	}

	public Boolean getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public Boolean getIsFirst() {
		return isFirst;
	}

	public void setIsFirst(Boolean isFirst) {
		this.isFirst = isFirst;
	}

	public CalcFieldPojo getCalcFieldPojo() {
		return calcFieldPojo;
	}

	public void setCalcFieldPojo(CalcFieldPojo calcFieldPojo) {
		this.calcFieldPojo = calcFieldPojo;
	}

	public ExpressionPojo getExpressionPojo() {
		return expressionPojo;
	}

	public void setExpressionPojo(ExpressionPojo expressionPojo) {
		this.expressionPojo = expressionPojo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<ExpressionResourcePojo> getExpressionResources() {
		return expressionResources;
	}

	public void setExpressionResources(List<ExpressionResourcePojo> expressionResources) {
		this.expressionResources = expressionResources;
	}

	public String getFgCode() {
		return fgCode;
	}

	public void setFgCode(String fgCode) {
		this.fgCode = fgCode;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "ComFieldExpRelPojo{" +
				"id='" + id + '\'' +
				", componentCode='" + componentCode + '\'' +
				", calcFieldId='" + calcFieldId + '\'' +
				", fgCode='" + fgCode + '\'' +
				", expId='" + expId + '\'' +
				", transType='" + transType + '\'' +
				", isPrimary=" + isPrimary +
				", isFirst=" + isFirst +
				", remark='" + remark + '\'' +
				", sort=" + sort +
				", calcFieldPojo=" + calcFieldPojo +
				", expressionPojo=" + expressionPojo +
				", expressionResources=" + expressionResources +
				'}';
	}
}
