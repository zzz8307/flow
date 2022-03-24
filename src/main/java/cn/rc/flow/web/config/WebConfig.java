package cn.rc.flow.web.config;

import cn.rc.flow.web.filter.SnakeCaseToCamelCaseFilter;
import cn.rc.flow.web.interceptor.AuthorizationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

/**
 * @author rc
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public Filter snakeCaseToCamelCaseFilter() {
        return new SnakeCaseToCamelCaseFilter();
    }

    /**
     * Let Spring manage {@code AuthorizationInterceptor}
     * so we can use {@code @Autowired} and {@code @Resource}
     */
    @Bean
    public AuthorizationInterceptor authorizationInterceptor() {
        return new AuthorizationInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorizationInterceptor())
                .addPathPatterns("/**");
    }
}
