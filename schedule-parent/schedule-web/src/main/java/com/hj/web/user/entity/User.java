package com.hj.web.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user")
public class User {
//    表明主键，并且是自增 ;
    @TableId(type = IdType.AUTO)
    private Long userId;
//    排除该字段
    @TableField(exist = false)
    private Long roleId;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String sex;
    private String isAdmin;
//    账户是否过期（1：未过期，0已过期）
    private boolean isAccountNonExpired = true;
//    账户是否被锁定（1：未锁定，0已锁定）
    private boolean isAccountNonLocked = true;
//    密码是否过期（1：未过期，0已过期）
    private boolean isCredentialsNonExpired = true;
//    账户是否可用（1：可用，0：已禁用）
    private boolean isEnabled = true;
    private String name;
//    创建时间
    private Date createTime;
//    修改时间
    private Date updateTime;

}
