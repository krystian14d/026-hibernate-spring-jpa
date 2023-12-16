package guru.springframework.sdjpainheritence.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Dolphin extends Mammal{

    private Boolean hasSpots;
}
