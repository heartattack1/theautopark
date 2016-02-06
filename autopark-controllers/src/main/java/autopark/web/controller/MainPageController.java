package autopark.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {
    @RequestMapping(value = "/")
    public String handle(ModelMap modelMap) {
        modelMap.put("author","It park.");
        return "main.jsp";
    }
}



