package Enum;

public class enumTest2 {
    public static void main(String[] args){
        Pizza1 pizza1 = new Pizza1();
        pizza1.setStatus(Pizza1.PizzaStatus.READY);
        pizza1.printTimeDeliver();
        System.out.println(pizza1.isDeliverable());
    }
}

class Pizza1{
    private PizzaStatus status;

    //设置读与写
    public PizzaStatus getStatus() {
        return status;
    }
    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    //枚举
    public enum PizzaStatus{
        ORDERED(5){
            @Override
            public boolean isORDERED(){
                return true;
            }
        },
        READY(2){
            @Override
            public boolean isREADY(){
                return true;
            }
        },
        DELIVERED(0){
            @Override
            public boolean isDELIVERED(){
                return true;
            }
        };
        private int timeToDelivery;
        public boolean isORDERED(){return false;}
        public boolean isREADY(){return false;}
        public boolean isDELIVERED(){return false;}

        //get方法返回timeToDelivery
        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        //构造函数
        PizzaStatus(int timeToDelivery){
            this.timeToDelivery = timeToDelivery;
        }
    }

    public boolean isDeliverable(){
        return this.status.isREADY();
    }

    public void printTimeDeliver(){
        System.out.println("Time to delivery is " + this.getStatus().getTimeToDelivery());
    }
}