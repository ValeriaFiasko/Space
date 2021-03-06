package Entity;
import lombok.*;

import java.util.List;

@Getter @Setter @AllArgsConstructor @EqualsAndHashCode @NoArgsConstructor
public class Trip {
    private String name;
    private List<Astronaut> astronauts;
    private Spacecraft spacecraft;
    private String planet;
    private int duration;
    private static Trip trip;

    public static synchronized Trip getInstance() {
        if (trip == null) {
            trip = new Trip();
        }
        return trip;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "name='" + name + '\'' + "," + '\n' +
                "astronauts=" + astronauts + '\'' + "," + '\n' +
                "spacecruft=" + spacecraft + '\'' + "," + '\n' +
                "planet='" + planet + '\'' + "," + '\n' +
                "duration=" + duration + " days" +
                '}';
    }

}
