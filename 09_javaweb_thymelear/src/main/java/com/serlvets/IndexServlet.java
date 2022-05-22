package com.serlvets;

import com.atguigu.fruit.Fruit;
import com.atguigu.fruit.FruitDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class IndexServlet{
    @RequestMapping("/")
    public String text(Model model) throws Exception {
        FruitDAOImpl fruitDAO = new FruitDAOImpl();
        List<Fruit> fruitList = fruitDAO.getFruitList();
        for (Object obj: fruitList
             ) {
            System.out.println(obj);
        }
        model.addAttribute("fruitList",fruitList);
        return "index";
    }

}

