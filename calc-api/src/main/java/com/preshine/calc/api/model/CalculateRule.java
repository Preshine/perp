package com.preshine.calc.api.model;

import java.io.Serializable;

/**
 * <p>计算规则</p>
 *
 * @author zhongzhong
 * @since 0.1.0
 */
public class CalculateRule implements Serializable {
    /**
     * 计算关系编码
     *
     * @since 0.1.0
     */
    private String calcRelCode;
    /**
     * 组件code
     *
     * @since 0.1.0
     */
    private String componentCode;
    /**
     * 核销方向
     *
     * @since 0.1.0
     */
    private Integer matchDirection;
    /**
     * 计算方向
     *
     * @since 0.1.0
     */
    private Integer checkDirection;
    /**
     * 是否锁库存
     *
     * @since 0.1.0
     */
    private Integer isLock;
    /**
     * 是否允许负库存
     *
     * @since 0.1.0
     */
    private Integer isAllowedNegative;
    /**
     * 是否增加财务校验
     *
     * @since 0.1.0
     */
    private Integer isFinanceCheck;

    public String getCalcRelCode() {
        return calcRelCode;
    }

    public void setCalcRelCode(String calcRelCode) {
        this.calcRelCode = calcRelCode;
    }

    public Integer getIsAllowedNegative() {
        return isAllowedNegative;
    }

    public void setIsAllowedNegative(Integer isAllowedNegative) {
        this.isAllowedNegative = isAllowedNegative;
    }

    public String getComponentCode() {
        return componentCode;
    }

    public void setComponentCode(String componentCode) {
        this.componentCode = componentCode;
    }

    public Integer getMatchDirection() {
        return matchDirection;
    }

    public void setMatchDirection(Integer matchDirection) {
        this.matchDirection = matchDirection;
    }

    public Integer getCheckDirection() {
        return checkDirection;
    }

    public void setCheckDirection(Integer checkDirection) {
        this.checkDirection = checkDirection;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public Integer getIsFinanceCheck() {
        return isFinanceCheck;
    }

    public void setIsFinanceCheck(Integer isFinanceCheck) {
        this.isFinanceCheck = isFinanceCheck;
    }

    @Override
    public String toString() {
        return "CalculateRule{" +
                "calcRelCode='" + calcRelCode + '\'' +
                ", componentCode='" + componentCode + '\'' +
                ", matchDirection=" + matchDirection +
                ", checkDirection=" + checkDirection +
                ", isLock=" + isLock +
                ", isAllowedNegative=" + isAllowedNegative +
                ", isFinanceCheck=" + isFinanceCheck +
                '}';
    }
}
