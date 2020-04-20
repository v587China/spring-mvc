package com.ultra.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * TODO
 *
 * @author fan
 * @date 2020/4/17
 */
@Deprecated
public class HelloMultiActionController extends MultiActionController {

    public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/hello.jsp");
        modelAndView.addObject("mess", "hello, I implemented the MultiActionController that was Deprecated!");
        return modelAndView;
    }

    public ModelAndView hi(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/hello.jsp");
        modelAndView.addObject("mess", "hi, I implemented the MultiActionController that was Deprecated!");
        return modelAndView;
    }
}
