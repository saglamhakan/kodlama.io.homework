package KodlamaHomeWork.Dataaccess;

import KodlamaHomeWork.Entities.Educator;

public class HibernateEducatorDao implements EducatorDao{
    public void add(Educator educator){
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
