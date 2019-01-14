package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Converter {
    @GetMapping("/")
    public String converter(@RequestParam float number, Model model){
        model.addAttribute("number",number*23000);
        return "result";
    }
}
