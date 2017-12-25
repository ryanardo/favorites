import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FavoriteColor {

    public static void main(String[] args) {
        System.out.println("What is your favorite color?");

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();

            System.out.println("Color entered : " + inputString);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
