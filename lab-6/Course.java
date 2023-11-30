public class Course {
    private String courseName ;
    private String[] students = new String[100] ;
    private int numberOfStudents ;

    public Course(String coursName){
        this.courseName = coursName;
    }
    public void addStudent(String student){
        if (numberOfStudents == this.students.length) {
            String[] tmp = new String[this.students.length + 1];
            System.arraycopy(this.students, 0, tmp, 0, this.students.length);
            students = tmp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    
    }
    public String[] getStudents(){
        return students ; 
    }
    public int getNumberOfStudents(){
        return numberOfStudents ;
    }
    public String getCourseName(){
        return courseName ;
    }
    public int dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (this.students[i].equals(student)) {
                numberOfStudents--;
                if (i != numberOfStudents) {
                    students[i] = students[numberOfStudents];
                }
                this.students[numberOfStudents] = null;
                return 0;
            }
        }
        System.out.println("Error::Cannot found this student.");
        return 0;
    }

    public void clear() {
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }
}
