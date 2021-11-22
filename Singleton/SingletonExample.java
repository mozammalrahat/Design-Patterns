public class SingletonExample{

    public static void main(String[] args) {
        
        // System.out.println("Eager Initialization");
        // SingletonEager instance1 = SingletonEager.getInstance();
        // System.out.println(instance1);
        // SingletonEager instance2 = SingletonEager.getInstance();
        // System.out.println(instance2);

        // System.out.println("Singleton");
        // Singleton instance1 = Singleton.getInstance();
        // System.out.println(instance1);
        // Singleton instance2 = Singleton.getInstance();
        // System.out.println(instance2);

        // System.out.println("SingletonSynchronizedMethod");
        // SingletonSynchronizedMethod instance1 = SingletonSynchronizedMethod.getInstance();
        // System.out.println(instance1);
        // SingletonSynchronizedMethod instance2 = SingletonSynchronizedMethod.getInstance();
        // System.out.println(instance2);

        System.out.println("SingletonSynchronized");
        SingletonSynchronized instance1 = SingletonSynchronized.getInstance();
        System.out.println(instance1);
        SingletonSynchronized instance2 = SingletonSynchronized.getInstance();
        System.out.println(instance2);

    }
}