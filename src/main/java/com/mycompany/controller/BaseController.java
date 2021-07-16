/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author macbookpro
 */
@Controller
public class BaseController {

    @GetMapping(value = "/index")
    public String toIndexPage() {
        return "login";
    }

    @GetMapping(value = "/login")
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout,  HttpSession session) {

        ModelAndView model = new ModelAndView();
       // System.out.println("User Name " +  userName) ;
        
        if (error != null) {
            
            model.addObject("error", "Invalid username and password!");
      //      model.addObject("userName",userName);
                
            model.setViewName("login");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
            //  model.addObject("searchInformation",new SearchInformation());
            model.setViewName("redirect:/index");
        }
        //model.setViewName("login");
        return model;
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }

    @RequestMapping("/student")
    public String user() {
        return "user";
    }
    @RequestMapping("/logout")
    public String logout(final Model model) {
        model.addAttribute("message", "Logged out!");
        return "login";
    }
    
    @RequestMapping("/403")
    public String accessDeny() {
       return "403";
    }
    
}
