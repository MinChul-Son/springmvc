package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String users() {
        return "get users";
    }

    @PostMapping
    public String addUsers() {
        return "post user";
    }

    @GetMapping("/{userId}")
    public String user(@PathVariable("userId") String data) {
        return "get user " + data;
    }

    @PatchMapping("/{userId}")
    public String modifyUser(@PathVariable("userId") String data) {
        return "modify user " + data;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String data) {
        return "delete user " + data;
    }
}
