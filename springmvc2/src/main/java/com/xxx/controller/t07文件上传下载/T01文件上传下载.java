package com.xxx.controller.t07文件上传下载;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月09日 21:07
 */
@Controller
@RequestMapping("/t07")
public class T01文件上传下载 {

    /**
     * 接收文件
     *http://localhost:8080/springmvc2/pages/t070upload.jsp
     */
    @RequestMapping("/upload")
    public String upload(HttpServletRequest request, MultipartFile imgFile, String memo) {
        //1.获取网站的upload目录的路径： ServletContext对象
        String upload = request.getSession().getServletContext().getRealPath("/upload");
        System.out.println("upload:"+upload);
        //判断该目录是否存在，不存在，自己创建
        File uploadFile = new File(upload);
        if (!uploadFile.exists()) {
            uploadFile.mkdirs();//连同父路径一起创建
        }
        //把文件保存到upload目录
        //2.生成随机文件名称
        //2.1 原来的文件名
        String oldName = imgFile.getOriginalFilename();
        //2.2 随机生成文件名
        String uuid = UUID.randomUUID().toString();
        //2.3 获取文件后缀
        String extName = oldName.substring(oldName.lastIndexOf(".")); //.jpg
        //2.4 最终的文件名
        String fileName = uuid + extName;
        //3.保存
        try {
            imgFile.transferTo(new File(upload + "/" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件描述：" + memo);
        return "t01success";
    }

    /**
     * 下载文件
     * http://localhost:8080/springmvc2/pages/t071download.jsp
     */
    @RequestMapping("/down")
    public void upload(HttpSession session, HttpServletResponse response) throws Exception {
        //模拟文件下载
        //1.读取需要下载的文件
        InputStream inputStream = session.getServletContext()
                .getResourceAsStream("/upload/1.jpg");

        //2.输出文件
        //设置响应头
        response.setHeader("Content-Disposition","attachment;filename=1.jpg");
        OutputStream outputStream = response.getOutputStream();

        byte[] buf = new byte[1024];
        int len = 0;
        while( (len = inputStream.read(buf))!=-1 ){
            outputStream.write(buf,0,len);
        }

        //3.关闭资源
        outputStream.close();
        inputStream.close();
    }
}
