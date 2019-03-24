import Service.CosmoTripService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        CosmoTripService trip= new CosmoTripService();
        trip.getTrip();
    }
}
