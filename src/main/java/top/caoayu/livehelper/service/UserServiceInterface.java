package top.caoayu.livehelper.service;

import top.caoayu.livehelper.dto.UserDto;
import top.caoayu.livehelper.entity.UserEntity;

import java.util.List;

public interface UserServiceInterface {
    List<UserDto> findUsersByName(String userName);
}
