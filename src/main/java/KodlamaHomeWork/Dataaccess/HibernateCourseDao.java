package KodlamaHomeWork.Dataaccess;

import KodlamaHomeWork.Entities.Course;

public class HibernateCourseDao implements CourseDao{
    public void add(Course course){
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
