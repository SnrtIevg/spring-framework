package context.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * <p>DBConfig</p>
 * <p>Description:</p>
 *
 * @author yangtao
 * @create 2020-05-18 20:30
 * @since 1.0
 */
@Configuration
@Component
@Getter@Setter
@ToString
public class DBConfig implements Serializable {
	private static final long serialVersionUID = -2253394140831548943L;
	@Value("mysql")
	private String driver;
	@Value("127.0.0.1")
	private String url;
	@Value("admin")
	private String username;
	@Value("admin")
	private String pwd;
}
