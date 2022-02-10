package ques1.src;

import java.time.LocalTime;
import java.util.ArrayList;

public class Menu {
    static ArrayList<Dish> menuList;

    //     Using static block
    static {
//       Adding some dishes by using Dish class
        Dish malai_kofta= new Dish(1, "Malai Kofta", LocalTime.now());
        Dish rajma_rice= new Dish(2, "Rajma Rice", LocalTime.now());
        Dish chicken_tandoori= new Dish(3, "Chicken Tandoori", LocalTime.now());
        Dish matar_paneer= new Dish(4, "Matar Paneer", LocalTime.now());
        Dish dal_makhni= new Dish(5, "Dal Makhni", LocalTime.now());


//        Adding all created dishes to arraylist
        menuList = new ArrayList<Dish>();
        menuList.add(malai_kofta);
        menuList.add(rajma_rice);
        menuList.add(chicken_tandoori);
        menuList.add(matar_paneer);
        menuList.add(dal_makhni);
    }
}


