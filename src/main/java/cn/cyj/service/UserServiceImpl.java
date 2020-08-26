package cn.cyj.service;


import cn.cyj.dao.UserDao;
import cn.cyj.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> getAll(Map map) {

        return userDao.getAll(map);
    }

    @Override
    public void delById(Integer id) {
        userDao.delById(id);
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void save(UserEntity userEntity) {
        userEntity.setRegstersTime(new Date());
        userEntity.setStatus(1);
        System.out.println(userEntity);
        userDao.save(userEntity);
    }

    @Override
    public void update(UserEntity userEntity) {
        userEntity.setRegstersTime(new Date());
        userEntity.setStatus(1);
        System.out.println(userEntity);
        userDao.update(userEntity);
    }

}
