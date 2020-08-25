package cn.cyj.service;


import cn.cyj.entity.UserEntity;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    // 保存用户
    public void save(UserEntity userEntity);
}
