package com.cy.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

/**
 * 得到随机的匿名用户信息
 * By CY
 * Date 2018/11/24 14:05
 */
public class RandomUserInfo {

    /**
     * 得到随机的头像
     */
    public static String getRandomAvatar() {
        // 读取匿名头像属性文件
        InputStream resourceAsStream = RandomUserInfo.class.getClassLoader().getResourceAsStream("properties/randomAvatar.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            resourceAsStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Integer i = new Random(new Date().getTime()).nextInt(properties.size());
        return (String) properties.get(i.toString());
    }

    /**
     * 得到随机的用户名
     */
    public static String getRandomUserName() {
        // 读取匿名头像属性文件
        InputStream resourceAsStream = RandomUserInfo.class.getClassLoader().getResourceAsStream("properties/randomUsername.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            resourceAsStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Integer i = new Random(new Date().getTime()).nextInt(properties.size());
        return (String) properties.get(i.toString());
    }
}
