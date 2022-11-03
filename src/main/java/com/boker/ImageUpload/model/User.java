package com.boker.ImageUpload.model;

import lombok.Data;

import javax.persistence.Lob;
@Data
public class User {
    private Long id;
    private  String  firstName;
    private  long age;
    private  int count;


}
