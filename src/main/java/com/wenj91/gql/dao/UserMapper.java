package com.wenj91.gql.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wenj91.gql.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}