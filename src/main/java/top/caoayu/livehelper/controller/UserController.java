package top.caoayu.livehelper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.caoayu.livehelper.dto.UserDto;
import top.caoayu.livehelper.service.impl.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping
    public List<UserDto> findUserByName(@RequestParam("name") String name) {
        return userServiceImpl.findUsersByName(name);
    }
}
