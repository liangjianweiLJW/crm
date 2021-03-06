package com.sxdx.customer.extend.CusExtends;

import java.io.Serializable;

/**
 * @author 毕必成
 * @description 客户列表
 * @data 2020-02-2020/2/20
 **/
public class CusList implements Serializable {

    private Integer id;
    private String authName;
    private String path;

    public CusList() {
    }

    public Integer getId() {
        return id;
    }

    public String getAuthName() {
        return authName;
    }

    public String getPath() {
        return path;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
