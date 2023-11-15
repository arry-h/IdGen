package com.arry.idgen.domain;

import com.arry.idgen.domain.definition.CodeDefinition;
import com.arry.idgen.domain.definition.GenDefinition;
import lombok.Data;

/**
 * @author arry
 * @description id、编码抽象类
 * @since 1.0
 */
@Data
public abstract class GenReq {

    /**
     * 格式定义
     */
    private GenDefinition defination;
}
