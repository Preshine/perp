package com.preshine.calc.api.service;

public interface Calculate<T> {

    /**
     *  准备计算数据
     * @param t
     */
    void prepare(T t);

    /**
     *  开始计算数据
     * @param t
     */
    void execute(T t);

    /**
     *  完成计算
     * @param t
     */
    boolean complete(T t);
}
