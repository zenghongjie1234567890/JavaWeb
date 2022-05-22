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
 * @author : 曾小杰
 * @date : 2022-02-02 21:08
 **/
@Controller
public class DelServlet {
    @RequestMapping("/del.do")
    public String text02(Model model, String fid) throws Exception {
        FruitDAOImpl fruitDAO = new FruitDAOImpl();
        fruitDAO.delFruit(new Integer(fid));
        List<Fruit> fruitList = fruitDAO.getFruitList();
        model.addAttribute("fruitList",fruitList);
        return "index";
    }
}
