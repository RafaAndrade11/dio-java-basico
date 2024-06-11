package dio.aula_spring_data_jpa.repository;

import dio.aula_spring_data_jpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
