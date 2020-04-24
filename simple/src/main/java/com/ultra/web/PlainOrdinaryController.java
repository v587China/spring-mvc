package com.ultra.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 普通类当处理器,并处理多个请求
 *
 * @author fan
 * @date 2020/4/17
 */
@Controller
@RequestMapping("/plain")
public class PlainOrdinaryController {

    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/hello.jsp");
        modelAndView.addObject("mess", "hello, I am a plain ordinary object!");
        return modelAndView;
    }

    @GetMapping("/hi")
    public ModelAndView hi() {
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/hello.jsp");
        modelAndView.addObject("mess", "hi, I am a plain ordinary object!");
        return modelAndView;
    }
}
