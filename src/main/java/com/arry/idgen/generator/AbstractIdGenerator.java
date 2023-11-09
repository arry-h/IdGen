package com.arry.idgen.generator;

import com.arry.idgen.domain.GenReq;
import com.arry.idgen.domain.Result;

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
}
