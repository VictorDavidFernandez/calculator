package com.victor.calculator.controllers;

import com.victor.calculator.models.Operation;
import com.victor.calculator.services.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class operatorController {

    @Autowired
    OperatorService service;

    @Autowired
    Operation operation;

    @GetMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("operation", operation);
        return modelAndView;
    }

    @PostMapping("calc")
    public ModelAndView calc(Operation operation){
        int result = service.Calculate(operation);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
