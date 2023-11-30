public class item_2 {
    public static void main(String[] args) {
        Course course = new Course("Math");
        course.addStudent("a");
        course.addStudent("b");
        course.addStudent("c");
        course.dropStudent("b");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println("Student" + (i + 1) + "is"  + course.getStudents()[i]);
        }
    }
}
