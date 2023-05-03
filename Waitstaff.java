/*
Waitstaff Class:
An intern developer accidentaly deleted the implementation of the 
setPayRate method of this class. This class will also need to be debugged. 

Documentation:
This class defines the Payrate and jobtitle and returns them. It returns $10.00 and "waitstaff".
@param
@return

*/
public class Waitstaff extends Employee
{
   public final static double PAY_RATE = 10.00;
   public void setPayRate(double rate)
   {
     payRate = 10.00;
   }
   public void setJobTitle()
   {
      jobTitle = "waitstaff";
   }
}
