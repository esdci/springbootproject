package com.inspur.springbootproject.service;

import com.inspur.springbootproject.entity.po.Power;
import com.inspur.springbootproject.entity.po.User;

public interface SpringBootProjectService {

    User querySpringBootProjectUser(int userId);

    Power querySpringBootProjectPowerById(int id);


}
