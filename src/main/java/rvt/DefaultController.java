package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {
    
   
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    @GetMapping(value = "/about")
    String aboutMe(Model model){
        String name = "Laky";
        String surame = "help";
        int age = 5;
        String group = "home";
        model.addAttribute("age", age);

        return "about";
    }
}
