/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package smoothie;

public class App {
    public static void main(String[] args) {
      Smoothie sm = new Smoothie();
      sm.init("smoothie");
      Foo foo = (Foo)sm.get(Foo.class);
      foo.hello();
    }
}
