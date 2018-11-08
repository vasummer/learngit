package com.cdel.sscc.zipkin.thepac;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {

    @Value("${server.port}")     private int intPort;
    @Value("${spring.application.name}")     private String appname;
    @Value("${spring.datasource.url}")     private String datasourceInfo;
    @Value("${spring.datasource.username}")     private String username;
    @Value("${spring.datasource.password}")     private String password;
 /*   @Value("${string.port}")     private  String stringPort;
    @Value("${db.link.url}")     private String dbUrl;
    @Value("${db.link.driver}")  private String dbDriver;
    @Value("${db.link.username}")private String dbUsername;
    @Value("${db.link.password}")private String dbPassword;*/

    public void show(){

        
        System.out.println("===========================================");
        System.out.println("intPort :   " + intPort);
        System.out.println("appname :   " + appname);
        System.out.println("datasourceInfo :   " + datasourceInfo);
        System.out.println("username :   " + username);
        System.out.println("password :   " + password);
  /*      System.out.println("stringPort :   " + (stringPort + 1111));
        System.out.println("string :   " + dbUrl);
        System.out.println("string :   " + dbDriver);
        System.out.println("string :   " + dbUsername);
        System.out.println("string :   " + dbPassword);*/
        System.out.println("===========================================");
        jfiowjietfjgiowej
    }
}
