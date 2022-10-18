package KodlamaHomeWork.Dataaccess;

import KodlamaHomeWork.Entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    public void add(Category category){
        System.out.println("Hibernate ile veri tabanına eklendi");
    }

    @Override
    public void update(Category category) {

    }
}
