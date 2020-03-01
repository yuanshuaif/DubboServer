package springboot.starter.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.starter.entity.StarterHello;
import springboot.starter.service.HelloServiceImpl;

/**
 * Created by 10326 on 2020/3/1.
 */
@Configuration
//@EnableConfigurationProperties(StarterHello.class)
@ConditionalOnClass(HelloServiceImpl.class)
@ConditionalOnProperty(prefix = "starter.hello", value = "enabled", matchIfMissing = true)
public class HelloWorldAutoConfiguration {

    @Autowired
    private StarterHello starterHello;

    @Bean
    @ConditionalOnMissingBean(HelloServiceImpl.class)
    public HelloServiceImpl helloService(){
        HelloServiceImpl iHelloService = new HelloServiceImpl();
        iHelloService.setMsg(starterHello.getMsg());
        return iHelloService;
    }

}
