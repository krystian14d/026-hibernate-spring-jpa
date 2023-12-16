package guru.springframework.sdjpainheritence.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("car")
public class Car extends Vehicle{

    private String trimLevel;

}
