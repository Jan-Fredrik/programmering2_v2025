public class Construktor {
    public static void main(String[] args) {


        Student student1 = new Student("John", "Doe", 50, "654321");

        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getAge());
        System.out.println(student1.getStudentId());
    }
}
