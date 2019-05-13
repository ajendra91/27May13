package com.example.FormValidationJquery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AppController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("emp",new Emp());
        return "view/index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute Emp emp, BindingResult result){
        if(result.hasErrors()){
            return "view/index";
        }
        return "view/success";
    }

}
