public class factorial {
    public static void main(String args[]){
        int fact=1;
        for(int i=1; i<=Integer.parseInt(args[0]); i++){
            
                fact=fact*i;
            }
            System.out.println(fact + " is factorial" + " of "+ args[0]);
    }
    }
    

