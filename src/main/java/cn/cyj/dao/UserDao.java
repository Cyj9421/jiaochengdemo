package cn.cyj.dao;


import cn.cyj.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    List<UserEntity> getAll(@Param("content") Map map);

    void delById(Integer id);

    public void save(UserEntity userEntity);

    public  UserEntity  getUserById(Integer id);

    public void update(@Param("content") UserEntity userEntity);
}
