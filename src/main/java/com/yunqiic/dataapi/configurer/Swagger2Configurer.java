package com.yunqiic.dataapi.configurer;

import com.yunqiic.dataapi.core.ProjectConstant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Peter
 */
@Configuration
public class Swagger2Configurer implements WebMvcConfigurer {

    /**
     * 这个地方要重新注入一下资源文件，不然不会注入资源的，也没有注入requestHandlerMappping,相当于xml配置的
     * <!--swagger资源配置-->
     * <mvc:resources location="classpath:/META-INF/resources/" mapping="swagger-ui.html"/>
     * <mvc:resources location="classpath:/META-INF/resources/webjars/" mapping="/webjars/**"/>
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(ProjectConstant.CONTROLLER_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Peter", "https://pine-seed.luomor.com", "admin@luomor.com");
        return new ApiInfoBuilder()
                .contact(contact)
                .title("松树物联网智慧健康平台")
                .description("通过直接且美观的方式来查看和调试API</br>" +
                        "参数说明：</br>" +
                        "所有接口均应上传logTime, deviceCode, userCode, deviceFirm, deviceName, deviceMac</br>" +
                        "签名认证，规则：</br>" +
                        "     * 1. 将请求参数按ascii码排序</br>" +
                        "     * 2. 拼接为a=value&b=value...这样的字符串（不包含sign）</br>" +
                        "     * 3. 混合密钥（secret）进行md5获得签名，与请求的签名进行比较")
                .version("1.0")
                .build();
    }
}
