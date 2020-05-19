package context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>ContextStydyMain</p>
 * <p>Description:</p>
 *
 * @author yangtao
 * @create 2020-05-18 16:19
 * @since 1.0
 */
public class ContextStudyMain {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();) {
			context.scan("context.beans");
			context.refresh();
		}

	}
}
