package com.gpx.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author gpx
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GpxGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GpxGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  搞破鞋网关启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
