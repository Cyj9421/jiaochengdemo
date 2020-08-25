package cn.cyj.service;


import cn.cyj.entity.UserEntity;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

public interface UserService {
    //查询所有用户
    List<UserEntity> getAll(Map map);
    //删除指定id的用户
    void delById(Integer id);
    //修改指定id的用户
    public  void  updateById(Integer id);
    // 保存用户
    public void save(UserEntity userEntity);
}
