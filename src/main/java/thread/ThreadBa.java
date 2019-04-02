package thread;
public class ThreadBa implements Runnable {
    Operations operations=new OperantsImpl();//işlemleri yapabilmek icin tanımladım
    private int x,y;
    private String process;

    public ThreadBa(int x,int y,String process){//yapıcı nesne threadtan önce çalışacağı icin oluşturdum
       this.x=x;
       this.y=y;
       this.process=process;
    }

    public void run()
    {
        System.out.println(x+process+y);
        if(process=="+") {
            int total=operations.sum(x,y);
            System.out.println("Sonuc :"+total);
        }
        if(process=="-") {
            System.out.println("Sonuc :"+operations.sub(x,y));
        }
        if(process=="*") {
            System.out.println("Sonuc :"+operations.multiplication(x,y));
        }
        if(process=="/") {
            System.out.println("Sonuc :"+operations.division(x,y));
        }
    }
}

