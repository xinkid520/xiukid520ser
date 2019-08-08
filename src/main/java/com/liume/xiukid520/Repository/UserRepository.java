package com.liume.xiukid520.Repository;

import com.liume.xiukid520.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

    //    @Query(value = "select COUNT(1) from user where user_name =? and password=?", nativeQuery = true)
    User findUserByUserNameAndPassword(String userName, String password);
}
