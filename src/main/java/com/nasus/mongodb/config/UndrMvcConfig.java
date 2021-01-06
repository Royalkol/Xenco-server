package com.nasus.mongodb.config;


import com.nasus.mongodb.component.LoginHandleInterceptor;
import com.nasus.mongodb.component.UndrLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class UndrMvcConfig implements WebMvcConfigurer {

    /**
     * 需要将国际化信息注入到MVC容器中才能生效
     *
     * @return
     */
    @Bean
    public LocaleResolver localeResolver() {
        return new UndrLocaleResolver();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //跳转到注册页面
        registry.addViewController("/sign.html").setViewName("echarts/syd/sign");
    }

    /**
     * 注册拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 不用担心静态资源被拦截（css , png, js）， springboot 已经做好了映射
        // addPathPatterns("/**")" 拦截任意请求
        registry.addInterceptor( new LoginHandleInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index.html",  // 排除掉首页请求
                        "/",              // 排除掉首页请求
                        "/user/login",  // 排除掉登录请求
                        "/asserts/css/*.css",
                        "/asserts/img/*.svg",
                        "/asserts/js/*.js",
                        "/webjars/bootstrap/4.1.1/css/*.css",
                        "/mancenter/*",
                        "/error", "/asserts/lib/jquery/*","/asserts/lib/*.js") ;
    }


    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/META-INF/resources/", "classpath:/resources/",
            "classpath:/static/", "classpath:/public/", "classpath:/config/"};


}
