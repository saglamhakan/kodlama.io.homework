package KodlamaHomeWork.Logger;

public class FileLogger implements Logger{
    public void log(String data){
        System.out.println("Dosya loglandı: " +data);
    }
}
