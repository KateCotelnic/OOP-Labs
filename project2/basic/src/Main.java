public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5.2);
        Box box3 = new Box(1.5, 2.5, 3.5);
        System.out.println("Box1:");
        System.out.println("height = " + box1.getHeight());
        System.out.println("depth = " + box1.getDepth());
        System.out.println("width = " + box1.getWidth());
        System.out.println("Box2:");
        System.out.println("height = " + box2.getHeight());
        System.out.println("depth = " + box2.getDepth());
        System.out.println("width = " + box2.getWidth());
        System.out.println("Box3:");
        System.out.println("height = " + box3.getHeight());
        System.out.println("depth = " + box3.getDepth());
        System.out.println("width = " + box3.getWidth());
        System.out.println("The area of the box3 = " +
                box3.returnArea());
        System.out.println("The volume of the box3 = " +
                box3.returnVolume());
    }
}
