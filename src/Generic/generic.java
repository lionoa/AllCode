package Generic;

class Generic<T> {
    private final T item;

    //this.item是私有变量item，item是传进来的参数
    //构造方法
    public Generic(T item) {
        this.item = item;
    }

    //返回的是私有变量item
    public T getItem() {
        return item;
    }
}
public class generic{
    //泛型方法
    public static <E> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void main(String[] args){
        //实例化泛型类
        Generic<Integer> generic = new Generic<>(123456789);
        System.out.println(generic.getItem());

        //实例化泛型类
        Generic<String> generic1 = new Generic<>("我们是冠军！");
        System.out.println(generic1.getItem());

        //使用泛型中的getItem()方法
        Integer a = generic.getItem();
        System.out.println(a);

        //实现泛型接口的实例化
        GeneratorImpl<Integer> generator = new GeneratorImpl<Integer>();
        System.out.println(generator.method());

        //实现泛型接口的实例化
        GeneratorTest<Integer> generatorTest = new GeneratorTest<Integer>();
        System.out.println(generatorTest.method());

        //使用泛型方法
        Integer[] integers = {1, 2, 3};
        String[] strings = {"wo", "men", "shi", "guan", "jun"};
        printArray(integers);
        printArray(strings);
    }
}

//泛型接口
interface Generator<T>{
    T method();
}

//实现泛型接口，不指定返回类型
class GeneratorImpl<T> implements Generator<T>{
    @Override//伪代码，表示重写（可以不写），可以充当注释,编译器会验证@Override下的方法是否是父类中所有的，没有则会报错
    public T method() {
        return null;
    }
}

//实现泛型接口，指定返回类型
class GeneratorTest<T> implements Generator<Integer> {
    @Override
    public Integer method() {
        return 1234567890;
    }
}