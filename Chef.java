/*
Chef Class:
In order to better serve our customers, we are now offering
the availability of a private chef at each of our parties. 

This class has not yet been implemented, but is similar to our waitstaff and coordinator classes. 
The chef should be paid a minimum of $14.00 /hr and the job title will be chef. 

Documentation:
This class sets the pay rate and the job title for the chef. It returns $14.00 and "chef" respectivly to the Employee class.
@param
@return

*/

public class Chef extends Employee
{
  public final static double PAY_RATE = 14.00;
  public void setPayRate(double rate)
  {
    payRate = 14.00;
  }
  public void setJobTitle()
  {
    jobTitle = "chef";
  }
}
