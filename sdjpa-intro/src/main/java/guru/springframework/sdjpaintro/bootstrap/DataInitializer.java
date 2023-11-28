package guru.springframework.sdjpaintro.bootstrap;

import guru.springframework.sdjpaintro.domain.Book;
import guru.springframework.sdjpaintro.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"local", "default"})
@RequiredArgsConstructor
@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();

        Book bookDDD = new Book("Domain Driven Design", "123", "RandoumHouse");
        Book savedBook = bookRepository.save(bookDDD);

        Book bookSIA = new Book("Spring in action", "123456", "Oriely");
        Book savedSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book ID: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });
    }
}
