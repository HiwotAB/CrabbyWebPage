package hiwotab.crabbywebpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// controller class is used as intermidate to our model  to the data base
@Controller
public class MainController {
    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }
}
