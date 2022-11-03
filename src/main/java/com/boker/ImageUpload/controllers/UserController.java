package com.boker.ImageUpload.controllers;

import com.boker.ImageUpload.model.User;
import com.boker.ImageUpload.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private  UserService userService;
    @PostMapping(value = "/upload",consumes ={MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})

    public User upload(@RequestPart("user") String user, @RequestPart("file")List<MultipartFile>file){
         User user1=userService.getJson(user,file);
        return  user1;
    }
}
