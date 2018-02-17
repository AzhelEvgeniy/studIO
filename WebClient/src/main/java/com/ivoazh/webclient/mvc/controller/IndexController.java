package com.ivoazh.webclient.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = {"/", "home", "index"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("title", "Home");
        mv.addObject("userClickHome", true);
        return mv;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("/sign/login");
        mv.addObject("title", "Home");
        mv.addObject("userClickHome", true);
        return mv;
    }

    @RequestMapping(value = "/registration")
    public ModelAndView registration() {
        ModelAndView mv = new ModelAndView("/sign/registration");
        mv.addObject("title", "Home");
        mv.addObject("userClickHome", true);
        return mv;
    }

}
