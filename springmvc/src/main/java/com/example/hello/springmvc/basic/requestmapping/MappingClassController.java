package com.example.hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

/**
 * author         : SYS
 * date           : 2024-11-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-25        SYS       최초 생성
 */

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String users() {
        return "users";
    }

    @PostMapping
    public String addUser() {
        return "addUser";
    }

    @GetMapping("/{userId]")
    public String findUser(@PathVariable String userId) {
        return "get userId" + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "update userId" + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId" + userId;
    }

}
