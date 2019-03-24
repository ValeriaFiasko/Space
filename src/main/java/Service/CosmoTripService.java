package Service;
import Entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class CosmoTripService {
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
    private List<Astronaut> astronaut = new ArrayList<Astronaut>();
    private List<Spacecraft> spacecrafts = new ArrayList<Spacecraft>();
    private Trip trip;

    public CosmoTripService() {
    }

    public void generateStarcraft(){
        for (int i = 0; i < 2; i++)
        {
            spacecrafts.add(applicationContext.getBean("spacecraft" + (i+1),Entity.Spacecraft.class));
        }
        System.out.println("Now we choosing spacecraft");
        new Random().ints(0, spacecrafts.size()).limit(1).forEach(p -> trip.setSpacecraft(spacecrafts.get(p)));
        System.out.println(trip.getSpacecraft());
    }

    public void generateListOfAstronauts(){
        for (int i = 0; i < 3; i++)
        {
            astronaut.add(applicationContext.getBean("astronaut" + (i+1),Entity.Astronaut.class));
        }
        System.out.println("Now we choosing astronauts");
        List<Astronaut> finalAstronauts = getRandomElements(trip.getSpacecraft().getCrewCapacity(), astronaut);
        System.out.println(finalAstronauts);
        trip.setAstronauts(finalAstronauts);
}

    public List<Astronaut> getRandomElements(final int amount, final List<Astronaut> list) {
        ArrayList<Astronaut> returnList = new ArrayList<Astronaut>(list);
        Collections.shuffle(returnList); // тут делаем рандом
        if (returnList.size() >= amount) { // отрезаем не нужную часть
            // тут отрезаем не нужную часть
            returnList.subList(amount, returnList.size()).clear();
        }
        return returnList;
    }

    public void getTrip(){
        trip = Trip.getInstance();
        trip = (Trip) applicationContext.getBean("trip");
        generateStarcraft();
        generateListOfAstronauts();
        System.out.println(trip);
    }

}
