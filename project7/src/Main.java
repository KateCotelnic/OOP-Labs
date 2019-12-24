public class Main {
    public static void main(String[] args) {
        GeometricBody[] geometricBodies = new GeometricBody[3];
        geometricBodies[0] = new Cub(3);
        geometricBodies[1] = new Sphere(2);
        geometricBodies[2] = new Parallelepiped(2,3,4);
        for(int i = 0; i<geometricBodies.length;i++){
            System.out.println("Aria of " + geometricBodies[i].getClass().getName() + " = " + geometricBodies[i].getSurface());
            System.out.println("Volume of " + geometricBodies[i].getClass().getName() + " = " + geometricBodies[i].getVolume());
        }
        GeometricBody maxV = GeometricBodyController.getBodyOfMaxVolume(geometricBodies);
        System.out.println("Body with the max volume is " + maxV.getClass().getName() + " (" + maxV.getVolume() + ")");
        Object maxS = GeometricBodyController.getBodyOfMaxSurface(geometricBodies);
        System.out.println("Body with the max surface is " + maxS.getClass().getName() + " (" + maxV.getSurface() + ")");

    }
}
