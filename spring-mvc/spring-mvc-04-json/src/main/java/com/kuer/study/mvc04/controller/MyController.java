package com.kuer.study.mvc04.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kuer.study.mvc04.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kuer
 */
@Controller
public class MyController {

    @RequestMapping(value = "test")
    // 返回数据，不走视图解析器
    @ResponseBody
    public String test(Model model) throws Exception {
        User user = new User(){{
            setAge(18);
            setName("kuer");
            setSex("男");
        }};
        // jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        return  mapper.writeValueAsString(user);
    }

    /**
     * 解决乱码问题
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "test2", produces = "application/json;charset=utf-8")
    // 返回数据，不走视图解析器
    @ResponseBody
    public String test2(Model model) throws Exception {
        User user = new User(){{
            setAge(18);
            setName("kuer");
            setSex("男");
        }};
        // jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        return  mapper.writeValueAsString(user);
    }

    @RequestMapping(value = "test3")
    // 返回数据，不走视图解析器
    @ResponseBody
    public String test3(Model model) throws Exception {

        // jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        // 关闭使用时间戳返回时间
        mapper.configure(SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS, false);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(format);
        return  mapper.writeValueAsString(new Date());
    }

    @RequestMapping(value = "test4")
    // 返回数据，不走视图解析器
    @ResponseBody
    public String test4(Model model){

        User user = new User(){{
            setAge(18);
            setName("kuer");
            setSex("男");
        }};


        return  JSON.toJSONString(user);
    }

    @RequestMapping(value = "test5")
    // 返回数据，不走视图解析器
    @ResponseBody
    public String test5(Model model){
        return  JSON.toJSONString(new Date(), SerializerFeature.WriteDateUseDateFormat);
    }
}
