public class IsStringIsRotation {

    public  static void main(String args[]){

        System.out.println(IsStringIsRotation.isRotation("waterbottle","bottlewater"));
        System.out.println(IsStringIsRotation.isRotation("waterbottle","erbottlewat"));
        System.out.println(IsStringIsRotation.isRotation("waterbottle","erbottlewat"));
    }

    static boolean isRotation(String s1, String s2){

        if(s2.length()==s1.length() && s1.length()> 0 ){
            String s1s1 = s1+s1;
            return s1s1.contains(s2);
        }
            return false;

    }
}
