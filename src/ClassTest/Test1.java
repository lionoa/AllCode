package ClassTest;


public class Test1 {
    public static void main(String[] args){

        Animal animal = new Animal("Mouse", 90);
        animal.eat();
        animal.sleep();
        animal.introduction();
        Mouse mouse = new Mouse("mouse", 17);
        mouse.play();
        mouse.display();
        smallMouse smallmouse = new smallMouse("smallMouse", 18);
        smallmouse.display();
    }
}

class Animal{

    private final String name;
    private final int id;

    public Animal(String myName, int myId) {
        name = myName;
        id = myId;
    }

    public void eat(){
        System.out.printf("%s正在吃",name);
    }

    public void sleep(){
        System.out.println(name+"正在睡");
    }

    public void introduction() {
        System.out.printf("大家好！我是%d号%s.%n", id, name);
    }
}

class Mouse extends Animal{

    public Mouse(String myName, int myId){
        super(myName,myId);
    }

    public void play(){
        System.out.println("i am playing basketball");
        super.eat();

    }

    public void display(){
        super.introduction();
        this.play();
    }
}

class smallMouse extends Mouse{

    public smallMouse(String myName, int myId){
        super(myName, myId);
    }

    public void display(){
        System.out.println("hello world!");
    }
}
