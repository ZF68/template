package com.skytech.gloc.cms.index.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("userList", new String[]{"李四", "王五", "赵六"});
        return "index";
    }

}
