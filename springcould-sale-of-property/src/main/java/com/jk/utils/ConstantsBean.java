package com.jk.utils;

/**
 *
 * Copyright © 2017 金科教育. All rights reserved. <br>
 * 类: ConstantsBean <br>
 * 描述: 常量类 <br>
 * 作者: Teacher song<br>
 * 时间: 2017年10月19日 下午5:18:16
 */
public class ConstantsBean {

	//物理存储图片地址 也就是新安装的Tomcat下面存放图片的路径
	public static String IMG_PATH = "E:/apache-tomcat-8.3/webapps/ROOT/";
	//图片服务器请求地址
	public static String IMG_SERVER_PATH = "http://127.0.0.1:8085/";
	/*//druid用户名
	public static String DRUID_USER_NAME = "admin";
	//druid密码
	public static String DRUID_USER_PASSWORD = "admin";
	//文件上传地址
	public static String UPLOAD_FILE_PATH = "D:\\jkimg\\apache-tomcat-7.0.42\\webapps\\ROOT\\file";
	//文件服务器请求地址
	public static String File_SERVER_PATH = "http://127.0.0.1:8081/file";
	//webservice认证密码
	public static String WEB_SERVICE_PASSWORD = "admin";*/



//发送126邮件需要用到发送人的填写的信息
	//邮件服务器地址
    public static final String HOST = "smtp.126.com";
	//邮件发送服务器的端口号
	public static final Integer PORT = 25;
	//发送方账号名
	public static final String USERNAME = "heshuaijava";
	//发送方密码
	public static final String PASSWORD = "hs629926admin";
	//发送方账号
	public static final String EMAILFORM = "heshuaijava@126.com";




}
