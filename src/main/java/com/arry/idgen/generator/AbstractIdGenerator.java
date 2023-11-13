package com.arry.idgen.generator;

import com.arry.idgen.domain.CodeReq;
import com.arry.idgen.domain.GenReq;
import com.arry.idgen.domain.Result;
import com.arry.idgen.domain.definition.GenDefinition;

/**
 * @author arry
 * @description
 * @since 1.0
 */
public abstract class AbstractIdGenerator {

    /**
     * id生成器
     * @param req 模板
     * @return 生成结果
     */
    abstract public Result generateIdInternal(GenReq req);

    /**
     * 解析定义
     * @param definition 格式定义
     */
    abstract public CodeReq resolve(GenDefinition definition);
}
