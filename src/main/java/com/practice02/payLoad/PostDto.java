package com.practice02.payLoad;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 3, message = "firstName should be atleast 3characters")
    private String firstName;
    @NotEmpty
    private String lastName;
    @Email
    private String email;
    private long mobile;
    @NotEmpty
    @Size(min = 3, message = "title should be altleast 3 characters")
    private String title;
    @NotEmpty
    @Size(min = 5,message = "description should be atleast 5 characters")
    private String description;
    @NotEmpty
    @Size(min = 3, message = "content should be atleast 3 characters")
    private String content;
}
