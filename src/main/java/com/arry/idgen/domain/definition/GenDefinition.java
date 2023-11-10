package com.arry.idgen.domain.definition;

/**
 * @author arry
 * @description 格式定义
 * @since 1.0
 */
public abstract class GenDefinition {


    /**
     * 流水号
     */
    protected String serialText;

    /**
     * 流水号长度
     */
    protected int serialLength;


    /**
     * 日期号
     */
    protected String dateText;

    /**
     * 日期号长度
     */
    protected int dateLength;
}
