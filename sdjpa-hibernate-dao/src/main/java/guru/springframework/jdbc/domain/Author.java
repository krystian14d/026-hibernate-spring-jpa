package guru.springframework.jdbc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NamedQueries({
        @NamedQuery(name = "author_find_all", query = "FROM Author"),
        @NamedQuery(name = "find_by_name", query = "FROM Author a WHERE a.firstName = :first_name and a.lastName = :last_name")
})
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Transient
    private List<Book> books;
}
