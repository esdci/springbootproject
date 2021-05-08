package com.inspur.springbootproject.dao.mapper;

import com.inspur.springbootproject.entity.po.Power;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PowerMapper {
    int insert(Power record);

    int insertSelective(Power record);

    Power selectByPrimaryKey(Integer id);

    List<Power> select();

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Power power);

    int updateByPrimaryKeySelective(Power power);
}