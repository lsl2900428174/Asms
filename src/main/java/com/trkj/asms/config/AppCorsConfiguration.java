package com.trkj.asms.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/***
<<<<<<< HEAD
 * @author 欧阳渗
 * @date 2021-04-15
=======
 * @author 大熊
 * @date 2020-07-03
>>>>>>> 6a75340af3fcb8de092b42fe5383ae29db6b200e
 * @Description:跨域配置类
 * @version 1.0
 */
@Configuration
@Slf4j
public class AppCorsConfiguration {
    private CorsConfiguration buildConfig() {
        log.debug("开始设置");
        CorsConfiguration appCorsConfiguration = new CorsConfiguration();
<<<<<<< HEAD
        appCorsConfiguration.addAllowedOrigin("http://localhost:8099");
        appCorsConfiguration.addAllowedOrigin("http://39.105.189.229:8099");
        appCorsConfiguration.addAllowedOrigin("*"); // 1允许任何域名使用
        appCorsConfiguration.addAllowedHeader("*"); // 2允许任何头
        appCorsConfiguration.addAllowedMethod("*"); // 3允许任何方法（post、get等）
        appCorsConfiguration.setAllowCredentials(true);//这两句不加不能跨域上传文件，
        appCorsConfiguration.setMaxAge(3600L);//加上去就可
=======
        appCorsConfiguration.addAllowedOrigin("http://localhost:8085");
        appCorsConfiguration.addAllowedOrigin("http://127.0.0.1:8085");
        appCorsConfiguration.addAllowedOrigin("http://localhost:8081");
        appCorsConfiguration.addAllowedOrigin("http://127.0.0.1:8081");
        appCorsConfiguration.addAllowedHeader("*"); // 2允许任何头
        appCorsConfiguration.addAllowedMethod("OPTIONS");
        appCorsConfiguration.addAllowedMethod("HEAD");
        appCorsConfiguration.addAllowedMethod("GET");
        appCorsConfiguration.addAllowedMethod("PUT");
        appCorsConfiguration.addAllowedMethod("POST");
        appCorsConfiguration.addAllowedMethod("DELETE");
        appCorsConfiguration.addAllowedMethod("PATCH");
        appCorsConfiguration.setAllowCredentials(true);//这两句不加不能跨域上传文件，
        appCorsConfiguration.setMaxAge(60l);//加上去就可
>>>>>>> 6a75340af3fcb8de092b42fe5383ae29db6b200e
        return appCorsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4
        return new CorsFilter(source);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 6a75340af3fcb8de092b42fe5383ae29db6b200e
