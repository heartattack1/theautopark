package autopark.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
    @RequestMapping(value = "/car")
    public String handle(ModelMap modelMap) {
        modelMap.put("name","Mercedes");
        modelMap.put("model","S600");
        modelMap.put("year","2015");
        modelMap.put("carcolor","черный");
        return "car.jsp";
    }
}



