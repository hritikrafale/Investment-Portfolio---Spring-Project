package com.example.investmentportfolio.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("user")
    public User getUser(@RequestParam Long id){
        return userRepository.findById(id).get();
    }

    @GetMapping("users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @PostMapping("new_user")
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }

    @PutMapping("update_user")
    public User updateUser(@RequestParam Long id, @RequestBody User user){
        User currUser = userRepository.findById(id).get();
        currUser.setGender("female");
        userRepository.save(currUser);
        return currUser;
    }

    @DeleteMapping("deleteuser")
    public void deleteUser(@RequestParam Long id){
        userRepository.deleteById(id);
    }
}
