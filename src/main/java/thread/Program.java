package thread;
public class Program {
    public static void main(String[] args) {
        int x,y;
        String process;
        x=5;
        y=3;
        process="-";
        Runnable myClass=new ThreadBa(x,y,process);//yapıcı nesne ile degerlerimi ThreadBa icerisindeki degişkenlere atıyorum
        Thread thread = new Thread(myClass);
        thread.start();
    }
}
