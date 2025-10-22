package Week06.Lesson;

/**
 * Name: Singleton
 * Date: 08 January 2025
 * Author: Sreng
 * Modified: 08 January 2025
 * Description: A class that demonstrates the Singleton design pattern.
 * Functions:
 *     - getInstance(): Singleton
 * Variables:
 *    - instance: Singleton
 * */
public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }
}
