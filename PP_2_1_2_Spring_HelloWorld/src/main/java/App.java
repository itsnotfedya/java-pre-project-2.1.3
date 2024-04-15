import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean2.getMessage());

        System.out.println("Ссыляюстя ли bean1 и bean2 " +
                "на один и тот же объект в SPRING-контейнере: " + (bean1 == bean2));

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean1.getName());

        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean2.getName());

        System.out.println("Ссылаются ли catBean1 и catBean2 " +
                "на один и тот же объект в SPRING-контейнере: " + (catBean1 == catBean2));
    }
}