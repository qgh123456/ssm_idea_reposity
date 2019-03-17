package com.atqgh.controller;

import com.atqgh.entity.Goods;
import com.atqgh.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/queryGoodsByName")
    @ResponseBody
    public List<Goods> queryGoodsByName(String name){
        List<Goods> goodsList = goodsService.queryGoodsByName(name);
        return goodsList;
    }

}
