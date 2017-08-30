import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {

        final char[] AVAILABLE_GRADES = {'A', 'B', 'C', 'D', 'F'};

        Student[] students = new Student[10];
        CollegeCourse[] collegeCourses = new CollegeCourse[5];

        Scanner input = new Scanner(System.in);




        for(int i = 0; i < students.length; i++) {

            System.out.println("Enter ID for student " + (i+1) + ": ");
            int studentID = input.nextInt();

            for(int j = 0; j < collegeCourses.length; j++) {

                System.out.println("Enter course ID " + (j + 1) + ": ");
                String courseID = input.next();

                boolean isGrade = false;
                char courseGrade = ' ';

                while (!isGrade) {
                    System.out.println("Enter the grade for student " + (i+1) + " course " + (j+1) + ": ");
                    courseGrade = input.next().charAt(0);
                    for (int n = 0; n < AVAILABLE_GRADES.length; n++) {
                        if (courseGrade == AVAILABLE_GRADES[n])
                            isGrade = true;
                    }
                }

                collegeCourses[j] = new CollegeCourse(courseID, courseGrade);
            }
            students[i] = new Student(studentID);
        }

        for(int i = 0; i < students.length; i++){
            System.out.println("Student ID: " + students[i].getIDNum());
            for(int j = 0; j < collegeCourses.length; i++){
                System.out.println("    Course ID: " + collegeCourses[j].getCourseID()+ " Course Grade: " + collegeCourses[j].getGrade());
            }
        }

    }
}
