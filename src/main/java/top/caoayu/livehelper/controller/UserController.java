package top.caoayu.livehelper.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.caoayu.livehelper.model.UserModel;
import top.caoayu.livehelper.service.UserService;

import java.util.List;

@RestController
@SpringBootApplication
public class UserController {
    @RequestMapping("/users")
    List<UserModel> users(){
        return new UserService().findUserList();
    }
}
