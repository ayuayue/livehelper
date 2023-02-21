
package top.caoayu.livehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "top.caoayu.livehelper.repository")
@MapperScan("top.caoayu.livehelper.mapper")
public class LivehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivehelperApplication.class, args);
    }

}
