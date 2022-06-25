package com.example.valid.controller;

import com.example.valid.model.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;


@Slf4j
@RestController
public class UserController {

    @PostMapping(value = "/user")
    public String insertUser(@RequestBody @Valid UserDto userDto){
        log.info("@ param : {}", userDto);
        return "success";
    }
}

