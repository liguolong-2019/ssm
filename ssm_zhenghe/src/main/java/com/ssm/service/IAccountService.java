package com.ssm.service;

import com.ssm.domain.Account;
import com.ssm.domain.User;

import java.util.List;

public interface IAccountService {


    public List<User> findAllUser();

    public User findByName(String name);

    public void saveUser(User user);

    public void creatPDF(String templateFile, String targetFile, User user);

    public void deleteUSer(String name);
}
