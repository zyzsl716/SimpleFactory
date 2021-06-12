package SimpleFactory.pizzastore.order;

import SimpleFactory.pizzastore.pizza.CheesePizza;
import SimpleFactory.pizzastore.pizza.GreekPizza;
import SimpleFactory.pizzastore.pizza.PepperPizza;
import SimpleFactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

    //对应ordertype返回对应的Pizza对象
    public Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");

        Pizza pizza=null;

        if(orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("希腊披萨");
        }else  if (orderType.equals("cheese")){
            pizza=new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if (orderType.equals("pepper")){
            pizza=new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
