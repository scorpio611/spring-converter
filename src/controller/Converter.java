package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Converter {
    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @PostMapping("/convert")
    public ModelAndView convert(@RequestParam Float rate, Float usd) {
        ModelAndView modelAndView = new ModelAndView("convert");
        modelAndView.addObject("rate", rate);
        modelAndView.addObject("usd", usd);
        float vnd = rate*usd;
        modelAndView.addObject("vnd", vnd);
        return modelAndView;
    }
}
