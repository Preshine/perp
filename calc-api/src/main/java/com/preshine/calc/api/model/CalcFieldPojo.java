package com.preshine.calc.api.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 *
 * 计算字段
 *
 */
@TableName(value = "C_CALC_FIELD")
public class CalcFieldPojo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.INPUT)
	private String id;

	/** 计算名称 */
	@TableField(value = "CALC_FIELD_NAME")
	private String calcFieldName;

	/** 字段类型 */
	@TableField(value = "CALC_FIELD_TYPE")
	private Integer calcFieldType;
	
	/** 字段类型 */
	@TableField(value = "MAPPING_FIELD_NAME")
	private String mappingFieldName;

	/** 字段的默认排序*/
	private Integer sort;

	@TableField(exist = false)
	private Class fieldType;
	/**  */
	@TableField(value = "TITLE")
	private String title;
	
	@TableField(exist = false)
	private Boolean isPrimary;
	
	@TableField(exist = false)
	private ExpressionPojo expression;
	
	@TableField(exist = false)
	private String expId;
	
	@TableField(exist = false)
	private Object value;

	public CalcFieldPojo(){

	}

	public CalcFieldPojo(String id){
		this.id = id;
	}

	public CalcFieldPojo(int calcFieldType){
		this.calcFieldType = calcFieldType;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCalcFieldName() {
		return this.calcFieldName;
	}

	public void setCalcFieldName(String calcFieldName) {
		this.calcFieldName = calcFieldName;
	}

	public Integer getCalcFieldType() {
		return this.calcFieldType;
	}

	public void setCalcFieldType(Integer calcFieldType) {
		this.calcFieldType = calcFieldType;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ExpressionPojo getExpression() {
		return expression;
	}

	public void setExpression(ExpressionPojo expression) {
		this.expression = expression;
	}

	public Boolean getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getMappingFieldName() {
		return mappingFieldName;
	}

	public void setMappingFieldName(String mappingFieldName) {
		this.mappingFieldName = mappingFieldName;
	}

	public Class getFieldType() {
		return fieldType;
	}

	public void setFieldType(Class fieldType) {
		this.fieldType = fieldType;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getExpId() {
		return expId;
	}

	public void setExpId(String expId) {
		this.expId = expId;
	}

	@Override
	public String toString() {
		return "CalcFieldPojo [id=" + id + ", calcFieldName=" + calcFieldName + ", calcFieldType=" + calcFieldType
				+ ", mappingFieldName=" + mappingFieldName + ", sort=" + sort + ", fieldType=" + fieldType + ", title="
				+ title + ", isPrimary=" + isPrimary + ", expression=" + expression + ", expId=" + expId + ", value="
				+ value + "]";
	}

}
