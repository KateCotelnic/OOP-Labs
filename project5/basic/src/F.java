public class F extends E {
    protected String f;
//
//    public F(String a, String b, String c, String d, String e, String f) {
//        super(a, b, c, d, e);
//        this.f = f;
//    }

    public F(String a, X x, String b, String c, String d, String e, String f) {
        super(a, x, b, c, d, e);
        this.f = f;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(f);
    }
}
