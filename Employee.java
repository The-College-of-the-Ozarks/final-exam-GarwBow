/*
Employee Class:
This class contains multiple typos and needs debugged. There are no logical issues with this class 
besides the aforementioned typos.

Documentation:
This class declares the data types for employeeNumber, lastName, etc. It then goes the sets the method with EmployeeNumber, LastName, etc and gets (or returns) PayRate and JobTitle.
@param
@return

*/
public abstract class Employee
{
   private String employeeNumber;
   private String lastName;
   private String firstName;
   protected double payRate;
   protected String jobTitle;
   public void setEmployeeNumber(String num)
   {
     employeeNumber = num;
   }
   public void setLastName(String name)
   {
      lastName = name;
   }
   public void setFirstName(String name)
   {
      firstName = name;
   }
   public String getEmployeeNumber()
   {
      return employeeNumber;
   }
   public String getName()
   {
      return firstName + " " + lastName;
   }
   public double getPayRate()
   {
      return payRate;
   }
   public String getJobTitle()
   {
      return jobTitle;
   }
   public abstract void setPayRate(double rate);
   public abstract void setJobTitle();
}
