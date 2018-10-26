package com.preshine.calc.api.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

@TableName(value = "C_EXPRESSION_RESOURCE")
public class ExpressionResourcePojo implements Serializable{

	/**
	 * 
	 */
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.INPUT)
	private String id;
	
	/** 表达式 */
	private String expression;
	
	/** 表达式名 */
	@TableField(value = "EXPRESSION_NAME")
	private String expressionName;
	
	/** 计算字段ID*/
	@TableField(value = "CALC_FIELD_ID")
	private String calcFieldId;
	
	/** 表达式类型(余额类，核销类) */
	private String type;

	public ExpressionResourcePojo(){
		
	}
	
	public ExpressionResourcePojo(String calcFieldId){
		this.calcFieldId = calcFieldId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getExpressionName() {
		return expressionName;
	}

	public void setExpressionName(String expressionName) {
		this.expressionName = expressionName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCalcFieldId() {
		return calcFieldId;
	}

	public void setCalcFieldId(String calcFieldId) {
		this.calcFieldId = calcFieldId;
	}

	@Override
	public String toString() {
		return "ExpressionResourcePojo [id=" + id + ", expression=" + expression + ", expressionName=" + expressionName
				+ ", calcFieldId=" + calcFieldId + ", type=" + type + "]";
	}

}
