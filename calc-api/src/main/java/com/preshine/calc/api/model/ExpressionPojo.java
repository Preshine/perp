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
@TableName(value = "C_EXPRESSION")
public class ExpressionPojo implements Serializable {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**  */
    @TableId(type = IdType.INPUT)
    private String id;

    /**
     * 表达式类型
     */
    @TableField(value = "CALC_FIELD_ID")
    private String calcFieldId;

    /**
     * 表达式名称
     */
    @TableField(value = "EXP_NAME")
    private String expName;

    /**
     * 余额计算表达式
     */
    @TableField(value = "EXP_BALANCE")
    private String expBalance;

    /**
     * 核销计算表达式
     */
    @TableField(value = "EXP_VERIFICATION")
    private String expVerification;

    /**
     * 核销对象KEY
     */
    @TableField(value = "VERI_NAME")
    private String veriName;

    /**
     * 是否默认表达式
     */
    @TableField(value = "EXP_TYPE")
    private String expType;

    @TableField(exist = false)
    private String calcFieldName;

    public ExpressionPojo() {

    }

    /**
     * 查询默认字段的表达式
     *
     * @param calcFieldId String 计算字段ID
     * @param expType     String 表达式类型
     */
    public ExpressionPojo(String calcFieldId, String expType) {
        this.calcFieldId = calcFieldId;
        this.expType = expType;
    }

    public ExpressionPojo(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCalcFieldId() {
        return calcFieldId;
    }

    public void setCalcFieldId(String calcFieldId) {
        this.calcFieldId = calcFieldId;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public String getVeriName() {
        return this.veriName;
    }

    public void setVeriName(String veriName) {
        this.veriName = veriName;
    }

    public String getExpBalance() {
        return expBalance;
    }

    public void setExpBalance(String expBalance) {
        this.expBalance = expBalance;
    }

    public String getExpVerification() {
        return expVerification;
    }

    public void setExpVerification(String expVerification) {
        this.expVerification = expVerification;
    }

    public String getCalcFieldName() {
        return calcFieldName;
    }

    public void setCalcFieldName(String calcFieldName) {
        this.calcFieldName = calcFieldName;
    }

    public String getExpType() {
        return expType;
    }

    public void setExpType(String expType) {
        this.expType = expType;
    }

    @Override
    public String toString() {
        return "ExpressionPojo{" +
                "id='" + id + '\'' +
                ", calcFieldId='" + calcFieldId + '\'' +
                ", expName='" + expName + '\'' +
                ", expBalance='" + expBalance + '\'' +
                ", expVerification='" + expVerification + '\'' +
                ", veriName='" + veriName + '\'' +
                ", expType='" + expType + '\'' +
                ", calcFieldName='" + calcFieldName + '\'' +
                '}';
    }
}

