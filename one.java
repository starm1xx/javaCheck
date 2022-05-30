/**
 * one
 */
public class one {
    String numbers ="0123456789";
    String special = "!@#$%^&* ( ) -{} [] :;";



    boolean isPasswordStrong (String p) { 
        boolean hasNumber = false;
        for (int i = 0; i < p.length(); i++) {
            for (int j = 0; j < numbers.length(); j++) 
                if (p.charAt(i)==numbers.charAt(j))
                hasNumber =true; 
        }

        boolean hasSpecial = false;
        for (int i = 0; i < p.length(); i++) {
            for (int j = 0; j < special.length(); j++) 
                if (p.charAt(i)==special.charAt(j))
                hasSpecial =true;
        }
        if (p.length()< 8) return false;
        return hasNumber && hasSpecial;
    }

    public static void main(String[] args) {

    }
}