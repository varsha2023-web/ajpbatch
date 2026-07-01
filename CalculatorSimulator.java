package lab06;

class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException,
                   EmployeeNameInvalidException,
                   TaxNotEligibleException {

        double taxAmount;

        if (!isIndian) {
            throw new CountryNotValidException(
                    "The employee should be an Indian citizen for calculating tax");
        }

        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException(
                    "The employee name cannot be empty");
        }

        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        }
        else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 6 / 100;
        }
        else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 5 / 100;
        }
        else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 4 / 100;
        }
        else {
            throw new TaxNotEligibleException(
                    "The employee does not need to pay tax");
        }

        return taxAmount;
    }
}

public class CalculatorSimulator {

    public static void main(String[] args) {

        TaxCalculator tc = new TaxCalculator();

        String empName = "Ron";
        double empSal = 34000;
        boolean isIndian = false;

        try {
            double taxAmount = tc.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + taxAmount);
        }

        catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        }

        catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        }

        catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}