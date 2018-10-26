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
@TableName(value = "C_TRANS_TYPE_FG_COMPONENT_REL")
public class TransTypeFgComponentRelPojo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.INPUT)
	private String id;

	/** 交易类型 */
	@TableField(value = "TRANS_TYPE")
	private String transType;

	/** 字段组 */
	@TableField(value = "FG_CODE")
	private String fgCode;

	/** 主体ID */
	@TableField(value = "ENTITY_ID")
	private String entityId;

	/** 核销关系编码 */
	/** @since 0.2.0*/
	@TableField(value = "MATCH_REL_CODE")
	private String matchRelCode;

	/** 是否默认的计算组件 */
	/** @since 0.2.0*/
	@TableField(value = "IS_DEFAULT_COMP")
	private Integer isDefaultComponent;

	/** 是否允许负库存 */
	@TableField(value = "IS_ALLOWED_NEGATIVE")
	private Integer isAllowedNegative;

	@TableField(exist = false)
	private String fgName;

	@TableField(exist = false)
	private String transName;

	/** 计算顺序的排序 */
	@TableField(value = "SORT")
	private Integer sort;

	/** 计算组件ID */
	@TableField(value = "COMPONENT_CODE")
	private String componentCode;

	/** 核销类型 */
	@TableField(value = "MATCH_TYPE")
	private Integer matchType;

	/** 数据获取器ID */
	@TableField(value = "DATA_COLLECTOR_ID")
	private String dataCollectorId;

	@TableField(exist = false)
	private String calcRelCode;

	@TableField(exist = false)
	private List<ComponentPojo> components;

	@TableField(exist = false)
	private ComponentPojo componentPojo;

	public TransTypeFgComponentRelPojo(){

	}

	public TransTypeFgComponentRelPojo(String transType, String fgCode){
		this.transType = transType;
		if(fgCode != null && !fgCode.equals("")){
			this.fgCode = fgCode;
		}
	}

	public TransTypeFgComponentRelPojo(String componentCode, int isAllowed){
		this.componentCode = componentCode;
		this.isAllowedNegative = isAllowed;
	}

	public TransTypeFgComponentRelPojo(String id, String transType, String fgCode, String componentCode, int sort, String entityId) {
		this.id = id;
		this.transType = transType;
		this.fgCode = fgCode;
		this.componentCode = componentCode;
		this.sort = sort;
		this.entityId = entityId;
	}

	public TransTypeFgComponentRelPojo(String transType, String fgCode, String componentCode) {
		this.transType = transType;
		this.fgCode = fgCode;
		this.componentCode = componentCode;
	}

	public String getTransName() {
		return transName;
	}

	public void setTransName(String transName) {
		this.transName = transName;
	}

	public List<ComponentPojo> getComponents() {
		return components;
	}

	public void setComponents(List<ComponentPojo> components) {
		this.components = components;
	}

	public String getFgName() {
		return fgName;
	}

	public void setFgName(String fgName) {
		this.fgName = fgName;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTransType() {
		return this.transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getFgCode() {
		return this.fgCode;
	}

	public void setFgCode(String fgCode) {
		this.fgCode = fgCode;
	}

	public String getComponentCode() {
		return this.componentCode;
	}

	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getMatchRelCode() {
		return matchRelCode;
	}

	public void setMatchRelCode(String matchRelCode) {
		this.matchRelCode = matchRelCode;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public Integer getIsDefaultComponent() {
		return isDefaultComponent;
	}

	public void setIsDefaultComponent(Integer isDefaultComponent) {
		this.isDefaultComponent = isDefaultComponent;
	}

	public Integer getMatchType() {
		return matchType;
	}

	public void setMatchType(Integer matchType) {
		this.matchType = matchType;
	}

	public Integer getIsAllowedNegative() {
		return isAllowedNegative;
	}

	public void setIsAllowedNegative(Integer isAllowedNegative) {
		this.isAllowedNegative = isAllowedNegative;
	}

	public String getCalcRelCode() {
		return calcRelCode;
	}

	public void setCalcRelCode(String calcRelCode) {
		this.calcRelCode = calcRelCode;
	}

	public ComponentPojo getComponentPojo() {
		return componentPojo;
	}

	public void setComponentPojo(ComponentPojo componentPojo) {
		this.componentPojo = componentPojo;
	}

	public String getDataCollectorId() {
		return dataCollectorId;
	}

	public void setDataCollectorId(String dataCollectorId) {
		this.dataCollectorId = dataCollectorId;
	}

	@Override
	public String toString() {
		return "TransTypeFgComponentRelPojo [id=" + id + ", transType=" + transType + ", fgCode=" + fgCode
				+ ", entityId=" + entityId + ", matchRelCode=" + matchRelCode + ", isDefaultComponent="
				+ isDefaultComponent + ", isAllowedNegative=" + isAllowedNegative + ", fgName=" + fgName + ", sort="
				+ sort + ", componentCode=" + componentCode + ", matchType=" + matchType + ", dataCollectorId="
				+ dataCollectorId + ", calcRelCode=" + calcRelCode + ", components=" + components + ", componentPojo="
				+ componentPojo + "]";
	}

}
