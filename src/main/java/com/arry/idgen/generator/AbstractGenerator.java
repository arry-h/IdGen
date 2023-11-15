package com.arry.idgen.generator;

import com.arry.idgen.domain.CodeReq;
import com.arry.idgen.domain.GenReq;
import com.arry.idgen.domain.Pattern;
import com.arry.idgen.domain.Result;
import com.arry.idgen.domain.definition.GenDefinition;

/**
 * @author arry
 * @description 生成器
 * @since 1.0
 */
public abstract class AbstractGenerator {

    public Result generate(GenReq req){
        Pattern pattern = resolve(req.getDefination());
        return generateInternal(pattern);
    }

    /**
     * id生成器
     * @param pattern 模板
     * @return 生成结果
     */
    abstract public Result generateInternal(Pattern pattern);

    /**
     * 解析定义
     * @param definition 格式定义
     */
    abstract public Pattern resolve(GenDefinition definition);
}
