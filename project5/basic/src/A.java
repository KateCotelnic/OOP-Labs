public class A {
    protected String a;
    private X x;

//    public A(String a) {
//        this.a = a;
//    }

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public void print(){
        System.out.println(a);
        x.print();
    }
}