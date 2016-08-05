/**
 * Auto Generated Java Class.
 */
public class Fraction{

  int numerator;
  int denominator;
  
  public Fraction(int tempnumerator, int tempdenominator){
    
    numerator = tempnumerator;
    denominator = tempdenominator;
    
    
  }
  public int gcd(int nom, int dem){
    
    if(Math.min(nom,dem) == 1) {
      return(1);
    }
    
    for(int factor = 2; factor <= Math.min(nom, dem); factor = factor + 1) {
      if(nom % factor == 0 && dem % factor == 0) {
        //System.out.println(factor);
        return(factor*gcd((nom/factor), (dem/factor)));
      }
    }
    return(1);
  }
  
 /* public int gcd(int factor_factor){
    
    if(factor_factor == 2) {
      return(1);
    }
    else {
      for(int factor = 2; factor < factor_factor; factor = factor + 1) {
        if(factor_factor % factor == 0) {
          return(factor+gcd(factor));
        }
      }
      return(1);
    }
  }
  */
  
  
  

 public int getNumberator(){
 
 return(numerator);
 }
 public int getDenominator(){ 
 return(denominator);
 
 }
 public boolean isImpropor(){ 
 if(numerator > denominator) {
 return(true);
 }
 else {
 return(false);
 }
 
 }
 public float toFloat(){ 
 return(0);
 }
 public String toString(){ 
  return("I am a Fraction");
 }
 public Fraction plus(Fraction other){ 
 return(null);
 }
public Fraction times(Fraction other){ 
return(null);
}
 
  }
  
