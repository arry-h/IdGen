package com.arry.idgen.resolver;

import com.arry.idgen.domain.definition.CodeDefinition;
import com.arry.idgen.domain.definition.GenDefinition;
import com.arry.idgen.domain.pattern.Pattern;

/**
 * @author arry
 * @description 编码格式解析器
 * @since 1.0
 */
public class CodeDefinitionResolver implements IDefinitionResolver{
    @Override
    public boolean support(GenDefinition definition) {
        return definition instanceof CodeDefinition;
    }

    @Override
    public Pattern resolve(GenDefinition definition) {
        return null;
    }
}
