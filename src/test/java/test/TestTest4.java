package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import transactionManagement4.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans4.xml")
public class TestTest4 {

	@Resource(name="accountService")
	private AccountService accountService;
	
	//声明式事务管理第三种 基于注解方式配置
	@Test
	public void test1() {
		accountService.up("zs", "ls", 100);
	}
}
