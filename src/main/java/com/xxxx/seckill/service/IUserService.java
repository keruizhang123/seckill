package com.xxxx.seckill.service;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kerui
 * @since 2023-01-11
 */
@Controller
@RequestMapping("demo")
@Api(value = "demo", tags = "demo测试类")
public interface IUserService extends IService<User> {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "example");
        return "hello";
    }
}
