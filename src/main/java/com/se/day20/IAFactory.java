package com.se.day20;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @projectname: javalearncode
 * @packname: com.se.day20
 * @classname: IAFactory
 * @author: gyg
 * @date: 2022/8/6 下午 4:56
 * @version: 1.0
 * @description:
 */

public class IAFactory {
    public static IA create() {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/Configuration/ClassConfiguration.properties")) {
            prop.load(fis);
            String value = prop.getProperty("className");
            Class IAimpl = Class.forName(value);
            Constructor constructor = IAimpl.getConstructor();
            Object ins = constructor.newInstance();
            return (IA)ins;
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException
            | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
