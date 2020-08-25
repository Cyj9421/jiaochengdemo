package cn.cyj.entity;

import lombok.Data;

import java.util.Date;
@Data
public class UserEntity {

    private Integer id;

    private String username;

    private String password;

    private Date regstersTime;

    private Integer status;

    private String sex;

    private String realname;

    public UserEntity() {
    }

    public UserEntity(Integer id, String username, String password, Date regstersTime, Integer status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.regstersTime = regstersTime;
        this.status = status;
    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Date getCreatetime() {
//        return createtime;
//    }
//
//    public void setCreatetime(Date createtime) {
//        this.createtime = createtime;
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", regstersTime=" + regstersTime +
                ", sex=" + sex +
                ", status=" + status +
                '}';
    }
}
