package bridgelabz;

public class EmpWage {

	public static void main(String[] args) {
		int iSFullTime = 1;
        double empcheck= Math.floor(Math.random() *10) % 2;
        if (empcheck == iSFullTime)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is Absent");

	}

}
