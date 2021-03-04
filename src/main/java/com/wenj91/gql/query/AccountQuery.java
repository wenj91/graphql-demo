package com.wenj91.gql.query;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.pagehelper.PageHelper;
import com.wenj91.gql.dao.AccountMapper;
import com.wenj91.gql.pojo.entity.Account;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class AccountQuery implements GraphQLQueryResolver {

    @Resource
    private AccountMapper accountMapper;


    public List<Account> accounts(DTO dto) {
        if (dto != null && dto.getPage() != null && dto.getPage() != null){
            PageHelper.startPage(dto.getPage(), dto.getPageSize());
        }

        return accountMapper.selectList(Wrappers.lambdaQuery());
    }
}
