package com.preshine.calc.api.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * <p>字段组件</p>
 *
 * @author zhongzhong
 * @see CalcFieldPojo
 * @since 0.1.0
 */
public class FieldComponent implements Serializable {
    /**
     * 字段组件名称
     *
     * @since 0.1.0
     */
    private String name;
    /**
     * 组件包含的所有字段
     *
     * @since 0.1.0
     */
    private List<CalcFieldPojo> fields = new ArrayList<>();
    /**
     * 主计算字段
     *
     * @since 0.1.0
     */
    private CalcFieldPojo primaryField;


    /**
     * <p>根据字段名称获取计算字段对象</p>
     *
     * @param name String  字段名称
     * @return CalcFieldPojo 计算字段对象
     * @since 0.1.0
     */
    public CalcFieldPojo getFieldByName(String name) {
        CalcFieldPojo result = this.getOrDefault(name, null);

        if (result == null) {
            throw new IllegalArgumentException("不存在的字段：" + name);
        }
        return result;
    }

    /**
     * <p>根据字段名称获取计算字段对象，如果没有获取到，则返默认对象defaultValue</p>
     *
     * @param name         String  字段名称
     * @param defaultValue CalcFieldPojo 默认对象
     * @return CalcFieldPojo 计算字段对象
     * @since 0.3.1
     */
    public CalcFieldPojo getOrDefault(String name, CalcFieldPojo defaultValue) {
        if (name.equalsIgnoreCase(primaryField.getCalcFieldName())) {
            return primaryField;
        }
        Optional<CalcFieldPojo> optional = fields.stream().filter(field -> name.equalsIgnoreCase(field.getCalcFieldName()))//
                .findFirst();

        return optional.orElse(defaultValue);
    }

    /**
     * <p>判断字段对象是否存在的方法</p>
     *
     * @param name String  字段名称
     * @return true存在 false不存在
     * @since 0.3.1
     */
    public boolean exists(String name) {
        return this.getOrDefault(name, null) != null;
    }

    public CalcFieldPojo getPrimaryField() {
        return primaryField;
    }

    public void setPrimaryField(CalcFieldPojo primaryField) {
        this.primaryField = primaryField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CalcFieldPojo> getFields() {
        return fields;
    }

    public void setFields(List<CalcFieldPojo> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "FieldComponent{" +
                "name='" + name + '\'' +
                ", fields=" + fields +
                ", primaryField=" + primaryField +
                '}';
    }
}
