package pages;

public class palin {

    public static void main(String[] args) {
        //String str = "level";
        System.out.println(palin("Level"));
    }

    public static boolean palin(String str){
        int i=0;
        int j= str.length()-1;
        while (i<j){
            if(str.charAt(i)!= str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
