package com.atguigu.fruit;

import java.util.List;

public class FruitDAOImpl extends BaseDAO<Fruit> implements FruitDAO {
    @Override
    public List<Fruit> getFruitList() throws Exception {
        return super.executeQuery("select * from t_fruit");
    }

    @Override
    public Fruit getFruitByFid(Integer fid) {
        return super.load("select * from t_fruit where fid=?",fid);
    }

    @Override
    public void updateFruit(Fruit fruit) {
        String sql="update t_fruit set fname=?,price=?,fcount=? ,remark=? where fid =?";
        super.executeUpdate(sql,fruit.getFname(),fruit.getPrice(),fruit.getFcount(),fruit.getRemark(),fruit.getFid());
    }

    @Override
    public void delFruit(Integer fid) {
        String sql="delete from t_fruit where fid =?";
        super.executeUpdate(sql,fid);
    }

    @Override
    public void addFruit(Fruit fruit) {
        String sql="insert into t_fruit values (?,?,?,?,?)";
        super.executeUpdate(sql,fruit.getFid(),fruit.getFname(),fruit.getPrice(),fruit.getFcount(),fruit.getRemark());
    }

}
