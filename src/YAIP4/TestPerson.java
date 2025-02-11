package YAIP4;

public class TestPerson {
    public static void main(String[] args) {
        // Test de la classe Person
        Person person = new Person("Alice", "123 Main St");
        System.out.println(person);

        // Test de la classe Student
        Student student = new Student("Bob", "456 College Rd", "Computer Science", 2, 1500.0);
        System.out.println(student);

        // Modifier certains attributs et les afficher à nouveau
        student.setProgram("Mathematics");
        student.setYear(3);
        student.setFee(1800.0);
        System.out.println(student);

        // Test de la classe Staff
        Staff staff = new Staff("Charlie", "789 School Ln", "High School", 3000.0);
        System.out.println(staff);

        // Modifier certains attributs et les afficher à nouveau
        staff.setSchool("University");
        staff.setPay(3500.0);
        System.out.println(staff);
    }
}
