package cn.cyj;

import cn.cyj.entity.UserEntity;
import cn.cyj.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserApplication.class)
class JiaochengdemoApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        UserEntity userEntity=userService.getUserById(56);
        System.out.println(userEntity);
        userEntity.setSex("女");
        userService.update(userEntity);
    }

}
