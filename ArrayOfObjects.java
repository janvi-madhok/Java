class Employee{

    int empId;
    String name;
    double salary;

}

public class ArrayOfObjects{

    public static void main(String args[]){

        Employee e1 = new Employee();
        e1.empId = 234;
        e1.name = "Shaan";
        e1.salary = 345000;

        Employee e2 = new Employee();
        e2.empId = 346;
        e2.name = "Neha";
        e2.salary = 456430;

        Employee e3 = new Employee();
        e3.empId = 346;
        e3.name = "Arijit";
        e3.salary = 245000;

       
        Employee emp[] = new Employee[3]; 
        emp[0] = e1;
        emp[1] = e2;
        emp[2] = e3;

        for(int i=0;i<emp.length;i++){
            System.out.println(emp[i].empId+" - "+emp[i].name+" : "+emp[i].salary);
        }

        System.out.println("Enhanced for loop");

        for(Employee e : emp){
            System.out.println(e.name+" : "+e.salary);
        }

    }
}
