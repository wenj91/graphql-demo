package com.wenj91.gql.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 账号类
 * </p>
 *
 * @author wenj91
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "account", autoResultMap = true)
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账号number
     */
    @TableField(value = "accountNumber")
    private String accountNumber;

    /**
     * 用户id
     */
    @TableField(value = "userId")
    private Integer userId;

    @TableField(value = "available")
    private BigDecimal available;

    @TableField(value = "dailyLimit")
    private BigDecimal dailyLimit;

    @TableField(value = "currency")
    private String currency;

    @TableField(value = "createAt")
    private Date createAt;


}
