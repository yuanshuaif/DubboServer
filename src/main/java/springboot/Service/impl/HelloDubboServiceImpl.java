package springboot.Service.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Service;
import springboot.Service.IHelloDubboService;

/**
 * Created by Administrator on 2019/3/29.
 */
@Service("helloDubboServiceImpl")
public class HelloDubboServiceImpl implements IHelloDubboService {
    @Override
    public void sayHello(){
        // dubbo上下文参数的传递
        String msg = RpcContext.getContext().getAttachments().get("msg");
        System.out.println(msg);
    }
}
