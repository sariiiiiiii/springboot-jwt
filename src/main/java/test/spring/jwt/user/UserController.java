package test.spring.jwt.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import test.spring.jwt.util.JwtTokenProvider;

@Slf4j
@Controller
@RequiredArgsConstructor
public class UserController {

    private final JwtTokenProvider jtp;

    @PostMapping("/test")
    public void test(User user){

        user.setId(1);
        user.setPassword("sdferh34t35g");
        jtp.createToken(user.getId(), user.getPassword());

        System.out.println("jwt : " + jtp.createToken(user.getId(), user.getPassword()));

    }

}
