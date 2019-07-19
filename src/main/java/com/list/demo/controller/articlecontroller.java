package com.list.demo.controller;

import com.list.demo.entity.article;
import com.list.demo.service.articleservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
@RequestMapping("/main")
public class articlecontroller {
    @Autowired
    private articleservice articleservice;
    public Model index(ModelMap modelMap){
        Collection<article> articles = articleservice.getArticles();
        modelMap.addAttribute("articles",articles);
        return new Model(modelMap);
    }
}
