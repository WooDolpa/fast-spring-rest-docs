package com.rest.docs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * file           : IndexController
 * author         : jwlee
 * date           : 2023-02-14
 * description    :
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String helloWorld(){
        return "hello world";
    }
}
