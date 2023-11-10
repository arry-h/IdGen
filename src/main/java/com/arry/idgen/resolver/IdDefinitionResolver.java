package com.arry.idgen.resolver;

import com.arry.idgen.domain.definition.GenDefinition;

/**
 * @author arry
 * @description id格式解析器
 * @since 1.0
 */
public class IdDefinitionResolver implements IDefinitionResolver{
    @Override
    public boolean support(GenDefinition definition) {
        return false;
    }

    @Override
    public void resolve(GenDefinition definition) {

    }
}
