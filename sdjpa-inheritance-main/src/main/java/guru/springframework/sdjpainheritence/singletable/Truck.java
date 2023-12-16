package guru.springframework.sdjpainheritence.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("truck")
public class Truck extends Vehicle{
    private Integer payload;
}
