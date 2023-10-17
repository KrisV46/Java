public class Student extends Person implements Printable{
    public int grade;

    public Student(int age, String name, int grade){
        super(age,name);
        this.grade = grade;
    }
    //public void sayHello2(){
       // System.out.println("I am " + this.name + " and I am " + this.age + " years old and my grade is: " + this.grade);
    //}
    @Override
    public void printDetails() {
        System.out.println("Print details: ");
        System.out.println("I am " + this.name + " and I am " + this.age + " years old and my grade is: " + this.grade);
    }
}
