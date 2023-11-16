package com.arry.idgen.resolver;

import com.arry.idgen.domain.definition.GenDefinition;
import com.arry.idgen.domain.definition.IdDefinition;
import com.arry.idgen.domain.pattern.Pattern;

/**
 * @author arry
 * @description id格式解析器
 * @since 1.0
 */
public class IdDefinitionResolver implements IDefinitionResolver{
    @Override
    public boolean support(GenDefinition definition) {
        return definition instanceof IdDefinition;
    }

    @Override
    public Pattern resolve(GenDefinition definition) {
        return null;
    }
}
