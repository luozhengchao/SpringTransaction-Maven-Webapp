package test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import transactionManagement.AccountServiceImpl;

public class TestTest {

	//编程式事务管理
	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
		context.start();
		
		AccountServiceImpl accountService = (AccountServiceImpl) context.getBean("accountService");
		accountService.up("zs", "ls", 100);
		
		context.destroy();
	}
}
