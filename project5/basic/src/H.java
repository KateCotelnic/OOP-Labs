public class H extends G {
    protected String h;
    protected X xh;
//    public H(String a, String b, String c, String d, String e, String f, String g, String h) {
//        super(a, b, c, d, e, f, g);
//        this.h = h;
//    }

    public H(String a, X x, String b, String c, String d, String e, String f, String g, String h, X xh) {
        super(a, x, b, c, d, e, f, g);
        this.h = h;
        this.xh = xh;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(h);
        xh.print();
    }
}
