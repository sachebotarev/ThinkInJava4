package innerclass.task06.classpackage;

import innerclass.task06.interfacepackage.SimpleInterface;

/**
 * Задача №6, Глава 10, Внутрениие классы, стр. 295
 * Создайте класс в другом пакете. Добавьте защищенный внутрениий класс, реализующий интерфейс.
 */

public class SimpleClass {
    private class Inner implements SimpleInterface{
        @Override
        public void simpleMethod() {
            System.out.println("Hi Inner class");
        }

    }
    public SimpleInterface simpleInterface(){
        return new Inner();
    }
}
