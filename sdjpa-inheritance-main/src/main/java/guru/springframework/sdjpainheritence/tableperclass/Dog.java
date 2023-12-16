package guru.springframework.sdjpainheritence.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Dog extends Mammal{

    private String breed;
}
