public class mainfractions{
  public static void main(String[ ] args) {
    
    Fraction fraction1;
    FractionIterator fractioniterator1;
    fraction1 = new Fraction(16,32);
   fractioniterator1 = new FractionIterator();
    
    
    
      System.out.println(fraction1.gcd(16,32));
      
      for(int counter = 0; counter < 50; counter = counter +1) {
      System.out.println(fractioniterator1.next());
      }
    
  }
}