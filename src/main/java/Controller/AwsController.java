package Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AwsController {
    @GetMapping("/aws/v1")
    public String hello() {
        log.info("/aws/v1");

        return "<h1>aws v1 호출</h1>";
    }
}
