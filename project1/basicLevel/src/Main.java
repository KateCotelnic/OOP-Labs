public class Main {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();

        monitor1.color = "Black";
        monitor1.dimensions = 24;
        monitor1.resolutionLength = 1920;
        monitor1.resolutionWidth = 1080;

        monitor2.color = "Black";
        monitor2.dimensions = 22;
        monitor2.resolutionLength = 3840;
        monitor2.resolutionWidth = 2160;

        if(monitor1.color == monitor2.color)
            System.out.println("Monitors 1 n 2 r the same color "
                    + monitor1.color);
        else
            System.out.println("Monitors 1 is " + monitor1.color
                    + " but monitor 2 is " + monitor2.color);

        if(monitor1.dimensions == monitor2.dimensions)
            System.out.println("Monitors have the same dimension "
                    + monitor1.dimensions);
        else if (monitor1.dimensions > monitor2.dimensions)
            System.out.println("Monitor 1 (" + monitor1.dimensions
                    + " inches) is bigger, that monitor 2 ("
                    + monitor2.dimensions + " inches)");
        else
            System.out.println("Monitor 1 (" + monitor1.dimensions
                    + " inches) is smaller, that monitor 2 ("
                    + monitor2.dimensions + " inches)");

        if (monitor1.resolutionWidth * monitor1.resolutionLength ==
                monitor2.resolutionLength * monitor2.resolutionWidth)
            System.out.println("Monitor 1 n 2 r the same resolution"
                    + monitor1.resolutionLength + "on" + monitor1.resolutionWidth);
        else if (monitor1.resolutionWidth * monitor1.resolutionLength >
                monitor2.resolutionLength * monitor2.resolutionWidth)
            System.out.println("Monitor 1 (" + monitor1.resolutionLength +
                    " on " + monitor1.resolutionWidth + ") has the better resolution, " +
                    "than monitor 2 (" + monitor1.resolutionLength +
                    " on " + monitor1.resolutionWidth + ")");
        else
            System.out.println("Monitor 1 (" + monitor1.resolutionLength +
                    " on " + monitor1.resolutionWidth + ") has the worse resolution, " +
                    "than monitor 2 (" + monitor1.resolutionLength +
                    " on " + monitor1.resolutionWidth + ")");
    }
}
