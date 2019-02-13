package innerclass.task03;

public class Outer {
    private String s;

    public Outer(String s){
        this.s = s;
    }

    public class Inner{
        public String toString(){
            return s;
        }
    }
    private Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer("Привет");
        Inner i = o.inner();
        System.out.println(i.toString());
    }
}
