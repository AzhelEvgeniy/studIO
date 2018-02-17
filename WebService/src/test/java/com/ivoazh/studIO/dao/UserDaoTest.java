package com.ivoazh.studIO.dao;

import com.ivoazh.studIO.dao.RoleDao;
import com.ivoazh.studIO.dao.UserDao;
import com.ivoazh.studIO.model.Role;
import com.ivoazh.studIO.model.User;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-root.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    private User user;

    @Before
    public void init(){
        user = new User();
        user.setUsername("user");
        user.setEmail("user@gmail.com");
        user.setPassword("password");
        user.setEnabled(false);
        user.setRoles(new HashSet<Role>(){{roleDao.getOne(1L);}});
    }

    @Test
    public void test_saveUser(){
        user = userDao.save(user);

        if (user == null){
            throw new AssertionError("User not save in database.");
        }

        userDao.delete(user);
    }

    @Test
    public void test_findUserByUsernameCorrect(){
        //save user in database
        userDao.save(user);

        User userFound = userDao.findByUsername(user.getUsername());
        if (userFound == null){
            throw new AssertionError("User saved in database not found.");
        }

        //delete user in database
        userDao.delete(user);
    }

    @Test
    public void test_findUserByUsernameIncorrect(){

        //find user which not in database
        User userFound = userDao.findByUsername(";");
        // if user not found than method returned null
        if (userFound != null){
            throw new AssertionError("User is found which not in database.");
        }
    }

    @Test
    public void test_findUserByUsernameAndPasswordCorrect(){
        //save user in database
        userDao.save(user);

        User userFound = userDao.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (userFound == null){
            throw new AssertionError("User saved in database not found.");
        }

        //delete user in database
        userDao.delete(user);
    }

}
