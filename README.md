# java-programs
1. Uploading program **Gandolf**
  - Gandalf used nothing but a simple letter substitution scheme, and further, that it is its own inverse the same operation scrambles the message as unscrambles it. 
    - This operation is performed by replacing vowels in the sequence 'a' 'i' 'y' 'e' 'o' 'u' with the vowel three advanced, cyclicly, while preserving case (i.e., lower or upper).
    - Similarly, consonants are replaced from the sequence 'b' 'k' 'x' 'z' 'n' 'h' 'd' 'c' 'w' 'g' 'p' 'v' 'j' 'q' 't' 's' 'r' 'l' 'm' 'f' by advancing ten letters. 
    
    
# Java Recursion Sample Questions
1. What will be the output of: perplexing(“Hello”);

    public static String perplexing(String s){
      if (s.length()==1){
          return s;
      }
      return perplexing(s.substring(1))+s.charAt(0);
    }
    - Steps: perplexing(“Hello”)->perplexing("ello”)+H -> olleH 
             - perplexing("ello”)-> perplexing("llo”)+e -> olle 
             - perplexing("llo”)-> perplexing("lo”)+l -> oll 
             - perplexing("lo”)-> perplexing("o”)+l -> ol 
             - perplexing("o”)-> o 
    - Output: olleH
           
 2. What will be the output of:   morePerplexing(“Hello”); 

    public static String morePerplexing(String s){ 
      if (s.length()==1){ 
        return s; 
      } 
      return morePerplexing(s.substring(1))+s; 
    } 
    - Steps: morePerplexing(“Hello”)->morePerplexing("ello”)+Hello -> ololloelloHello
             - morePerplexing("ello”)-> morePerplexing("llo”)+ello -> ololloello
             - morePerplexing("llo”)-> morePerplexing("lo”)+llo -> olollo 
             - morePerplexing("lo”)-> morePerplexing("o”)+lo -> olo 
             - morePerplexing("o”)-> o 
    - Output: ololloelloHello
    
  3. What will be the output of:   unknown(4, 2); 

    public static int unknown(int n, int r){ 
      if (n==0 || r<=0 || r>=n){ 
        return 1; 
      } 
      return unknown(n-1, r-1)+unknown(n-1,r); 
    } 
  - Steps: unknown(4, 2)->unknown(3, 1)+unknown(3,2)-> 3+3=6
             - unknown(3, 1)-> unknown(2, 0)+unknown(2,1) -> 1+2=3
             - unknown(2, 0)-> 1  
             - unknown(2, 1)-> unknown(1, 0)+unknown(1,1) ->  1+1=2
             - unknown(1, 0)-> 1
             - unknown(1, 1)-> 1
             - unknown(3, 2)-> unknown(2,1)+unknown(2,2)->2+1=3
             - unknown(2, 1)-> unknown(1, 0)+unknown(1,1)->1+1=2
             - unknown(1, 0)-> 1
             - unknown(1, 1)-> 1
             - unknown(2, 2)-> 1 
             
    - Output: 6    
    
    4. How many calls to unknown were made (including the original call?)
    - Output: 11
    
    5. Write a method that will take in a low and a high number and recursively sum the numbers between them (inclusive).
    
      public static int sumBetween(int low, int high){
          if (high < low){
              return 0;
          }
          return  high += sumBetween (low, --high );
      }
    
    6. Write a method that will take two Strings and will recursively remove all occurrences of the second from the first.
    
      public static String removeSecond(String first, String second){
          if (!first.contains(second)){
              return first;
          }

          return first.substring(0,first.indexOf(second))+removeSecond(first.substring(first.indexOf(second)+second.length()),second);
      }
