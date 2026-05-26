package lab04;

// Superclass
class HillStations {

    void location() {
        System.out.println("Location is:");
    }

    void famousFor() {
        System.out.println("Famous for:");
    }
}

// Subclass Manali
class Manali extends HillStations {

    @Override
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for Hadimba Temple and adventure sports");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStations {

    @Override
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for educational institutions");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStations {

    @Override
    void location() {
        System.out.println("Gulmarg is in J&K");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for skiing");
    }
}

// Main class
public class TestHillStations {

    public static void main(String[] args) {

        HillStations h;

        h = new Manali();
        h.location();
        h.famousFor();

        h = new Mussoorie();
        h.location();
        h.famousFor();

        h = new Gulmarg();
        h.location();
        h.famousFor();
    }
}