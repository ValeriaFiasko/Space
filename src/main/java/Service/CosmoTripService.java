package Service;
import Entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class CosmoTripService {
    private Trip trip;
    List<Astronaut> astronaut;
    List<Spacecraft> spacecrafts;

    public CosmoTripService() {
    }

    public void generate(){
        System.out.println("here");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        for (int i = 0; i < 3; i++)
        {
            // Map map = applicationContext.getBeansOfType(Entity.Astronaut.class);
            System.out.println(applicationContext.getBean("astronaut" + i,Entity.Astronaut.class));
            astronaut.add(applicationContext.getBean("astronaut" + (i+1),Entity.Astronaut.class));
            System.out.println(astronaut.get((i)));
        }
     //  new Random().ints(0, map.size()).limit(3).forEach(p -> System.out.println(map.get(p)));
    }

    public void getTrip(){

    }

}
