package com.offcn.controller;

import com.offcn.bean.User;
import com.offcn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    /*//查找一个list集合
    @RequestMapping("/userlist1")
    @ResponseBody
    public List<User> getUserList(){
        List<User> all = userMapper.findAll();
        return all;
    }
    @RequestMapping("/userlist2")
    public String getUser(Model model){
        List<User> all = userMapper.findAll();
        model.addAttribute("all",all);
        return "user";
    }*/
    @RequestMapping("list")
    public ModelAndView getUserList(){
        ModelAndView view = new ModelAndView("user");
        List<User> all = userMapper.getUserList();
        view.addObject("all",all);
        return view;
    }
}
