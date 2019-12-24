public class B extends A {
    protected String b;

//    public B(String a,String b) {
//        super(a);
//        this.b = b;
//    }

    public B(String a, X x, String b) {
        super(a,x);
        this.b = b;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(b);
    }
}
