package com.ssm.controller;

import com.ssm.domain.User;
import com.ssm.service.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        model.addAttribute("list",accountService.findAllUser());
        return "UserList";
    }
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        accountService.saveUser(user);
        return "redirect:findAll";
    }
    @RequestMapping("/deleteUser")
    public String deleUser(String name){
        accountService.deleteUSer(name);
        return "redirect:findAll";
    }

    @RequestMapping("/creatPDF")
    public String download(HttpServletRequest request, HttpServletResponse response, String name){
        User user=accountService.findByName(name);
        ServletContext servletContext=request.getSession().getServletContext();
        String realpath=servletContext.getRealPath("/File/pdftest.pdf");
        String newPath=servletContext.getRealPath("/File/result.pdf");
        System.out.println(realpath);
        accountService.creatPDF(realpath,newPath,user);
        return "redirect:download";
    }

@RequestMapping("/addUser")
public String addUser(){
        return "newUser";
}
    @RequestMapping("/download")
    public void download(HttpServletResponse response,HttpServletRequest request)throws Exception {
        String filename = "result.pdf";
        ServletContext servletContext = request.getSession().getServletContext();
        String download_path = servletContext.getRealPath("/File/" + filename);
        FileInputStream fileInputStream = new FileInputStream(download_path);
        String mimeType = servletContext.getMimeType(filename);
        response.setHeader("content-type", mimeType);
        response.setHeader("content-disposition", "attachment;filename=" + filename);
        ServletOutputStream os = response.getOutputStream();
        byte[] buff = new byte[1024 * 8];
        int len = 0;
        while ((len = fileInputStream.read(buff)) != -1) {
            os.write(buff, 0, len);
        }
        fileInputStream.close();
    }
}
