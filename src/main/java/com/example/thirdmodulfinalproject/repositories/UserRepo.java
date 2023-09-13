package com.example.thirdmodulfinalproject.repositories;

import com.example.thirdmodulfinalproject.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    public static final List<User> storage = new ArrayList<>() {{
        add(new User("Ivan", "Иванов", "ivan", "123", "ivan@gmail.com"));
        add(new User("Петр", "Петров", "petr", "123", "petr@gmail.com"));
        add(new User("Сидр", "Сидоров", "sidr", "123", "sidr@gmail.com"));

    }};











}
