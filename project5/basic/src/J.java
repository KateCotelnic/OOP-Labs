public class J extends I {
    protected String j;

//    public J(String b, String c, String d, String e, String f, String g, String h, String i, String j) {
//        super("blabla", b, c, d, e, f, g, h, i);
//        this.j = j;
//    }

    public J(X x, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
        super("blabla", x, b, c, d, e, f, g, h, new X("xh"), i);
        this.j = j;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(j);
    }
}
