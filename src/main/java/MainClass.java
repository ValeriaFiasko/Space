import Service.CosmoTripService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        CosmoTripService trip= new CosmoTripService();
        trip.generate();
      //  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        /*System.out.println(applicationContext.getBean("trip"));*/
       /* System.out.println(applicationContext.getHeader("trip"));*/

    }
}
