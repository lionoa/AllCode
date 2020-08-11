package Enum;

class Pizza {
    private  PizzaStatus status;

    //status的get方法(读)
    public PizzaStatus getStatus() {
        return status;
    }

    //构造函数
    Pizza(PizzaStatus status) {
        this.status = status;
    }

    //set
    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    //枚举
    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED
    }

    //switch中使用枚举类型
    public int getDeliveryTimeInDay(){
        switch (status){
            case READY: return 5;
            case ORDERED: return 2;
            case DELIVERED: return 0;
        }
        return 0;
    }
}

public class enumTest1{
    public static void main(String[] args){
        //构造函数直接初始化一个status值
        Pizza pizza = new Pizza(Pizza.PizzaStatus.READY);

        //使用get方法返回status的值
        System.out.println(pizza.getStatus());

        //调用方法
        System.out.println(pizza.getDeliveryTimeInDay());

        //使用set方法重新设置一个status值
        pizza.setStatus(Pizza.PizzaStatus.DELIVERED);
        System.out.println(pizza.getDeliveryTimeInDay());
    }
}
