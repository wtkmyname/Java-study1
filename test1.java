package s250109.study1;

/*
 * 涉及：多态的创建及使用
 *      多态涉及的向下转换
 *               向下转换中易遇到问题：等号左右对象不同
 *                          解决办法：instanceof 判断
 *      多态的好处：拓展性强
 */
public class test1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method(dog);
        System.out.println("************");

        Cat cat = new Cat();
        method(cat);

        System.out.println("************");
        Animal animal = new Cat();
        animal.eat();

    }

    public static void method(Animal animal) {
        if (animal instanceof Dog) {// 判断 避免类型转换异常（ClassCastException）
            Dog dog = (Dog) animal;// 向下转换
            dog.eat();
            dog.lookdoor();
        } else {
            Cat cat = (Cat) animal;
            cat.eat();
            cat.catchMouse();
        }
    }
}
