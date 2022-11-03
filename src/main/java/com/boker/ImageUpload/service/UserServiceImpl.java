package com.boker.ImageUpload.service;

import com.boker.ImageUpload.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Service
public class UserServiceImpl  implements UserService{
    @Override
    public User getJson(String user, List<MultipartFile> file) {
        User userJson=new User();

            ObjectMapper objectMapper=new ObjectMapper();
        try {
            userJson=objectMapper.readValue(user,User.class);
        } catch ( IOException e) {
            System.out.println(e.getMessage());
        }
        int fileCount=file.size();
        userJson.setCount(fileCount);

        return userJson;
    }
}
