package com.chinasoft.domain;

import lombok.Data;

import java.util.Date;
import java.util.Map;


@Data
public class Account {

    private String name;
    private Double money;
    private Date createTime;
    private Map<String,User> map;

}
