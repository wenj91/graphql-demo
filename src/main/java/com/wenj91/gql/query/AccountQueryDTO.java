package com.wenj91.gql.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountQueryDTO {
    private Integer page;
    private Integer pageSize;
}
