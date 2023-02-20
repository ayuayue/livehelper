package top.caoayu.livehelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "top.caoayu.livehelper.repository")
@MapperScan("top.caoayu.livehelper.mapper")
public class LivehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivehelperApplication.class, args);
    }

}
