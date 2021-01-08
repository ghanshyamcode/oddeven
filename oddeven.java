public class oddeven{
  public static void main(String val[]){
    for (int i=0; i<val.length; i++){
      if((Integer.parseInt(val[i])%2==0))
       {System.out.println(val[i]+ " is even number");}
      else
      System.out.println(val[i]+ " is odd number");
    }
  }
}