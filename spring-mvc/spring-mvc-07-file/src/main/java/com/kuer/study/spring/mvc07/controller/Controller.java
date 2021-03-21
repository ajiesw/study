package com.kuer.study.spring.mvc07.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author kuer
 */
@RestController
public class Controller {

    @RequestMapping("/upload")
    public String fileController(@RequestParam("file")CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        String path = request.getServletContext().getRealPath("/upload");
        File realPath = new File(path);
        if (!realPath.exists()){
            realPath.mkdir();
        }
        System.out.println(realPath.getAbsolutePath());
        // 直接写文件
        file.transferTo(new File(realPath + File.separator + file.getOriginalFilename()));
        return "success";
    }

}
