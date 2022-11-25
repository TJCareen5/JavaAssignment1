/**
 * JAVA DOC
 * Employee class
 * This class has firstName, lastName, monthlySalary.
 * This class will also use the monthly salary from the test and calculates the yearly salary
 * After the yearly salary is calculated this will apply the 10% raise
 * and print out the new monthly and yearly salaries
 *
 * @author student #20172422
 */
public class Employee{
    private String firstName; /** instance variable that stores the first name */
    private String lastName; /** instance variable that stores the last name */
    private double monthlySalary; /** instance variable for Monthly Salary */

    /**
     * constructor
     * @param fname
     * @param lname'
     * @param msalary'
     */
    public Employee(String fname, String lname, double msalary)
    {
        firstName = fname; /** initialize firstName */
        lastName = lname; /** initialize lastName */
        monthlySalary = msalary; /** initialize monthlySalary */

        /** if the monthly salary is not positive, set it to 0.0 */
        if (msalary < 0.0)
            monthlySalary = 0.0;
    }

    /**
     * method to set the first name
     * @param fname'
     */
    public void setFirstName(String fname)
    {
        firstName = fname;	/** store the first name */
    }

    /**
     * method to get first name
     * @return firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * method to set the last name
     * @param lname'
     */
    public void setLastName(String lname)
    {
        lastName = lname;	/** store the last name */
    }

    /**
     * method to get last name
     * @return lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * method to set the monthly salary
     * @param msalary'
     */
    public void setMonthlySalary(double msalary)
    {
        monthlySalary = msalary;	/** store the monthly salary */
    }

    /**
     * method to get monthly salary
     * @return monthlySalary
     */
    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    /**
     * method to get yearly salary
     * @return yearlySalary
     * <pre> @code monthlySalary * 12 </pre>
     */
    public double getYearlySalary()
    {
        double yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }

    /**
     * method to get yearly salary after giving 10% raise
     * @return raiseSalary
     * <pre> @code (monthlySalary + (monthlySalary * 0.1)) * 12 </pre>
     */
    public double getRaiseSalary() {
        double raise =  monthlySalary * 0.1 ;
        double raiseSalary = (monthlySalary + raise) * 12;
        return raiseSalary;
    }
}
