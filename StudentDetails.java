public class StudentDetails{
    String name;
    double rn;
    double marks;

    public StudentDetails(String name, double rn, double marks) {
        this.name = name;
        this.rn = rn;
        this.marks = marks;
    }
    public void display() {
    System.out.println("Name:- " + name);
    System.out.println("Roll Number:- " + rn);
    System.out.println("Marks:- " + marks);
    }


public static void main(String[] args) {
StudentDetails s1 = new StudentDetails("Rahul", 151, 68);
StudentDetails s2 = new StudentDetails("Manoj", 123, 75);
s1.display();
s2.display();
}
}