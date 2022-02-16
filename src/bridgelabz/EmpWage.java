package bridgelabz;

public class EmpWage {

      public static void main(String[] args) {
      int isFullTime = 1;
      int EmpRatePerHour = 20;
        int empHrs = 0;
	int totalWage = 0;
        double empcheck= Math.floor( Math.random() *10) % 2;
        if (empcheck == isFullTime)
            empHrs = 8;
        totalWage = empHrs * EmpRatePerHour;
        System.out.println("Emp WAge: " + totalWage);
    }
}
