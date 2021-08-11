package net.zerotodev.app.demo.user.service;

import lombok.RequiredArgsConstructor;
import net.zerotodev.app.demo.user.entity.User;
import net.zerotodev.app.demo.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public List<User> findAllByName(String name){
        return userRepository.findAllByName(name);
    }
}
