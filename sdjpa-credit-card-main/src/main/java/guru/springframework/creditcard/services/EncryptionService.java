package guru.springframework.creditcard.services;

import org.springframework.stereotype.Service;

public interface EncryptionService {

    String encrypt (String freeText);
    String decrypt (String encryptedText);
}
