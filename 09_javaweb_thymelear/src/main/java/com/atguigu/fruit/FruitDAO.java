package com.atguigu.fruit;

import java.util.List;

public interface FruitDAO {
    //获取所有的库存列表信息
    List<Fruit> getFruitList() throws Exception;

    // 根据fid获取指定的水果库存信息
    Fruit getFruitByFid(Integer fid);

    // 修改指定的库存记录
    void updateFruit(Fruit fruit);

    // 根据指定的Fid删除库存记录
    void delFruit(Integer fid);

    // 添加库存信息
    void addFruit(Fruit fruit);
}
