package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class BlogController {

    @RequestMapping("/")
    public String listPosts(Map ModelMap){
        ModelMap.put("title", "Blog Post 1");
        return "home";
    }

}
