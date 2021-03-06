package com.wenj91.gql.query;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wenj91.gql.dao.AccountMapper;
import com.wenj91.gql.pojo.entity.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Slf4j
public class AccountQuery implements GraphQLQueryResolver {

    @Resource
    private AccountMapper accountMapper;

    public List<Account> accounts(AccountQueryDTO dto) {
        if (dto != null && dto.getPage() != null && dto.getPage() != null) {
            PageHelper.startPage(dto.getPage(), dto.getPageSize());
        }

        List<Account> accounts = accountMapper.selectList(Wrappers.lambdaQuery());

        if (accounts instanceof Page) {
            Page<Account> page = (Page<Account>) accounts;
            log.info("query account by page, page:{}, pageSize:{}, count:{}",
                    page.getPageNum(), page.getPageSize(), page.getTotal());
            log.info(accounts.toString());
        }

        return accounts;
    }
}
