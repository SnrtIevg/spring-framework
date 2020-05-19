package context.beans;

import org.springframework.stereotype.Component;

/**
 * <p>DBConnPool</p>
 * <p>Description:</p>
 *
 * @author yangtao
 * @create 2020-05-18 20:29
 * @since 1.0
 */
@Component
public class DBConnPool {

	private DBConfig dbConfig;

	public DBConnPool(DBConfig dbConfig) {
		System.out.println("db conn pool init");
		System.out.println("db config is " + dbConfig);
		this.dbConfig = dbConfig;
	}
}
