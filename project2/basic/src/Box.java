public class Box {
    private double height;
    private double width;
    private double depth;

    public Box() {
        this(1,1,1);
    }

    public Box(double height) {
        this(height,height,height);
    }

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double returnArea(){
        return (2*(height*width + width*depth + height*depth));
    }
    public double returnVolume (){
        return (height*width*depth);
    }
}
