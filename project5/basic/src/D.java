public class D extends C {
    protected String d;
    protected X xd = new X ("xd");

//    public D(String a, String b, String c, String d) {
//        super(a, b, c);
//        this.d = d;
//    }

    public D(String a, X x, String b, String c, String d) {
        super(a, x, b, c);
        this.d = d;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(d);
    }
}
