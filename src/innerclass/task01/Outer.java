package innerclass.task01;

public class Outer {
    public class Inner{
        public String toString(){
            return "Внутренний класс Inner";
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.inner();
        System.out.println(i.toString());
    }
}
