package guru.springframework.sdjpainheritence.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Guitar extends Instrument {
    private Integer numberOfStrings;
}
