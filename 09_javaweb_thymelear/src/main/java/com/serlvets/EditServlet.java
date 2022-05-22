package com.serlvets;

import com.atguigu.fruit.Fruit;
import com.atguigu.fruit.FruitDAOImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JavaWeb
 *
 * @author : 曾小杰
 * @date : 2022-02-02 15:08
 **/
@Controller
public class EditServlet {
    @RequestMapping("/edit.do")
    public String text(Model model,String fid){
        FruitDAOImpl fruitDAO = new FruitDAOImpl();
        Fruit fruitByFid = fruitDAO.getFruitByFid(new Integer(fid));
        model.addAttribute("fruit",fruitByFid);
        return "edit";
    }
}
