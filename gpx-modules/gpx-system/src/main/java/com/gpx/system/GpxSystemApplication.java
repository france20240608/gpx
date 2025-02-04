package com.gpx.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.gpx.common.security.annotation.EnableCustomConfig;
import com.gpx.common.security.annotation.EnableRyFeignClients;
import com.gpx.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author gpx
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class GpxSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GpxSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
