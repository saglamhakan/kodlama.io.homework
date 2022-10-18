package KodlamaHomeWork.Business;
import KodlamaHomeWork.Dataaccess.EducatorDao;
import KodlamaHomeWork.Entities.Educator;
import KodlamaHomeWork.Logger.Logger;

import java.util.List;

public class EducatorManager {
    EducatorDao educatorDao;
    Logger[] loggers;

    public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
        this.educatorDao = educatorDao;
        this.loggers = loggers;
    }

    public void add(Educator educator){
        educatorDao.add(educator);
        for (Logger logger:loggers){
            logger.log(educator.getEducatorFirstName());
            logger.log(educator.getEducatorLastName());
        }
    }
}

