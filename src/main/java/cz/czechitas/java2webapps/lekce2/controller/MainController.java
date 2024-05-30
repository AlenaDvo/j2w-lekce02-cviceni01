package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Controller
public class MainController {
    @GetMapping("/datum")
    public ModelAndView datum() {
        ModelAndView result = new ModelAndView("datum");
        result.addObject("datum", LocalDate.now());
        return result;
    }

    @GetMapping("/cas")
    public ModelAndView cas() {
        ModelAndView result = new ModelAndView("cas");
        result.addObject("cas", LocalTime.now());
        return result;
    }

    @GetMapping("/datumACas")
    public ModelAndView datumACas() {
        LocalDateTime now = LocalDateTime.now();
        ModelAndView result = new ModelAndView("datumACas");
        result.addObject("datumACasDatum", now.toLocalDate())
                .addObject("datumACasCas", now.toLocalTime());
        return result;
    }
}