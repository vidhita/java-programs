 
/**
 * Write a description of class recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion
{
    private static int count=0;
    // instance variables - replace the example below with your own
    private int x;

    static int mist (int n){
        if (n==1){
            return 3;
        }else{
            
            return 3* mist(n-1);
        }
    }
    
        public static String perplexing(String s){
      if (s.length()==1){
          return s;
      }
      return perplexing(s.substring(1))+s.charAt(0);
    }
    
    public static String morePerplexing(String s){ 
          if (s.length()==1){ 
            return s; 
          } 
          return morePerplexing(s.substring(1))+s; 
    } 
    
    public static int unknown(int n, int r){ 
               System.out.println("unknown("+n+","+r+")");
               count++;
      if (n==0 || r<=0 || r>=n){ 
        return 1; 
      } 
      return unknown(n-1, r-1)+unknown(n-1,r); 
    } 
   
    public static int sumBetween(int low, int high){
        
        if (high < low){
            return 0;
        }
        return  high += sumBetween (low, --high );
        
    }
    
    //Write a method that will take two Strings and will recursively remove all occurrences of the second from the first.
    public static String removeSecond(String first, String second){
        if (!first.contains(second)){
            return first;
        }
        
        return first.substring(0,first.indexOf(second))+removeSecond(first.substring(first.indexOf(second)+second.length()),second);
    }
    
    public static void main(String arg[]){
        System.out.println("mist(5):"+mist(5));
        System.out.println("perplexing(\"Hello\"):"+perplexing("Hello"));
        System.out.println("morePerplexing(\"Hello\"):"+morePerplexing("Hello"));
        System.out.println("unknown(4, 2):"+unknown(4, 2));
        
        System.out.println("count:"+count);
        System.out.println("sumBetween(3,6):"+sumBetween(3,6));
        System.out.println ("removeSecond(\"HiHelloHowareyou?HiHellohowdoyoudo?\",\"do\")"+removeSecond("HiHelloHowareyou?HiHellohowdoyoudo?","do"));
    }
}
