package com.demo.user.domain;

import com.demo.user.annotation.Colume;
import com.demo.user.annotation.Table;
import lombok.Data;

import java.util.Date;

/**
 * User实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-12-05 17:20:02
 */
@Data
@Table("user")
public class User {
    @Colume("id")
    private Long id;
    @Colume(("status"))
    private Integer status;
    @Colume(("username"))
    private String username;
    @Colume(("realname"))
    private String realName;
    @Colume(("salt"))
    private String salt;
    @Colume(("password"))
    private String password;
    @Colume(("ctime"))
    private Date createTime;
    @Colume(("utime"))
    private Date updateTime;
    @Colume(("email"))
    private String email;
    @Colume(("mobile"))
    private String mobile;
    @Colume(("address"))
    private String address;
    @Colume(("sex"))
    private Integer sex;
}
