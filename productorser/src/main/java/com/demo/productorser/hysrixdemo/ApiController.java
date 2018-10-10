package com.demo.productorser.hysrixdemo;


import com.demo.productorser.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="user")
public class ApiController {


    @RequestMapping(value="/{UserId}",method = RequestMethod.GET)
    public User getUser(@PathVariable("UserId") String UserId) {

        User u =  new User();
        u.setId(UserId);
        u.setName(Math.random()+"");
        return u;
    }




}
