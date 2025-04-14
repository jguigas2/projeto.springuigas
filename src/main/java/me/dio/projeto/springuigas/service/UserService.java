package me.dio.projeto.springuigas.service;

import me.dio.projeto.springuigas.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
