package SimpleFactory.pizzastore.pizza;


//将Pizza设计为抽象类
public abstract class Pizza {
    protected String name;

    //准备原材料，不同点披萨不一样，因此为抽象方法
    public abstract  void prepare();

    public void bake(){
        System.out.println(name+"bakeing");
    }

    public void cut(){
        System.out.println(name+"cutting");
    }

    public void box(){
        System.out.println(name+"boxing");
    }

    public void setName(String name){
        this.name=name;
    }
}
