package com.crystal.spring_db.service;

import com.crystal.spring_db.model.User;
import com.crystal.spring_db.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UsersRepository usersRepository;

    public List<User> getAll(){
        return usersRepository.findAll();
    }

    public User getByID(Integer id){
        return this.usersRepository.findById(id).orElse(null);
    }

    public List<User> deleteByID(Integer id){
        this.usersRepository.deleteById(id);
        return this.getAll();
    }

    public  String addNewUser ( User user) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

//        user.setFullName(fullName);
//        user.setEmail(email);
//        user.setPassword(password);
        usersRepository.save(user);
        return "Saved";
    }

    public List<User> updateUser(User user){
        User existing = this.usersRepository.findById(user.getId()).orElse(null);
        existing.setFullName(user.getFullName());
        existing.setEmail(user.getEmail());
        existing.setPassword(user.getPassword());
        this.usersRepository.save(existing);
        return this.getAll();
    }
}
