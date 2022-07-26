package Singleton;



public final class Singleton {

    private static Singleton instance;
    private int pass;

    private Singleton(int pass) {
        this.pass = pass;
    }

    public static Singleton getInstance(int pass) {
         if (instance == null) {
            instance = new Singleton(pass);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "pass=" + pass +
                '}';
    }
}