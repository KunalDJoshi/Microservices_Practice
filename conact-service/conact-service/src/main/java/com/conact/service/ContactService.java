package com.conact.service;

import com.conact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContactService {
    public List<Contact> getContactsOfUser(Long userId);
}

