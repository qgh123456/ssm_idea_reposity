package com.atqgh.service;

import com.atqgh.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> queryGoodsByName(String name);
}
