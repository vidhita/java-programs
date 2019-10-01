
/**
 * Write a code to translate Gandalf’s manuscripts into plain text.
 *
 * @author Vidhita Deshmukh
 * @version 1-Oct-2019
 */
public class Gandolf
{
    // instance variables 
   
    static final String VOWEL="aiyeou";
    static final String CONSONANT="bkxznhdcwgpvjqtsrlmf";
    
    /**
     * Main Method 
     *
     * @param  args  takes up file name
     * @return       "One ring to rule them all."
     */
    public static void main(String[] args)
    {
        String input="Ita dotf ni dyca nsaw ecc.";
        String output = converter(input);
        System.out.println(input+"="+output);
    
        
    }
    
    static String converter(String input){
        String output = "";
        int vIndex, cIndex, replaceIndex;
        for (char ch:input.toCharArray()){
            char lch = Character.toLowerCase(ch);
            vIndex = VOWEL.indexOf(lch);
            cIndex = CONSONANT.indexOf(Character.toLowerCase(lch));
            char outch = ch;
            if (vIndex != -1){
                 replaceIndex = (vIndex + 3)%(VOWEL.length());
                 //System.out.println(replaceIndex + ":"+"Vowel-"+lch+"="+VOWEL.charAt(replaceIndex));
                 outch = VOWEL.charAt(replaceIndex);
            }else if (cIndex != -1){
                replaceIndex = (cIndex + 10)%(CONSONANT.length());
                //System.out.println(replaceIndex + ":"+"consonant-"+lch+"="+CONSONANT.charAt(replaceIndex));
                outch = CONSONANT.charAt(replaceIndex);
            }
            if (Character.isUpperCase(ch)){
                outch = Character.toUpperCase(outch);
            }
            output += outch;
        }
        return output;
    }
}
