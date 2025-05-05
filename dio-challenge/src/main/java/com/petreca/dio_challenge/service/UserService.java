package com.petreca.dio_challenge.service;

import com.petreca.dio_challenge.model.User;

public interface UserService {

    User findById (Long id);

    User create(User userToCreate);
}
