/**
 * Auto Generated Java Class.
 */
import java.util.Iterator;

public class FractionIterator { 
  
  int x = 1;
  int y = 1;
  int returnx;
  int returny;
  int diagnollinenumber = 1;
  int counter = 0;
  
  
  public FractionIterator(){ 
    
  }
  public boolean hasNext(){ 
    return false;
  }
  public String next(){
  
      returnx = x;
      returny = y;
      Fraction fractiongcf;
      fractiongcf = new Fraction(30,90);
      
      while(counter != diagnollinenumber) {
        
        if(counter == 0) {
          x = diagnollinenumber;
          y = 1;
          counter = counter + 1;
          
          if(counter == diagnollinenumber) {
            counter = 0;
            diagnollinenumber = diagnollinenumber + 1;
          }
          if (fractiongcf.gcd(x,y) == 1){
          return(x + "/" + y);
          }
          else {
            return(next());
        }
        }else {
          
          x = x - 1;
          y = y + 1;
          counter = counter + 1;
          
           if(counter == diagnollinenumber) {
            counter = 0;
            diagnollinenumber = diagnollinenumber + 1;
          }
           if (fractiongcf.gcd(x,y) == 1){
          return(x + "/" + y);
          }
          else {
            return(next());
        }
        }
      }
          return("an error has occured");
      
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int tempdem = 2;
         int tempnum = 1;
         
         int returntempdem = tempdem;
         int returntempnum = tempnum;
         Fraction fractiongcf;
         fractiongcf = new Fraction(30,90);
         
         if (fractiongcf.gcd(tempdem, tempnum) == 1) {
         returntempdem = tempdem;
         returntempnum = tempnum;
         
         if(tempdem - tempnum == 1) {
         tempdem = tempdem + 1;
         tempnum = 1;
         } else {
         tempnum = tempnum + 1;
         }
         
         
         return(returntempnum + "/" + returntempdem);
         } else {
         if(tempdem - tempnum == 1) {
         tempdem = tempdem + 1;
         tempnum = 1;
         } else {
         tempnum = tempnum + 1;
         }
         return(next());
         */
         
         }
         }
