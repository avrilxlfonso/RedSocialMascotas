package java.com.mycompany.myapp.wire.frontend.infrastructure.primary;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.com.mycompany.myapp.shared.collection.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/register")
  public ResponseEntity<SecurityProperties.User> register(@RequestBody SecurityProperties.User user) {
    SecurityProperties.User registeredUser = userService.register(user);
    return ResponseEntity.ok(registeredUser);
  }
}
