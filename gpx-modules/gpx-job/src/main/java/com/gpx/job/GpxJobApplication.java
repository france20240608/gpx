package com.gpx.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.gpx.common.security.annotation.EnableCustomConfig;
import com.gpx.common.security.annotation.EnableRyFeignClients;
import com.gpx.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author gpx
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients   
@SpringBootApplication
public class GpxJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GpxJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
