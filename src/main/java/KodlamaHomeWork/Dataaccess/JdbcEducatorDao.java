package KodlamaHomeWork.Dataaccess;

import KodlamaHomeWork.Entities.Educator;

public class JdbcEducatorDao implements EducatorDao {
    public void add(Educator educator){
        System.out.println("Jdbc ile veritabanına eklendi");
    }
}



