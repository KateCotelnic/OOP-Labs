public class Cub extends GeometricBody{
    private double edge;

    public Cub(double edge) {
        this.edge = edge;
    }

    @Override
    public double getSurface() {
        return 6*edge*edge;
    }

    @Override
    public double getVolume() {
        return edge*edge*edge;
    }
}
