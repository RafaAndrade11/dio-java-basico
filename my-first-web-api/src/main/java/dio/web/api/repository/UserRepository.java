package dio.web.api.repository;

import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save (User user) {
        if (user.getId()==null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório.");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório.");
        }
        System.out.println(user);
    }

    public void deleteById(Long id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário.", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema.");
        List<User> userList = new ArrayList<>();
        userList.add(new User("Rafael", "281096"));
        userList.add(new User("João", "240898"));
        return userList;
    }

    public User findById(Long id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário.", id));
        return new User("Rafael", "281096");
    }

    public User findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário.", username));
        return new User("Rafael", "281096");
    }

}
