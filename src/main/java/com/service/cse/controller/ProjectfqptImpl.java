package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-09-10T07:03:24.125Z")

@RestSchema(schemaId = "projectfqpt")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class ProjectfqptImpl {

    @Autowired
    private ProjectfqptDelegate userProjectfqptDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectfqptDelegate.helloworld(name);
    }

}
