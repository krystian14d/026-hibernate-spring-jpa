package guru.springframework.sdjpainheritence.repositories;

import guru.springframework.sdjpainheritence.joinedtable.ElectricGuitar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectricGuitarRepository extends JpaRepository<ElectricGuitar, Long> {
}
