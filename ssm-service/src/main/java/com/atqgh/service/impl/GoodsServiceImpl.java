package com.atqgh.service.impl;

import com.atqgh.dao.GoodsDao;
import com.atqgh.entity.Goods;
import com.atqgh.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    public List<Goods> queryGoodsByName(String name) {
        if(StringUtils.isEmpty(name)){
            name=null;
        }
        return goodsDao.getAll(name);
    }
}
