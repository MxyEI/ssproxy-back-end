package com.company.project.model;

import javax.persistence.*;

public class Ssinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ip地址
     */
    private String ipaddress;

    /**
     * 端口
     */
    private Integer port;

    /**
     * 密码
     */
    private String password;

    /**
     * 加密方式
     */
    private String method;

    /**
     * 节点名称
     */
    private String linodename;

    /**
     * 二维码
     */
    private String qrcode;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取ip地址
     *
     * @return ipaddress - ip地址
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * 设置ip地址
     *
     * @param ipaddress ip地址
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    /**
     * 获取端口
     *
     * @return port - 端口
     */
    public Integer getPort() {
        return port;
    }

    /**
     * 设置端口
     *
     * @param port 端口
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取加密方式
     *
     * @return method - 加密方式
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置加密方式
     *
     * @param method 加密方式
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 获取节点名称
     *
     * @return linodename - 节点名称
     */
    public String getLinodename() {
        return linodename;
    }

    /**
     * 设置节点名称
     *
     * @param linodename 节点名称
     */
    public void setLinodename(String linodename) {
        this.linodename = linodename;
    }

    /**
     * 获取二维码
     *
     * @return qrcode - 二维码
     */
    public String getQrcode() {
        return qrcode;
    }

    /**
     * 设置二维码
     *
     * @param qrcode 二维码
     */
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }
}