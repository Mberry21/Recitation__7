/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */
import java.lang.Math;
public class Recitation7
{
    // define your constants after this comment

    private static String generateStar(char aChar,int num){
        String str = "";
        for(int count = 0; count < num;count ++){
            str += aChar;
        }
             return str;
    }

    public static String leftRightTriangle(int height)
    {
        String str = "";
        for(int row = 1; row <= height; row ++){
            str += generateStar( '*',row)+"\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        //add your code here
        for(int row =1; row <= height; row++){
            str += generateStar(' ',height - row) + generateStar('*', row)+"\n";
        }
        return str;
    }

    public static String circle(int radius)
    {
        String str = "";
        //add your code here
        for (int y = radius-1; y >= -radius+1; y--){
            int x = (int)(Math.sqrt((radius*radius) - (y*y)));
            str += generateStar(' ', radius-x) + generateStar('*', 2*x) + "\n";
        }
        return str;
    }
}
