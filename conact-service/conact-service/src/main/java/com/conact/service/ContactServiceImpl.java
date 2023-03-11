package com.conact.service;

import com.conact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list = List.of(
            new Contact(1L,"kunal@gmail.com","Kunal",1311L),
            new Contact(2L,"anil@gmail.com","Anil",1311L),
            new Contact(3L,"sunil@gmail.com","Sunil",1322L),
            new Contact(4L,"akshay@gmail.com","Akshay",1333L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}

