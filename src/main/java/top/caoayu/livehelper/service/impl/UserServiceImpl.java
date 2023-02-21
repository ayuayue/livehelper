package top.caoayu.livehelper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.caoayu.livehelper.dto.UserDto;
import top.caoayu.livehelper.entity.UserEntity;
import top.caoayu.livehelper.mapper.UserMapper;
import top.caoayu.livehelper.repository.UserRepository;
import top.caoayu.livehelper.service.UserServiceInterface;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserServiceInterface {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserDto> findUsersByName(String name) {
        List<UserEntity> users = userRepository.findByNameContaining(name);
        return users.stream()
                .map(user -> new UserDto(user.getId(), user.getName(), user.getEmail()))
                .collect(Collectors.toList());
    }

}
