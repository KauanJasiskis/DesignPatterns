package singleton.teste;

import singleton.SingletonEnum;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.getInstance();
        SingletonEnum instance2 = SingletonEnum.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}
