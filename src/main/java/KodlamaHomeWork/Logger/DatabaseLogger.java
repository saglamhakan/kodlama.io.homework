package KodlamaHomeWork.Logger;

public class DatabaseLogger implements Logger{
    public void log(String data){
        System.out.println("Dosya loglandı:: " + data);
    }
}
