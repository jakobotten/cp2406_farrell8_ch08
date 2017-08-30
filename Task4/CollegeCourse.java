public class CollegeCourse {
    private String courseID;
    private int creditHours;
    private char grade;

    CollegeCourse(String courseID, int creditHours, char grade) {
        this.courseID = courseID;
        this.creditHours = creditHours;
        this.grade = grade;
    }

    CollegeCourse(String courseID, char grade){
        this.courseID = courseID;
        this.grade = grade;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public char getGrade() {
        return grade;
    }
}
