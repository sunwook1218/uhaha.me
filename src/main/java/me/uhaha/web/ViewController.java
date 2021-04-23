package me.uhaha.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.NamedStoredProcedureQueries;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String root() {
        return "index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/generic")
    public String generic() {
        return "generic";
    }

    @RequestMapping("/elements")
    public String elements() {
        return "elements";
    }

}
