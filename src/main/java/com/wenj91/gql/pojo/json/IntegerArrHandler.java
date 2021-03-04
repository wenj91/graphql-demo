package com.wenj91.gql.pojo.json;


import com.wenj91.gql.handler.JsonTypeHandler;

public class IntegerArrHandler extends JsonTypeHandler<Integer[]> {
    public IntegerArrHandler() {
        super(Integer[].class);
    }
}
