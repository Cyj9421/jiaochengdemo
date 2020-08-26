package cn.cyj.controller;


import cn.cyj.entity.UserEntity;
import cn.cyj.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/*
*
* RestController =@ResponseBody+@Controller
* */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;
    //查找所有用户
    @RequestMapping("/getAll")
    @ResponseBody
    public List<UserEntity> getAll(Map map){

        return userService.getAll(map);
    }
    //删除指定用户
    @RequestMapping("/delById")
    public String delById(Integer id) {
        userService.delById(id);
        return "redirect:/index.html";
    }
    // 保存用户
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity) {
        userService.save(userEntity);
        return "success";
    }
    //查找指定用户
    @RequestMapping("/getUserById")
    @ResponseBody
    public UserEntity getUserById(Integer id){
        return userService.getUserById(id);

    }
    //根据id修改用户
    @RequestMapping("/update")
    @ResponseBody
    public  String update(@RequestBody UserEntity userEntity){
        userService.update(userEntity);
        return "success";
    }

}
