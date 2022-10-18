package KodlamaHomeWork.Entities;

public class Educator {
    String educatorFirstName;
    String educatorLastName;

    public Educator(){

    }
    public Educator(String educatorFirstName, String educatorLastName){
        this.educatorFirstName=educatorFirstName;
        this.educatorLastName=educatorLastName;

    }

    public String getEducatorFirstName(){
        return educatorFirstName;

    }
    public void setEducatorFirstName(){
        this.educatorFirstName=educatorFirstName;

    }
    public String getEducatorLastName(){
        return educatorLastName;

    }
    public void setEducatorLastName(){
        this.educatorLastName=educatorLastName;
    }
}
