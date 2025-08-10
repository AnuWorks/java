package forge.patterns.Singleton;

public class Singleton {
    // 3. A private static Class variable
    private static Singleton instance;

    //1. A private constructor
    private Singleton(){
    }

    // 2. A Method to return single instance
    // synchronized for multi threading env
    public synchronized static Singleton getSingleton(){
        if( instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
