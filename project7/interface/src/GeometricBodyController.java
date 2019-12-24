public class GeometricBodyController {
    public static GeometricBody getBodyOfMaxVolume(GeometricBody[] array){
        GeometricBody max = new GeometricBody() {
            @Override
            public double getSurface() {
                return 0;
            }

            @Override
            public double getVolume() {
                return 0;
            }
        };
        for(int i=0;i<array.length;i++){
            if(array[i].getVolume() > max.getVolume()){
                max = array[i];
            }
        }
        return max;
    }
    public static Object getBodyOfMaxSurface(GeometricBody[] array){
        GeometricBody max = new GeometricBody() {
            @Override
            public double getSurface() {
                return 0;
            }

            @Override
            public double getVolume() {
                return 0;
            }
        };
        for(int i=0;i<array.length;i++){
            if(array[i].getSurface() > max.getSurface()){
                max = array[i];
            }
        }
        return max;
    }
}
