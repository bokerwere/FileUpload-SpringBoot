package com.boker.ImageUpload.service;

import com.boker.ImageUpload.model.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {
    User getJson(String user, List<MultipartFile> file);

}
