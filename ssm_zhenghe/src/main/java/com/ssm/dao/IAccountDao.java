package com.ssm.dao;

import com.ssm.domain.Account;
import com.ssm.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {


    List<User> findAllUser();

    User findByName(String name);

    void saveUser(User user);

    void deleteUser(String name);
}
