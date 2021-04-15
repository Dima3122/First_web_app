package com.test.demo.cotrollers;

import com.test.demo.entities.RequestHandler;
import com.test.demo.repository.Bd_Vacansies_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllers
{

    @Autowired
    private Bd_Vacansies_repository Bd_Vacansies;//Взаимодействие с бд
    int count = 0;
    @GetMapping("/main")
    public String main(Model model)
    {
        model.addAttribute("title", count);
        return ("index");
    }
    @PostMapping("/post")
    public String http_get(@RequestParam String sity,@RequestParam String zp, Model model){
        System.out.println(sity);
        model.addAttribute("sity", sity);
        RequestHandler a = new RequestHandler();
        count = a.get_count_vacancies(sity, zp);
        return ("redirect:/main");
    }
}
