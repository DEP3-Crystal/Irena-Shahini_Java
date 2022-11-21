package com.crystal.spring_db.resource;

import com.crystal.spring_db.model.User;
import com.crystal.spring_db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/")
public class UsersResource {
    @Autowired
    UserService userService;

    @GetMapping(value="/users")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping(value="/users/{id}")
    public User getByID(@PathVariable Integer id){
        return this.userService.getByID(id);
    }

    @DeleteMapping(value="/users/delete/{id}")
    public List<User> deleteByID(@PathVariable Integer id){
        return this.userService.deleteByID(id);
    }

    @PostMapping(path="users/add")
    public String addNewUser (@RequestBody User user) {
        this.userService.addNewUser(user);
        return "Saved";
    }

    @PutMapping(value="/users/update")
    public List<User> updateUser(@RequestBody User user){
        return this.userService.updateUser(user);
    }


//    @PostMapping(value="/add")
//    public List<User> addUser(@RequestBody User user){
//         usersRepository.save(user);
//         return usersRepository.findAll();
//    }

//    CREATE TABLE `data`.`users` (
//            `id` INT NOT NULL,
//            `fullName` VARCHAR(45) NOT NULL,
//  `email` VARCHAR(45) NOT NULL,
//  `password` VARCHAR(45) NOT NULL,
//    PRIMARY KEY (`id`),
//    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
//    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);

}
