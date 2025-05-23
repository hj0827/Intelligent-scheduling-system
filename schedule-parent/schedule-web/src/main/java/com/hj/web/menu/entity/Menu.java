package com.hj.web.menu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@TableName("menu")
public class Menu {
    @TableId(type = IdType.AUTO)
    private Long menuId;
    private Long parentId;
    private String title;
    private String code;
    private String name;
    private String path;
    private String url;
//    类型（0：目录 1：菜单 2：按钮）
    private String type;
    private String icon;
    private String parentName;
    private Long orderNum;
    private Date createTime;
    private Date updateTime;
//    该字段不属于数据库表，需要排除
    @TableField(exist = false)
    private List<Menu> children = new ArrayList<>();

}
