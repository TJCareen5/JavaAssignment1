/**
 * JAVA DOC
 * Tester for Employee class
 * In this test we will be setting the standard salaries and then will
 * perform the raise of 10% and printing the new yearly salary
 *
 * @author student #20172422
 */
public class EmployeeTest
{
    /** main method to test Employee Class */
    public static void main(String[] args) {
        /** set Employee's names and Salaries */
        Employee employee1 = new Employee( "Peter", "Piper", 8500.00 );
        Employee employee2 = new Employee( "Paula", "Cooper", 5500.00 );
        /** display employee's yearly salary */
        System.out.printf( "Yearly salary of %s %s: %.2f\n", employee1.getFirstName(),
                employee1.getLastName(), employee1.getYearlySalary() );
        System.out.printf( "Yearly salary of %s %s: %.2f\n", employee2.getFirstName(),
                employee2.getLastName(), employee2.getYearlySalary() );
        System.out.println();

        /** display employee's salary after giving 10% raise */
        System.out.println( "10% raise given to each employee!" );
        System.out.printf( "Yearly salary of %s %s: %.2f\n", employee1.getFirstName(),
                employee1.getLastName(), employee1.getRaiseSalary() );
        System.out.printf( "Yearly salary of %s %s: %.2f\n", employee2.getFirstName(),
                employee2.getLastName(), employee2.getRaiseSalary() );
    }
}