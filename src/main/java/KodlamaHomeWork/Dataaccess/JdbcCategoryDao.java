package KodlamaHomeWork.Dataaccess;

import KodlamaHomeWork.Entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    public void add(Category category){
        System.out.println("Jdbc ile veritabanına eklendi");
    }

    @Override
    public void update(Category category) {

    }
}
