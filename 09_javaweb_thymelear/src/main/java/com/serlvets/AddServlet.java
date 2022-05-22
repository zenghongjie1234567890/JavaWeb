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
 * @author : ??§³??
 * @date : 2022-02-02 21:24
 **/
@Controller
public class AddServlet {
    private Integer fid=10;

    public AddServlet() {
        fid++;
    }

    @RequestMapping("/add.do")
    public String text(Model model,String fname,String price,String fcount,String remark) throws Exception {
        FruitDAOImpl fruitDAO = new FruitDAOImpl();
        fruitDAO.addFruit(new Fruit(fid,fname,new Integer(price),new Integer(fcount),remark));
        List<Fruit> fruitList = fruitDAO.getFruitList();
        model.addAttribute("fruitList",fruitList);
        return "index";
    }

    @RequestMapping("/add")
    public String tx(){
        return "add";
    }
}
