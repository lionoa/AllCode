package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class arrayList_test {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(3);
        arrayList.add(-1);
        arrayList.add(-4);
        arrayList.add(5);
        System.out.print("原始数组：");
        System.out.println(arrayList);

        Collections.reverse(arrayList);//反转
        System.out.println("反转：" + arrayList);

        Collections.rotate(arrayList,1);//把后 x 位移到最前面
        System.out.println(arrayList);

        Collections.sort(arrayList);//排序，从小到大
        System.out.println("排序：" + arrayList);

        Collections.shuffle(arrayList);//随机排序
        System.out.println("随机排序：" + arrayList);

        Collections.swap(arrayList,2,4);//交换两个索引位置的元素
        System.out.println("交换：" + arrayList);

        //定制排序的方法
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);//return o2.compareTo(o1)   前者从小到大排序，后者从大到小排序
            }
        });
        System.out.println("定制排序后：" + arrayList);

        System.out.println("最大值：" + Collections.max(arrayList));
        System.out.println("最小值：" + Collections.min(arrayList));

        Collections.replaceAll(arrayList,-4,7);//将-4替换成7
        System.out.println("新元素替换旧元素：" + arrayList);

        arrayList.add(7);
        System.out.println(arrayList);
        System.out.println("7出现的次数：" + Collections.frequency(arrayList,7));

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0);
        arrayList1.add(3);

        //先判断ArrayList1是否是arrayList中的一部分，是则返回第一次出现的索引，不然则返回-1
        System.out.println("arrayList1在arrayList中的索引" + Collections.indexOfSubList(arrayList,arrayList1));

        //二分查找
        //二分查找必须是有序的
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("二分查找 7的索引：" + Collections.binarySearch(arrayList,7));

    }
}
