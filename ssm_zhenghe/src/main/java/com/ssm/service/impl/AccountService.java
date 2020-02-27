package com.ssm.service.impl;

import com.ssm.Until.createPDF;
import com.ssm.dao.IAccountDao;
import com.ssm.domain.Account;
import com.ssm.domain.User;
import com.ssm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("accountService")
public class AccountService implements IAccountService {
    @Autowired
    private IAccountDao iAccountDao;

    @Override
    public void deleteUSer(String name) {
        iAccountDao.deleteUser(name);
    }

    @Override
    public void saveUser(User user) {
        iAccountDao.saveUser(user);
    }

    @Override
    public List<User> findAllUser() {
        return iAccountDao.findAllUser();
    }



    @Override
    public User findByName(String name) {
        return iAccountDao.findByName(name);
    }

    @Override
    public void creatPDF(String realpath, String newPath, User user) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", user.getName());
        map.put("nation", user.getNation());
        map.put("phone", user.getPhone());
        map.put("mail", user.getMail());
        map.put("height", user.getHeight());
        map.put("degree", user.getDegree());
        map.put("education", user.getEducation());
        map.put("school", user.getSchool());
        map.put("schoolthing", user.getSchoolthing());
        map.put("workthing", user.getWorkthing());
        map.put("self", user.getSelf());
        map.put("skill", user.getSkill());
        map.put("address", user.getAddress());
        map.put("birthday", user.getBirthday());
        System.out.println(createPDF.createPdfFromTemplate(realpath,
                newPath, map));
    }


}
