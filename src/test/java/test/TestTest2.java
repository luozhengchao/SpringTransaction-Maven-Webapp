package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import transactionManagement2.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans2.xml")
public class TestTest2 {

	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
//	@Autowired
//	private AccountService accountServiceProxy;
	
	//声明式事务管理
	@Test
	public void test1() {
		accountService.up("zs", "ls", 100);
	}
}
