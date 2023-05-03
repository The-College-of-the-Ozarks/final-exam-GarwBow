/*
Coordinator Class:
There are no issues with this class. 

Documentation:
This class sets the pay rate and job title for the coordinator. Depending if rate is either bigger or the same/smaller, the payrate will be either $20.00 or the same as rate. It return "coordinator" as the job title.
@param
@return

*/
public class Coordinator extends Employee
{
   public final static double PAY_RATE = 20.00;
   public void setPayRate(double rate)
   {
      if(rate > PAY_RATE)
        payRate = PAY_RATE;
      else
        payRate = rate;
   }
   public void setJobTitle()
   {
      jobTitle = "coordinator";
   }
}
