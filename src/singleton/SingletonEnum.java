package singleton;

public enum SingletonEnum {
    INSTANCE;

    private SingletonEnum(){}

    public static SingletonEnum getInstance(){
        return INSTANCE;
    }

}
