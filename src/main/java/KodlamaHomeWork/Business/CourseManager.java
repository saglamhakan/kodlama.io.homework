package KodlamaHomeWork.Business;
import KodlamaHomeWork.Dataaccess.CourseDao;
import KodlamaHomeWork.Entities.Category;
import KodlamaHomeWork.Entities.Course;
import java.util.logging.LogRecord;
import java.util.List;
import java.util.logging.Logger;

public class CourseManager {
    CourseDao courseDao;
    Logger[] loggers;
    List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses){
        this.courseDao=courseDao;
        this.loggers=loggers;
        this.courses=courses;

    }
    public void add(Course course) throws Exception{
        for (Course course1: courses){
            if (course1.getCourseName() == course.getCourseName()){
                throw new Exception("Kurs ismi aynı olamaz");
            }
        }
        courseDao.add(course);
        courses.add(course);
        for (Logger logger:loggers){
            logger.log(course.getCourseName());

        }
    }
}
