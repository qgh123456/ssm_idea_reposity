package com.atqgh.dao;


import com.atqgh.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {
    List<Goods> getAll(@Param("name") String name);
}
