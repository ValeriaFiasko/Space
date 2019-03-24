package Entity;
import Service.CosmoTripService;
import lombok.*;

@Getter @Setter @AllArgsConstructor @EqualsAndHashCode @NoArgsConstructor
public class Spacecraft {
    private String name;
    private int crewCapacity;
    private int amountFuel;
    private CosmoTripService cosmoTripService;

    @Override
    public String toString() {
        return "Spacecraft{" +
                "name='" + name + '\'' +
                ", crewCapacity=" + crewCapacity +
                ", amountFuel=" + amountFuel + " tons" +
                '}';
    }

}
