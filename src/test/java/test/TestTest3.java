package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import transactionManagement3.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans3.xml")
public class TestTest3 {

	@Resource(name="accountService")
	private AccountService accountService;
	
	//声明式事务管理第二种 基于AspectJ方式配置
	@Test
	public void test1() {
		accountService.up("zs", "ls", 100);
	}
}
