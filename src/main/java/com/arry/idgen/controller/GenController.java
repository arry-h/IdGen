package com.arry.idgen.controller;

import com.arry.idgen.domain.Result;
import com.arry.idgen.service.CodeGenService;
import com.arry.idgen.service.IdGenService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arry
 * @description 生成器controller
 * @since 1.0
 */
@RestController
public class GenController {

    private CodeGenService codeGenService;
    private IdGenService idGenService;

    public GenController(CodeGenService codeGenService, IdGenService idGenService) {
        this.codeGenService = codeGenService;
        this.idGenService = idGenService;
    }

    @RequestMapping("/generate/id/{method}")
    public String generateId(@PathVariable("method") String method){
        return get(method,idGenService.generate());
    }

    @RequestMapping("/generate/code/{method}")
    public String generateCode(@PathVariable("method") String method){
        return get(method,codeGenService.generate());
    }

    //todo
    private String get(String method,Result result){

        if (result == null){
            return null;
        }

        return result.getResult();
    }
}
