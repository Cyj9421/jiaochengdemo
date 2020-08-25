package cn.cyj.controller;


import cn.cyj.entity.UserEntity;
import cn.cyj.service.UserService;
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

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){

        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id) {

        userService.delById(id);
        return "redirect:/index.html";
    }

    // 保存用户
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity) {

        System.out.println("用户注册 - " + userEntity.toString());
        userService.save(userEntity);
        return "success";
    }
    @RequestMapping("updateById")
    public  String updateById(Integer id){
        userService.updateById(id);
        return "redirect:index.html";
    }
}
