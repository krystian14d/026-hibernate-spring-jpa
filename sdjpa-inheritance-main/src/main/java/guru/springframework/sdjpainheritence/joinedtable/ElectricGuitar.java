package guru.springframework.sdjpainheritence.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ElectricGuitar extends Guitar{
    private Integer numberOfPickups;

}
