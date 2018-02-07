package transactionManagement4;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void up(String in, String out, double money) {
		accountDao.del(out, money);
		accountDao.add(in, money);
	}

}
