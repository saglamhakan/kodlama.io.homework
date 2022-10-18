package KodlamaHomeWork;
import KodlamaHomeWork.Business.CategoryManager;
import KodlamaHomeWork.Business.CourseManager;
import KodlamaHomeWork.Business.EducatorManager;
import KodlamaHomeWork.Dataaccess.HibernateCategoryDao;
import KodlamaHomeWork.Dataaccess.JdbcCategoryDao;
import KodlamaHomeWork.Dataaccess.JdbcCourseDao;
import KodlamaHomeWork.Dataaccess.JdbcEducatorDao;
import KodlamaHomeWork.Entities.Category;
import KodlamaHomeWork.Entities.Course;
import KodlamaHomeWork.Entities.Educator;
import KodlamaHomeWork.Logger.DatabaseLogger;
import KodlamaHomeWork.Logger.FileLogger;
import KodlamaHomeWork.Logger.Logger;
import KodlamaHomeWork.Logger.MailLogger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        Logger[] loggers={new DatabaseLogger(), new MailLogger(),new FileLogger()};

        Category category1=new Category(1,"Programlama");
        List<Category> categoryList=new ArrayList<Category>();
        CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),loggers,categoryList);
        categoryManager.add(category1);

        Course course=new Course("Java", 100);
        Course course1=new Course("C#",200);
        List<Course> courseList=new ArrayList<Course>();
        CourseManager courseManager=new CourseManager(new JdbcCourseDao(), (java.util.logging.Logger[]) loggers, courseList);
        courseManager.add(course);
        courseManager.add(course1);

        Educator educator1=new Educator("Hakan", "Sağlam");
        EducatorManager educatorManager=new EducatorManager(new JdbcEducatorDao(),loggers);
        educatorManager.add(educator1);


    }

}
