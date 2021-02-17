// 10.12 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9. to include private instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s birthday. Add getmethods to class Date. Assume that payroll is processed once per month. Create an array of Employee variables to store references to the various employee objects. In a loop, calculate the payroll for each Employee(polymorphically), and add a $100.00 bonus to the person’s payroll amount if the current month is the one in which the Employee’s birthday occurs.

// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class Main
{
   public static void main(String[] args)
   {
     
      Date currentDate = new Date(11,3,2019);

      // create subclass objects
      SalariedEmployee salariedEmployee =
        new SalariedEmployee("John", "Smith", "111-11-1111", new Date(11,12,1983), 800.00);
      HourlyEmployee hourlyEmployee =
        new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(4,22,1988), 16.75, 40);
      CommissionEmployee commissionEmployee =
        new CommissionEmployee("Sue", "Jones", "333-33-3333", new Date(5,27,1964), 10000, .06);
      BasePlusCommissionEmployee basePlusCommissionEmployee =
        new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", new Date(12,25,1972), 5000, .04, 300);

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n",
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         basePlusCommissionEmployee,
         "earned", basePlusCommissionEmployee.earnings());

      // create four-element Employee array
      Employee[] employees = new Employee[4];

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee;
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      for (Employee currentEmployee : employees)
      {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee)
         {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee =
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         }
         
         // determine whether an employee receives a birthday bonus
         if(currentEmployee.getBirthDate().getMonth() == currentDate.getMonth()){
          System.out.printf("%s%nearned: $%,.2f which includes a $100 birthday bonus.%n%n",currentEmployee, currentEmployee.earnings() + 100);
         }          
         else{
          System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
         }
         
      }

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++)
         System.out.printf("Employee %d is a %s%n", j,
            employees[j].getClass().getName());
   } // end main
} // end class PayrollSystemTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
