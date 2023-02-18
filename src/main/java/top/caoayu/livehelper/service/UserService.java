package top.caoayu.livehelper.service;

import top.caoayu.livehelper.model.UserModel;

import java.util.Collections;
import java.util.List;

public class UserService {

    public UserService(){

    }
    public List<UserModel> findUserList(){
        return Collections.singletonList(new UserModel("lili",20));
    }
}
