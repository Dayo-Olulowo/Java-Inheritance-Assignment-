public class Main {
    public static void main(String[] args) {


        COMPUTERSCIENCE details = new COMPUTERSCIENCE();  // Parent Class object
        Student_1 student1 = new Student_1();// Child Class object
        Student_2 student2  = new Student_2();


        details.student_details();

        student1.student1_info();

        System.out.println();


        student2.student2_info();
    }
}
