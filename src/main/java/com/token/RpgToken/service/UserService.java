package com.token.RpgToken.service;

import com.token.RpgToken.model.User;
import com.token.RpgToken.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User saveUser(User user) {
        try{
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userRepository.save(user);
        } catch (Exception e){
            throw new RuntimeException("Erro ao salvar usuario", e);
        }
    }

    public User findById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);

        return userOptional.orElseThrow(() ->
                new NoSuchElementException("Usuário não encontrado com o nome: " + id)
        );
    }
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

}