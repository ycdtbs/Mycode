package com.tangcheng.io;

import javax.annotation.Resource;
import java.io.InputStream;

public class getResource {
    //根据配置文件的路径将配置文件加载成字节输入流加载到内存中
    public static InputStream getResourceAsStream(String path){
        //使用类加载器读取
        InputStream resourceAsStream = Resource.class.getResourceAsStream(path);
        return resourceAsStream;
    }
}
