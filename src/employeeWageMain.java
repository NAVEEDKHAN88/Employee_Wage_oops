public class employeeWageMain {

    int WagePerHr = 20;
    final int isFullTime = 1;
    final int isPartTime = 2;
    int empHr;
    int EmpWage;

    public void attend() {
        int randomfn = (int) Math.floor(Math.random() * 10) % 3;
        switch (randomfn) {
            case isFullTime:
                empHr = 8;
                System.out.println("Employee works Fulltime");
                break;

            case isPartTime:
                empHr = 4;
                System.out.println("Employee works Parttime");
                break;

            default:
                empHr = 0;
                System.out.println("Employee is Absent");



        }
        EmpWage = empHr * WagePerHr;
        System.out.println(EmpWage);

    }
    public static void main(String[] args){

        employeeWageMain emp = new employeeWageMain();
        emp.attend();


    }
}

