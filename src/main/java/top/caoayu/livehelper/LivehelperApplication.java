package top.caoayu.livehelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class LivehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivehelperApplication.class, args);
    }

    @RequestMapping("/")
    public String Root() {
        return "It's a Root Page";
    }
}
