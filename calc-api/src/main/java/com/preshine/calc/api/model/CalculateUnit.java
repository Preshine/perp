package com.preshine.calc.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <p>计算单元</p>
 *
 */
public class CalculateUnit implements Serializable {
    /**
     * 计算库数据id
     */
    private String id;
    /**
     * 计算对象名称
     */
    private String name;
    /**
     * 计算字段组件对象
     */
    private FieldComponent fieldComponent;

    /**
     * 核销数据的计算字段组件
     */
    private FieldComponent matchFieldComponent;
    /**
     * 核销数据集合
     */
    private List<CalculateUnit> calcDatas = new ArrayList<>();
    /**
     * 计算规则对象
     *
     * @since 0.1.0
     */
    private CalculateRule calculateRule;
    /**
     * 存储核销过程中，新增的记录
     *
     * @since 0.1.0
     */
    private List<CalculateUnit> results = new ArrayList<>();

    /**
     * 是否更新记录，true更新，false新增
     *
     * @since 0.1.0
     */
    private boolean isUpdate = true;

    /**
     * 是否需要核销计算
     *
     * @since 0.1.0
     */
    private boolean isCalc = true;

    /**
     * 是否需要参与平衡校验
     *
     * @since 0.1.0
     */
    private boolean isCheck = true;

    /**
     * <p>计算字段,可能取值：
     * 1）qty
     * 2）amount
     * 3）qty,amount
     * </p>
     *
     * @since 0.1.0
     */
    private String calcField;

    /**
     * 当前明细对象
     *
     * @since 0.1.0
     */
    private DetailBase currentDetail;

    public CalculateUnit() {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.fieldComponent = new FieldComponent();
        this.calculateRule = new CalculateRule();
        this.matchFieldComponent = new FieldComponent();
    }

    public void setFlag(boolean isUpdate, boolean isCalc, boolean isCheck) {
        this.isUpdate = isUpdate;
        this.isCalc = isCalc;
        this.isCheck = isCheck;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }

    public DetailBase getCurrentDetail() {
        return currentDetail;
    }

    public void setCurrentDetail(DetailBase currentDetail) {
        this.currentDetail = currentDetail;
    }

    public String getCalcField() {
        return calcField;
    }

    public void setCalcField(String calcField) {
        this.calcField = calcField;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isCalc() {
        return isCalc;
    }

    public void setCalc(boolean calc) {
        isCalc = calc;
    }

    public boolean isUpdate() {
        return isUpdate;
    }

    public void setUpdate(boolean update) {
        isUpdate = update;
    }

    public FieldComponent getMatchFieldComponent() {
        return matchFieldComponent;
    }

    public void setMatchFieldComponent(FieldComponent matchFieldComponent) {
        this.matchFieldComponent = matchFieldComponent;
    }

    public List<CalculateUnit> getResults() {
        return results;
    }

    public void setResults(List<CalculateUnit> results) {
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public FieldComponent getFieldComponent() {
        return fieldComponent;
    }

    public void setFieldComponent(FieldComponent fieldComponent) {
        this.fieldComponent = fieldComponent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CalculateUnit> getCalcDatas() {
        return calcDatas;
    }

    public void setCalcDatas(List<CalculateUnit> calcDatas) {
        this.calcDatas = calcDatas;
    }

    public CalculateRule getCalculateRule() {
        return calculateRule;
    }

    public void setCalculateRule(CalculateRule calculateRule) {
        this.calculateRule = calculateRule;
    }

    @Override
    public String toString() {
        return "CalculateUnit{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", fieldComponent=" + fieldComponent +
                ", matchFieldComponent=" + matchFieldComponent +
                ", calculateRule=" + calculateRule +
                ", isUpdate=" + isUpdate +
                ", isCalc=" + isCalc +
                ", isCheck=" + isCheck +
                ", calcField='" + calcField + '\'' +
                ", currentDetail=" + currentDetail +
                '}';
    }
}
