package KodlamaHomeWork.Dataaccess;

import KodlamaHomeWork.Entities.Course;

public class JdbcCourseDao implements CourseDao{
    public void add(Course course){
        System.out.println("Jdbc ile veritabanına eklendi");
    }
}
