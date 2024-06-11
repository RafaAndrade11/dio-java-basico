package dio.aula_spring_data_jpa;

import dio.aula_spring_data_jpa.model.Person;
import dio.aula_spring_data_jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private PersonRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setName("Rafael");
        person.setUsername("paulis");
        person.setPassword("123123");

        repository.save(person);

        for (Person p : repository.findAll()) {
            System.out.println(p);
        }

    }
}
