public class employeeWageMain {

    int WagePerHr = 20;
    int isFullTime = 1;
    int empHr;
    int EmpWage;

    public void attend()
    {
        double randomfn = Math.floor(Math.random()*10)%2;
        if (randomfn == isFullTime)
        {
            empHr = 8;
            System.out.println("Employee Works Fullday");
        }else
        {
            empHr=0;
            System.out.println("Employee is Absent");
        }
    }

    public void calcWage()
    {
         EmpWage= empHr * WagePerHr;
        System.out.println(EmpWage);
    }
    public static void main(String[] args) {

        employeeWageMain emp = new employeeWageMain();
        emp.attend();
        emp.calcWage();

    }
    }

