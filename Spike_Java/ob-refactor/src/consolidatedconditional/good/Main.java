package consolidatedconditional.good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary() {
        double result = 0;

        if (!isEligibleExtraSalary()) {
            return result;
        }
        // Calculate extra salary:
        // ...
        return result;
    }

    public boolean isEligibleExtraSalary() {

        // se agrupan condiciones con AND y OR
        boolean educacion = seniority < 1 || education < 1;
        boolean antiguedad = incidents > 10 && !certification;

        return educacion || antiguedad;

}
}