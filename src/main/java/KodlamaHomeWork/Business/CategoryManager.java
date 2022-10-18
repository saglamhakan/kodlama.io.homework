package KodlamaHomeWork.Business;
import KodlamaHomeWork.Dataaccess.CategoryDao;
import KodlamaHomeWork.Dataaccess.CourseDao;
import KodlamaHomeWork.Dataaccess.EducatorDao;
import KodlamaHomeWork.Entities.Category;
import KodlamaHomeWork.Logger.Logger;

import java.util.List;

public class CategoryManager {
    CategoryDao categoryDao;
    Logger[] loggers;
    List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception{
        for (Category category1: categories){
            if (category.getCategoryName()==category1.getCategoryName()){
                throw new Exception("Kategori ismi tekrar edemez");
            }
        }
        categoryDao.add(category);
        categories.add(category);
        for (Logger logger:loggers){
            logger.log(category.getCategoryName());
        }
    }
}
