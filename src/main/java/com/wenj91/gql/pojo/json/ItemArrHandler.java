package com.wenj91.gql.pojo.json;


import com.wenj91.gql.handler.JsonTypeHandler;

public class ItemArrHandler extends JsonTypeHandler<Item[]> {
    public ItemArrHandler() {
        super(Item[].class);
    }
}
