package Entity;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter @Setter @AllArgsConstructor @ToString @EqualsAndHashCode @NoArgsConstructor/* @Qualifier("Entity.Astronaut")*/
public class Astronaut {
    private String firstName;
    private String lastName;
    private int age;
    private  String position;


}
