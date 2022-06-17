package test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenxiangmin
 * @ClassName TestController.java
 * @Description 测试
 * @createTime 2022年06月17日 10:48:00
 */
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("t1")
    public String test1() {
        return "t1";
    }

    @GetMapping("t2")
    public String test2() {
        return "zzzzzzzzzzzz";
    }
}
