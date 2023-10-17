public class Person implements Printable {
    public int age;
    public String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    //public void sayHello(){
        //System.out.println("I am " + this.name + " and I am " + this.age + "years old");
    //}

    @Override
    public void printDetails() {
        System.out.println("Print details: ");
        System.out.println("I am " + this.name + " and I am " + this.age + "years old");
    }
}
