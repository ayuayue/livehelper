package top.caoayu.livehelper.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class HomeController {
    @RequestMapping("/")
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }
}
