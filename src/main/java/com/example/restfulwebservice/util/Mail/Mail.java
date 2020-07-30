package com.example.restfulwebservice.util.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

public class Mail {
    @Autowired
    JavaMailSender mailSender;



}
