package com.petreca.dio_challenge.service.impl;

import com.petreca.dio_challenge.model.User;
import com.petreca.dio_challenge.repository.UserRepository;
import com.petreca.dio_challenge.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account Number is already in use");
        }
        return userRepository.save(userToCreate);
    }
}
