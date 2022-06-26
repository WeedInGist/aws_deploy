package com.aws_deploy.admin.config.auth.dto;

import com.aws_deploy.admin.domain.user.User;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
@ToString
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
