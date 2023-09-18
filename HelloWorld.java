public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
    if (a==5){
        System.out.println("SUCSESS");
    }else{
        System.out.println("FALIURE");
    }
    
    if (b==2){
        System.out.println("SUCSESS");
    } else {
        System.out.println("FALIURE");
        }
    
    if (c != 1) {
        System.out.println("SUCSESS");
    } else {
        System.out.println("FALIURE");
    }
    
    if (d==-8 && a==4) {
        System.out.println("SUCSESS");
    } else {
        System.out.println("FALIURE");
    }
    
    
    }


    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}


