package com.gpx.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.gpx.common.security.annotation.EnableCustomConfig;
import com.gpx.common.security.annotation.EnableRyFeignClients;
import com.gpx.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author gpx
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class GpxGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GpxGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
