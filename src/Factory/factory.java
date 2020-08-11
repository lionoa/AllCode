package Factory;

//三种工厂设计模式
//第一种，通过输入的字符串决定实例化哪一个Human类（普通工厂模式）
//第二种，先实例化工厂类，再实例化一个Human类（多个工厂方法模式）
//第三种，省去了实例化工厂类的步骤（静态工厂方法模式）

//创建接口
interface Human{
    void display();
}

//创建实现类 男人
class man implements Human{
    public void display(){
        System.out.println("我是男人");
    }
}

//创建实现类 女人
class women implements Human{
    public void display(){
        System.out.println("我是女人");
    }
}

//创建工厂类
class HumanFactory{
    //创建返回类型为Human的方法   普通工厂模式
    public Human Create(String gender){
        if(gender.equals("man")){
            return new man();
        }else if(gender.equals("women")){
            return new women();
        }else{
            System.out.println("请重新输入类型");
            return null;
        }
    }

    //创建返回类型为man的方法    多个工厂方法模式
    public man createMan(){
        return new man();
    }

    //创建返回类型为women的方法    多个工厂方法模式
    public women createWomen(){
        return new women();
    }

    //创建静态的返回类型为man的方法   静态工厂方法模式
    public static man CreateMan(){
        return new man();
    }

    //创建静态的返回类型为women的方法  静态工厂方法模式
    public static women CreateWomen(){
        return new women();
    }
}

public class factory {
    public static void main(String[] args){
        //使用普通工厂模式
        HumanFactory humanFactory = new HumanFactory();
        Human human = humanFactory.Create("man");
        Human human1 = humanFactory.Create("women");
        System.out.println("这是第一种，普通工厂模式");
        human.display();
        human1.display();

        //空行分开好看，嘻嘻嘻
        System.out.println();

        //多个工厂方法模式
        HumanFactory humanFactory1 = new HumanFactory();
        Human human3 = humanFactory1.createMan();
        Human human4 = humanFactory1.createWomen();
        System.out.println("这是第二种，多个工厂方法模式");
        human3.display();
        human4.display();

        //再给你来条空行，耶！
        System.out.println();

        //静态工厂方法模式
        Human human5 = HumanFactory.CreateMan();
        Human human6 = HumanFactory.CreateWomen();
        System.out.println("这是第三种，静态工厂方法模式");
        human5.display();
        human6.display();
    }
}
