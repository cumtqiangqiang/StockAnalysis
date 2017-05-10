package com.qiang.conf;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by fiona on 10/5/2017.
 */
public class ConfigurationManager {
   private  static Properties prop  = new Properties();
    static {

        InputStream input = ConfigurationManager.class.getClassLoader()
                .getResourceAsStream("resources/my.properties");
        try {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 获得字符串类型的属性
     * @param key
     * @return
     */
    public  static  String getProperty(String key){
       return  prop.getProperty(key);
    }

    /**
     * 获取bool值得属性.
     * @param key
     * @return
     */
    public static Boolean getBoolean(String key){
        String value = prop.getProperty(key);

       try {
           return Boolean.valueOf(value);

       }catch (Exception e){
           e.printStackTrace();
       }
        return  false;
    }


}
