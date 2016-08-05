public class projecteulerprob1{
  public static void main(String[ ] args) {
    
    int sum = 0;
    
    for (int counter = 1; counter < 1000; counter = counter + 1) {
      if (counter % 3 == 0) {
        sum = counter + sum;
      }
      else if (counter % 5 == 0) {
        sum = counter + sum;
      }
      
      
    }
    
    
    System.out.println(sum);
    
  }
  
}