public class C extends B {
    protected String c;
//
//    public C(String a, String b, String c) {
//        super(a, b);
//        this.c = c;
//    }

    public C(String a, X x, String b, String c) {
        super(a, x, b);
        this.c = c;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(c);
    }
}
