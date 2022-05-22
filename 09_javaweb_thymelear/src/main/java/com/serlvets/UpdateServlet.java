package com.serlvets;

import com.atguigu.fruit.Fruit;
import com.atguigu.fruit.FruitDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * JavaWeb
 *
 * @author : ÔøÐ¡½Ü
 * @date : 2022-02-02 15:50
 **/
@Controller
public class UpdateServlet {
    @RequestMapping("/update.do")
    public String text01(Model model,String fid,String fname,String price,String fcount,String remark) throws Exception {
        FruitDAOImpl fruitDAO = new FruitDAOImpl();
        fruitDAO.updateFruit(new Fruit(new Integer(fid),fname,new Integer(price),new Integer(fcount),remark));
        List<Fruit> fruitList = fruitDAO.getFruitList();
        model.addAttribute("fruitList",fruitList);
        return "index";
    }
}
