package innerclass.task07;

/**
 * Задача №7, Глава 10, Внутрениие классы, стр. 295
 *
 * Создайте класс, содержащий закрытое поле и закрытый метод.
 * Создайте внутренний класс с методом, который изменяетполе внешнего класса
 * и вызывает метод внешнего класса. Во втором методе внешнего класса создайте
 * объект внутреннего класса и вызовите его метод; продемонстрируйте эффект
 * на объекте внешненго класса.
 */

public class Outer {
    private int i = 11;
    private int value(){return i;}
    public class Inner{
        public void setValue(int value){
            Outer.this.i = value;
            System.out.println(Outer.this.value());
        }
    }
    public void innerValue(){
        Inner inner = new Inner();
        inner.setValue(12);
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.innerValue();
    }
}
