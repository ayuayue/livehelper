package top.caoayu.livehelper.mapper;

import org.apache.ibatis.annotations.*;
import top.caoayu.livehelper.entity.UserEntity;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<UserEntity> findAll();

    @Select("select * from user where id=#{id}")
    UserEntity findById(Long id);

    @Insert("INSERT INTO user(name,password,age,email) VALUES (#{name},#{password},#{age},#{email})")
    void save(UserEntity user);
    @Update("UPDATE user SET name=#{name}, password=#{password}, age=#{age}, email=#{email} WHERE id = #{id}")
    void update(UserEntity user);
    @Delete("DELETE FROM user WHERE id = #{id}")
    void delete(Long id);

}
