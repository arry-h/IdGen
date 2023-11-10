package com.arry.idgen.resolver;

import com.arry.idgen.domain.GenReq;
import com.arry.idgen.domain.definition.GenDefinition;

/**
 * @author arry
 * @description 格式解析器
 * @since 1.0
 */
public interface IDefinitionResolver {

    /**
     * 是否支持解析
     * @param definition 格式定义
     * @return bool
     */
    boolean support(GenDefinition definition);

    /**
     * 解析
     * @param definition 格式定义
     */
    void resolve(GenDefinition definition);
}
