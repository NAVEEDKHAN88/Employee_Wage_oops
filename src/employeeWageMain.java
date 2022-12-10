public class employeeWageMain {
    int isPresent = 1;

    public void attend()
    {
        double randomfn = Math.floor(Math.random()*10)%2;
        if (randomfn == isPresent)
        {
            System.out.println("Employee is Present");
        }else
        {
            System.out.println("Employee is Absent");
        }
    }
    public static void main(String[] args) {

        employeeWageMain emp = new employeeWageMain();
        emp.attend();

    }
    }

