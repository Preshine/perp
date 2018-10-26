package com.preshine.calc.api.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 *
 * 
 *
 */
@TableName(value = "MATCH_REL")
public class MatchRelPojo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.INPUT)
	private String id;

	/** 交易类型 */
	@TableField(value = "TRANS_TYPE")
	private String transType;

	/** 计算关系编码 */
	@TableField(value = "CALC_REL_CODE")
	private String calcRelCode;

	/** 核销方向 */
	@TableField(value = "MATCH_DIRECTION")
	private Integer matchDirection;

	/** 核销编码 */
	@TableField(value = "MATCH_REL_CODE")
	private String matchRelCode;

	/** 核销名称 */
	@TableField(value = "MATCH_REL_NAME")
	private String matchRelName;
	
	/** 主体 */
	@TableField(value = "ENTITY_ID")
	private String entityId;

	/** 字段组 */
	@TableField(value = "FG_CODE")
	private String fgCode;

	/** 描述 */
	@TableField(value = "DESCRIPTION")
	private String description;

	/** 描述 */
	@TableField(value = "CRT_TIME")
	private String crtTime;

	/** 描述 */
	@TableField(value = "CREATOR")
	private String creator;

	/** 描述 */
	@TableField(value = "MOD_TIME")
	private String modTime;

	/** 描述 */
	@TableField(value = "MODIFIER")
	private String modifier;
	
	@TableField(exist = false)
	private Integer used=0;
	
	public MatchRelPojo() {

	}
	
	public MatchRelPojo(String matchRelCode, Integer matchDirection){
		this.matchRelCode = matchRelCode;
		this.matchDirection = matchDirection;
	}
	
	public MatchRelPojo(String calcRelCode){
		this.calcRelCode = calcRelCode;
	}

	public MatchRelPojo(String id, String transType, String calcRelCode, Integer matchDirection,
                        String matchRelCode, String matchRelName, String entityId,
                        String fgCode, String description, String crtTime, String creator, String modTime, String modifier) {
		this.id = id;
		this.transType = transType;
		this.calcRelCode = calcRelCode;
		this.matchDirection = matchDirection;
		this.matchRelCode = matchRelCode;
		this.matchRelName = matchRelName;
		this.entityId = entityId;
		this.fgCode = fgCode;
		this.description = description;
		this.crtTime = crtTime;
		this.creator = creator;
		this.modTime = modTime;
		this.modifier = modifier;
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

	public String getCalcRelCode() {
		return this.calcRelCode;
	}

	public void setCalcRelCode(String calcRelCode) {
		this.calcRelCode = calcRelCode;
	}

	public Integer getMatchDirection() {
		return this.matchDirection;
	}

	public void setMatchDirection(Integer matchDirection) {
		this.matchDirection = matchDirection;
	}

	public String getMatchRelCode() {
		return this.matchRelCode;
	}

	public void setMatchRelCode(String matchRelCode) {
		this.matchRelCode = matchRelCode;
	}

	public String getMatchRelName() {
		return this.matchRelName;
	}

	public void setMatchRelName(String matchRelName) {
		this.matchRelName = matchRelName;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getFgCode() {
		return fgCode;
	}

	public void setFgCode(String fgCode) {
		this.fgCode = fgCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCrtTime() {
		return crtTime;
	}

	public void setCrtTime(String crtTime) {
		this.crtTime = crtTime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getModTime() {
		return modTime;
	}

	public void setModTime(String modTime) {
		this.modTime = modTime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Integer getUsed() {
		return used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}

	@Override
	public String toString() {
		return "MatchRelPojo [id=" + id + ", transType=" + transType + ", calcRelCode=" + calcRelCode
				+ ", matchDirection=" + matchDirection + ", matchRelCode=" + matchRelCode + ", matchRelName="
				+ matchRelName + ", entityId=" + entityId + ", fgCode=" + fgCode
				+ ", description=" + description + ", crtTime=" + crtTime + ", creator=" + creator + ", modTime="
				+ modTime + ", modifier=" + modifier + ", used=" + used + "]";
	}

}
