import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hellowBean = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld hellowBean2 = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat catBean = applicationContext.getBean("cat", Cat.class);
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(catBean2 == catBean);
        System.out.println(hellowBean == hellowBean2);
    }
}