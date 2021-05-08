package com.inspur.springbootproject.controller;

import com.inspur.springbootproject.entity.po.Power;
import com.inspur.springbootproject.enums.HttpStatusEnum;
import com.inspur.springbootproject.service.SpringBootProjectService;
import com.inspur.springbootproject.vo.ResponseVo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/SpringBootProject")
public class SpringBootProjectController {
    private final static Log logger = LogFactory.getLog(SpringBootProjectController.class);

    @Autowired
    private SpringBootProjectService springBootProjectService;

    @GetMapping("/getSpringBootProjectUser")
    public void getSpringBootProjectUser(){
        springBootProjectService.querySpringBootProjectUser(1);
    }

    @CrossOrigin
    @GetMapping("/getSpringBootProjectPowerById")
    public ResponseVo<Power> getSpringBootProjectPowerById(@RequestParam(value = "id", required = true) Integer id){
        Power power = new Power();
        try {
            power = springBootProjectService.querySpringBootProjectPowerById(id);
        } catch(Exception e){
            logger.error(e);
            return new ResponseVo<Power>().build(power,"failed", HttpStatusEnum.UNKNOWN_ERROR);
        }
        return new ResponseVo<Power>().build(power, "successful", HttpStatusEnum.OK);
    }
}
