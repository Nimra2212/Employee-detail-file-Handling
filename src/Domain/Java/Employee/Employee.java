package Employee;

public class Employee {
    public String name;
    public String cnic;
    public Dasignation designation;
    public Employee(String name,String cnic){
      this.name=name;
      this.cnic=cnic;
    }
    public void setName(String name){
        this.name=name;

        }
        public String getName(String s){
        return name;
        }
    public void setCnic(String cnic){
        this.cnic=cnic;
    }
    public String getCnic(String c){
        return cnic;
    }

}
