package com.chefu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tanvirushabh on 8/5/14.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }

    @RequestMapping( value="test" ,method = RequestMethod.GET)
    public String getTestBlah(){
        return "test/testblah";
    }}
