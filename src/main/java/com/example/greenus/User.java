package com.example.greenus;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private String id;
    private String pw;
    private String email;
    private Date birth;
}
