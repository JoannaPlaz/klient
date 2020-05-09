package klient.spring.klient.controller;

import klient.spring.klient.model.Klient;
import klient.spring.klient.service.KlientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/klient")
public class KlientController {
    @Autowired
    private KlientService klientService;

//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }

    @GetMapping("/add")
    public String klientAdd(Model model) {
        model.addAttribute("newKlient", new Klient());
        return "klient_form";
    }
    @PostMapping("/add")
    public String klientAdd(Klient klient) {

        klientService.add(klient);
        return "redirect:/klient/list";
    }
    @GetMapping("/list")
    public String klientList(Model model) {
        model.addAttribute("ListaKlientow", klientService.getBazaDanych());
        return "klient_list";
    }
}
