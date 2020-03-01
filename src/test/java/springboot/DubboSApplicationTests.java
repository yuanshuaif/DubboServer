package springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.starter.service.HelloServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboSApplicationTests {

	@Autowired
	private HelloServiceImpl helloService;

	@Test
	public void contextLoads() {
		System.out.println(helloService.sayHello());
	}

}
