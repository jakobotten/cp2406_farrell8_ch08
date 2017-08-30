import java.net.IDN;

public class Student {
    private int IDNum;
    CollegeCourse[] collegeCourses = new CollegeCourse[5];

    Student(int IDNum) {
        this.IDNum = IDNum;
    }

    public int getIDNum() {
        return IDNum;
    }

    public void setIDNum(int IDNum) {
        this.IDNum = IDNum;
    }

    public CollegeCourse getCollegeCourse(int courseNum) {
        return collegeCourses[courseNum];
    }

    public void setCollegeCourse(CollegeCourse collegeCourse, int courseNum){
        collegeCourses[courseNum] = collegeCourse;
    }

}
