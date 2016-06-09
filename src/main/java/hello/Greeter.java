package hello;

public class Greeter {
  public String sayHello() {
    return "Hello world!";
  }

  public static int max(int a, int b, int c){
       if(a > b){
           if(a > c){
               return a;
           }else{
               return c;
           }
        }else{
           if(b > c){
               return b;
           }else{
               return c;
           }
        }
   }
}
