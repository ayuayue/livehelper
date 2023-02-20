package top.caoayu.livehelper.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@SpringBootApplication
public class HomeController {
    @RequestMapping("/")
    public ResponseEntity<Map<String, Object>> home(){
        Map<String, Object> response = new HashMap<>();
        response.put("data","Hello Live Helper");
        response.put("message","OK");
        response.put("code",200);
        return ResponseEntity.ok(response);
    }
}
