package KodlamaHomeWork.Entities;

import java.util.logging.LogRecord;

public class Course {
    String courseName;
    double coursePrice;

    public Course(){

    }
    public Course(String courseName, double coursePrice){
        this.courseName=courseName;
        this.coursePrice=coursePrice;
    }
    public LogRecord getCourseName(){
        return courseName;
    }

    public void setCourseName(){
        this.courseName=courseName;

    }
    public double getCoursePrice(){
        return coursePrice;

    }
    public void setCoursePrice(){
        this.coursePrice=coursePrice;
    }
}
