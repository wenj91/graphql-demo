package com.wenj91.gql.query;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.wenj91.gql.dao.UserMapper;
import com.wenj91.gql.pojo.entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserMutation implements GraphQLMutationResolver {

    @Resource
    private UserMapper userMapper;

    public User createPost(User user) {
        User newUser = User.builder()
                .name(user.getName())
                .age(user.getAge())
                .email(user.getEmail())
                .items(user.getItems())
                .build();

        userMapper.insert(newUser);

        return newUser;
    }
}
