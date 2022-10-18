package KodlamaHomeWork.Logger;

public class MailLogger implements Logger{
    public void log(String data){
        System.out.println("Dosya loglandı:" + data);
    }
}
