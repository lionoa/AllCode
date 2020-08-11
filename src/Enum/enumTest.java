package Enum;

public class enumTest {
    //简单枚举示例
    public enum PizzaStatus{
        ORDERED,
        READY,
        DELIVERED;
    }

    public static void main(String[] args){
        System.out.println(PizzaStatus.ORDERED);//ORDERED
        System.out.println(PizzaStatus.ORDERED.name());//ORDERED
        System.out.println(PizzaStatus.ORDERED.name().getClass());//class java.lang.String
        System.out.println(PizzaStatus.ORDERED.getClass());//class enum.PizzaStatus
    }
}
