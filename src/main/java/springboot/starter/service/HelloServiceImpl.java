package springboot.starter.service;

/**
 * Created by 10326 on 2020/3/1.
 */
public class HelloServiceImpl {

    String msg;

    public String sayHello() {
        return "Hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
