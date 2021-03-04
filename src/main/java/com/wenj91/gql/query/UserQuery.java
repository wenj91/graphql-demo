package com.wenj91.gql.query;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.wenj91.gql.dao.UserMapper;
import com.wenj91.gql.pojo.entity.User;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserQuery implements GraphQLQueryResolver {

    @Resource
    private UserMapper userMapper;

    public List<User> users() {
        return userMapper.selectList(Wrappers.lambdaQuery());
    }

    public User user(Integer id) {
        return userMapper.selectById(id);
    }

    public List<User> userByIn(Integer age, String name){
        return userMapper.selectList(Wrappers.<User>lambdaQuery()
                .eq(age != null, User::getAge, age)
                .eq(name != null, User::getName, name)
        );
    }

}
