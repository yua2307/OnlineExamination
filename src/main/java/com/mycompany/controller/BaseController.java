/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author macbookpro
 */
@Controller
public class BaseController {
    @GetMapping(value = "index")
    public String toIndexPage(){
        return "login";
    }
}
