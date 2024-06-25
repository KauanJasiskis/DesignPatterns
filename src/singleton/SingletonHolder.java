package singleton;

public class SingletonHolder {
    private static class InstanceHolder {
        public static SingletonHolder instance = new SingletonHolder();
    }

    private SingletonHolder() {
    }

    public static SingletonHolder getInstance() {
        return InstanceHolder.instance;
    }

}
