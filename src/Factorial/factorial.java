package Factorial;

public class factorial {
    public static void main(String[] args){

        //递归时间消耗
        long startTime = System.nanoTime();
        System.out.println(recursive(7));
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println("time=" + time);

        //循环时间消耗
        long start_Time = System.nanoTime();
        System.out.println(cyclePause(7));
        long end_Time = System.nanoTime();
        long times = end_Time - start_Time;
        System.out.println("time=" + times);
    }

    //递归求阶乘，空间消耗大，每使用一次recursive方法都要再开辟一个内存，并且随着数的变大，时间消耗成几何增长
    public static long recursive(long N){
        if(N == 1){
            return 1;
        }
        else{
            return N * recursive(N - 1);
        }
    }

    //用循环的方法求阶乘，时间短内存小，时间复杂度O(N)
    public static long cyclePause(long N){
        int result = 1;
        for(int i = 1; i <= N; i++){
            result *= i;
        }
        return result;
    }
}