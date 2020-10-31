package recursion;

public class PrintStringInReverse {

    public static void main(String args[]){
        PrintStringInReverse.printStringReverse("abc");
    }

     static void printStringReverse(String s){
        PrintStringInReverse.helper(0, s.toCharArray());
    }

     static void helper(int index, char[] str){
      if(str == null || index>= str.length) return;
       helper(index+1,str);
       System.out.print(str[index]);

     }


}
