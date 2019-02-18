package innerclass.task05;

/**
 * Задача №5, Глава 10, Внутрениие классы, стр. 293
 *
 * Создайте класс с внутренним классом.
 * В отдельном классе создайте экземпляр внутреннего класса.
 */

public class TestApp {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
