package com.user.service;

import com.user.entity.Contact;
import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user list
    List<User> list = List.of(
            new User(1311L,"Kunal Joshi", "9850319959"),
            new User(1322L, "Ankit Tiwari", "9850318859"),
            new User(1333L,"Ravi Tiwari", "9850748899")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
