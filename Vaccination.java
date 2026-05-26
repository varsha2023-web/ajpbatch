package lab04;

// Abstract class
abstract class Vaccine {

    int age;
    String nationality;

    // Constructor
    Vaccine(int age, String nationality) {

        this.age = age;
        this.nationality = nationality;
    }

    // First dose method
    void firstDose() {

        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {

            System.out.println("Your First dose Successfully Done.");
            System.out.println("Now you have to pay 250 Rs");

        } else {

            System.out.println("Not eligible for first dose.");
        }
    }

    // Second dose method
    void secondDose() {

        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {

            System.out.println("Your Second dose Successfully Done");

        } else {

            System.out.println("Not eligible for second dose.");
        }
    }

    // Abstract method
    abstract void boosterDose();
}

// Child class
class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {

        super(age, nationality);
    }

    @Override
    void boosterDose() {

        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {

            System.out.println("Your Booster dose Successfully Done");

        } else {

            System.out.println("Not eligible for booster dose.");
        }
    }
}

// Main class
public class Vaccination {

    public static void main(String[] args) {

        VaccinationSuccessful v =
                new VaccinationSuccessful(18, "Indian");

        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}