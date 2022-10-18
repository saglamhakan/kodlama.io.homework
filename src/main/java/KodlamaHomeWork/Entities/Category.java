package KodlamaHomeWork.Entities;

public class Category {
    int id;
    String categoryName;

    public Category(){

    }
    public Category(int id, String categoryName){
        this.id=id;
        this.categoryName=categoryName;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;

    }
    public String getCategoryName(){
        return categoryName;

    }
    public void setCategoryName(){
        this.categoryName=categoryName;
    }

}
