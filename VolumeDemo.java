// Interface Volume
interface Volume {
    double PI = 3.14159; // Member variable

    void readData(); // Method to read data
    void displayVolume(); // Method to display volume
}

// Class Sphere implementing Volume interface
class Sphere implements Volume {
    double radius;
    double volume;

    @Override
    public void readData() {
        // Read data for sphere (e.g., radius)
        // For example:
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter radius of sphere: ");
        // radius = scanner.nextDouble();
        radius = 5; // For demonstration purposes
    }

    @Override
    public void displayVolume() {
        volume = (4.0 / 3.0) * PI * Math.pow(radius, 3); // Volume of sphere formula
        System.out.println("Volume of Sphere: " + volume);
    }
}

// Class Cylinder implementing Volume interface
class Cylinder implements Volume {
    double radius;
    double height;
    double volume;

    @Override
    public void readData() {
        // Read data for cylinder (e.g., radius and height)
        // For example:
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter radius of cylinder: ");
        // radius = scanner.nextDouble();
        // System.out.print("Enter height of cylinder: ");
        // height = scanner.nextDouble();
        radius = 3; // For demonstration purposes
        height = 8; // For demonstration purposes
    }

    @Override
    public void displayVolume() {
        volume = PI * Math.pow(radius, 2) * height; // Volume of cylinder formula
        System.out.println("Volume of Cylinder: " + volume);
    }
}

public class VolumeDemo {
    public static void main(String[] args) {
        // Creating objects of Sphere and Cylinder
        Sphere sphere = new Sphere();
        Cylinder cylinder = new Cylinder();

        // Calling methods for Sphere
        sphere.readData();
        sphere.displayVolume();

        System.out.println(); // Separating output for clarity

        // Calling methods for Cylinder
        cylinder.readData();
        cylinder.displayVolume();
    }
}
