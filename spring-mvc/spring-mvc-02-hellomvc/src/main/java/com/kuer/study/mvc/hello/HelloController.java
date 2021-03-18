package com.kuer.study.mvc.hello;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kuer
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 模型和视图
        ModelAndView mv = new ModelAndView();

        // 分装对象，防灾ModelAndView中
        mv.addObject("msg", "HelloSpringMVC!");
        // 封装要跳转的视图，防灾modelAndView中
        // /WEB-INF/jsp/hello.jsp
        mv.setViewName("hello");
        /*
        * 如果出现500找不到包的问题需要在导出文件中加入依赖的导入
        * */
        return mv;
    }
}
