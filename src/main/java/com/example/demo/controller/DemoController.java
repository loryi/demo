package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IDemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author loryi
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private IDemoService demoService;

    @ResponseBody
    @GetMapping("/{id}")
    public User findByUserId(@PathVariable("id") String id, ModelMap modelMap){
        return demoService.findUser(id);
    }

}
