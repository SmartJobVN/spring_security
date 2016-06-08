package vn.smartjob.demo_spring.demo_security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("trang_chu");
        registry.addViewController("/").setViewName("trang_chu");
        registry.addViewController("/hello").setViewName("khu_vuc_bao_mat");
        registry.addViewController("/login").setViewName("dang_nhap");
    }

}