package top.caoayu.livehelper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.caoayu.livehelper.model.UserModel;
import top.caoayu.livehelper.service.UserService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<UserModel> users() {
        return userService.findUserList();
    }
}
