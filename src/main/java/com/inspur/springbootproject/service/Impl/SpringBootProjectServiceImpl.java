package com.inspur.springbootproject.service.Impl;

import com.inspur.springbootproject.dao.mapper.PowerMapper;
import com.inspur.springbootproject.dao.mapper.UserMapper;
import com.inspur.springbootproject.entity.po.Power;
import com.inspur.springbootproject.entity.po.User;
import com.inspur.springbootproject.service.SpringBootProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringBootProjectServiceImpl implements SpringBootProjectService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PowerMapper powerMapper;

    @Override
    public User querySpringBootProjectUser(int userId){
        User user = new User();

        user = userMapper.selectByPrimaryKey(userId);

        return null;
    }

    @Override
    public Power querySpringBootProjectPowerById(int id){
        Power power = new Power();

        power = powerMapper.selectByPrimaryKey(id);

        return power;
    }

}
