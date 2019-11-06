package com.offcn.springbootdemo02;


import com.offcn.Springbootdemo02Application;
import com.offcn.bean.User;
import com.offcn.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springbootdemo02Application.class)
public class Springbootdemo02ApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    public void getUserList(){
        List<User> all = userMapper.getUserList();
        for (User user : all) {
            System.out.println(user);
        }
    }
    //测试redis
    @Test
    public void testRedisTemplate(){
        //存到redis的缓存中
        redisTemplate.opsForValue().set("hello","java");
        //从redis的缓存中取出键值对
        String a = (String)redisTemplate.opsForValue().get("java");
        System.out.println(a);

        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setPassword("123456");
        user.setUsername("zhangsan");
        redisTemplate.opsForValue().set("user",user);
        User user1 = (User) redisTemplate.opsForValue().get("user");
        System.out.println(user1);
    }
}
