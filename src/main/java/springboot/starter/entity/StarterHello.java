package springboot.starter.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by 10326 on 2020/3/1.
 */
@Component
@PropertySource("classpath:/config/cs.properties")
@ConfigurationProperties(prefix = "starter.hello")
public class StarterHello {

    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "StarterHello{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
