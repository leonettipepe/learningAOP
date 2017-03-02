import objects.FileManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leonid on 02.03.2017.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-app.xml");
        new FileManager().getExtensionList("C://Elon");
    }
}
