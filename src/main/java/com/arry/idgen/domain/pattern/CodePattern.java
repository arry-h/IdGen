package com.arry.idgen.domain.pattern;

/**
 * @author arry
 * @description 编码生成模板：自定义内容 + 6位日期号 + 自定义位数流水号
 * @since 1.0
 */
public class CodePattern {

    /**
     * 前缀
     */
    private String customPrefix;

    /**
     * 中间部分
     */
    private String middle;

    /**
     * 后缀
     */
    private String last;

    public String getCustomPrefix() {
        return customPrefix;
    }

    public void setCustomPrefix(String customPrefix) {
        this.customPrefix = customPrefix;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * 编码字符串
     */
    private String text;
}
