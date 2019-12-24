public class I extends H {
    protected String i;
//
//    public I(String a, String b, String c, String d, String e, String f, String g, String h, String i) {
//        super(a, b, c, d, e, f, g, h);
//        this.i = i;
//    }

    public I(String a, X x, String b, String c, String d, String e, String f, String g, String h, X xh, String i) {
        super(a, x, b, c, d, e, f, g, h, xh);
        this.i = i;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(i);
    }
}
