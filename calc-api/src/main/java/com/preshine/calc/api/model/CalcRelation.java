package com.preshine.calc.api.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 *
 * 计算关系
 *
 */
@TableName(value = "calc_relation")
public class CalcRelation implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 计算关系ID */
	@TableId(value = "CALC_REL_CODE", type = IdType.INPUT)
	private String calcRelCode;

	/** 计算关系名称 */
	@TableField(value = "CALC_REL_NAME")
	private String calcRelName;

	/** 会计要素 */
	@TableField(value = "CALC_REL_CATE")
	private String calcRelCate;


	/** 是否参与财务效验 */
	@TableField(value = "IS_FINANCE_CHECK")
	private Integer isFinanceCheck;

	/** 是否参与财务效验 */
	@TableField(value = "CALC_FIELD")
	private String calcField;

	/**定位字段*/
	@TableField(value = "CONTAINER_FIELD")
	private String containerField;


	public CalcRelation(String calcRelCode){
		this.calcRelCode = calcRelCode;
	}
	public String getCalcRelCode() {
		return this.calcRelCode;
	}

	public void setCalcRelCode(String calcRelCode) {
		this.calcRelCode = calcRelCode;
	}

	public String getCalcRelName() {
		return this.calcRelName;
	}

	public void setCalcRelName(String calcRelName) {
		this.calcRelName = calcRelName;
	}

	public Integer getIsFinanceCheck() {
		return this.isFinanceCheck;
	}

	public void setIsFinanceCheck(Integer isFinanceCheck) {
		this.isFinanceCheck = isFinanceCheck;
	}

	public String getCalcRelCate() {
		return calcRelCate;
	}

	public void setCalcRelCate(String calcRelCate) {
		this.calcRelCate = calcRelCate;
	}

	public String getCalcField() {
		return calcField;
	}

	public void setCalcField(String calcField) {
		this.calcField = calcField;
	}

	public String getContainerField() {
		return containerField;
	}

	public void setContainerField(String containerField) {
		this.containerField = containerField;
	}

	@Override
	public String toString() {
		return "CalcRelation{" +
				"calcRelCode='" + calcRelCode + '\'' +
				", calcRelName='" + calcRelName + '\'' +
				", calcRelCate='" + calcRelCate + '\'' +
				", isFinanceCheck=" + isFinanceCheck +
				", calcField='" + calcField + '\'' +
				", containerField='" + containerField + '\'' +
				'}';
	}

	public enum CalcRel{
		CUSTOMER("crclnt","客户"),
		SUPPLIER("crsppl","供应商"),
		INVENTORY_IN_STOCK("crinvn","在库存货"),
		MONEY("crcash","资金"),
		USER("cruser","用户"),
		PERIOD_COST("crperd","期间费用");

		private String name;

		private String code;

		CalcRel(String code,String name){
			this.code = code;
			this.name = name;
		}


		public String getCode() {
			return code;
		}

		public String getName() {
			return name;
		}

	}

}
