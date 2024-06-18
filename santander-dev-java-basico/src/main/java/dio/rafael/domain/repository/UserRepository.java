package dio.rafael.domain.repository;

import dio.rafael.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber (String accountNumber);
}
