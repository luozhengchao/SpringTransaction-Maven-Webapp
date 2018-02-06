package transactionManagement2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	public void add(String in, double money) {
		String sql = "update account set money=money+? where name=?";
		this.getJdbcTemplate().update(sql, money, in);
	}

	public void del(String out, double money) {
		String sql = "update account set money=money-? where name=?";
		this.getJdbcTemplate().update(sql, money, out);
	}

}
