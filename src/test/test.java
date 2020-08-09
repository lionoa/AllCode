package test;

import java.math.BigDecimal;

//BigDecimal的测试
public class test {
    public static void main(String[] args){
        BigDecimal a = new BigDecimal("1.154897916");
        BigDecimal b = a.setScale(3,BigDecimal.ROUND_HALF_DOWN);//四舍五入保留几位小数的方法
        System.out.println(b);
    }
}
