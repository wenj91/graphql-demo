package com.wenj91.gql.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wenj91.gql.pojo.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 账号类 Mapper 接口
 * </p>
 *
 * @author wenj91
 * @since 2021-03-04
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
