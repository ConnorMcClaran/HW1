/**
 * Created by mcclarci on 9/13/2016.
 *  Connor McClaran Code for 1.2.6
 */
public class CircularShiftTest {
    public static void main (String[] args){
        String s;
        String t;
        s= "actgacg";
        t = "tgacgac";
        if ((s.length() == t.length())&&((s+s).indexOf(t) != -1))
        {System.out.println("True");}

        else {System.out.println("False");}


    }

}
