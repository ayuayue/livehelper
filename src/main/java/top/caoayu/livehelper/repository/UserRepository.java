package top.caoayu.livehelper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.caoayu.livehelper.entity.UserEntity;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    List<UserEntity> findByNameContaining(String username);
}
