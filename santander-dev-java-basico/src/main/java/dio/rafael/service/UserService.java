package dio.rafael.service;

import dio.rafael.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
