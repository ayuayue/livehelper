package top.caoayu.livehelper.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class HomeController {
    @RequestMapping("home")
    public String home(){
        return "It's Home Page!";
    }
}
