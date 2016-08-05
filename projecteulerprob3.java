public class projecteulerprob3{
  public static void main(String[ ] args) {
    
    int answer = 0;
    int sqrt = 775146;
    long number = 600851475143L;
    
    for(long counter = 2; counter < sqrt; counter = counter + 1) {
      if (number % counter == 0) {
        //if (answer < counter) {
        //  answer = counter;
        //((number / counter) > answer
        //  }
        
        long cor_counter = number / counter;
        //System.out.println(cor_counter);
        
        
        
        double counter_sqrt = Math.sqrt(counter);
        boolean did_i_find_a_factor = false;
        for(int test_if_factor = 2; test_if_factor <= counter_sqrt; test_if_factor = test_if_factor + 1) {
          if(counter % test_if_factor == 0){
            did_i_find_a_factor = true;
            break;
          }
          
        }
        if (did_i_find_a_factor == false) {
          System.out.println(counter + "did I find factor false counter");       
        }
        
        double cor_counter_sqrt = Math.sqrt(cor_counter);
        boolean did_i_find_a_cor_factor = false;
        for(int test_if_cor_factor = 2; test_if_cor_factor <= cor_counter_sqrt; test_if_cor_factor = test_if_cor_factor + 1) {
          if(cor_counter % test_if_cor_factor == 0){
            did_i_find_a_cor_factor = true;
            break;
          }
          
          
        }
        if (did_i_find_a_cor_factor == false) {
          System.out.println(cor_counter + "did I find a factor false cor_counter");
          
          
        }
      }
    }
  }
}


