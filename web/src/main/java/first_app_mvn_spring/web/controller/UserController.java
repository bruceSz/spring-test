package first_app_mvn_spring.web.controller;

import first_app_mvn_spring.domains.User;
import first_app_mvn_spring.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRepository user_repo;

    @Autowired
    public UserController(UserRepository user_repo) {
        this.user_repo = user_repo;
    }
    @PostMapping("/person/save")
    public User save(@RequestParam String name) {
        User u = new User();
        u.setName(name);
        if (user_repo.save(u)) {
            System.out.println("haha");
        }
        return u;

    }

}
