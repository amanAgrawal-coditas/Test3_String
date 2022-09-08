package Test3_8thSeptember;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Test {
    void display() throws IOException {
        String name="I love coding";
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of elements");
        int n=Integer.parseInt(sc.readLine());
        String[] array = new String[n];
        System.out.println("Enter the Elements of the array");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.readLine();
        }
        System.out.println("the normal array is");
        for (String index : array)
        {
            System.out.println(index);
        }
        for (int index = 0; index < array.length - 1; index++)
        {
            for (int j =0; j < array.length-index-1; j++)
            {
                if (array[j].length() > array[j+1].length())
                {
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("the sorted array is");
                 for (int i = 0; i < array.length ; i++)
                 {
                     System.out.println(array[i]);
                 }
Arrays.sort(array);
        System.out.println("Lexiographical Array is ");
        for (int i = 0; i < array.length ; i++)
        {
            System.out.println(array[i]);
        }
char []ch=name.toCharArray();
        System.out.println("the reverse array is ");
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.println(ch[i]);
        }
    }
}

public class Test3 {
    public static void main(String[] args) throws IOException {
        Test test=new Test();
        test.display();
        String name="I love my india";
        StringTokenizer stringTokenizer=new StringTokenizer(name);
        while(stringTokenizer.hasMoreTokens())
        {
            System.out.println(stringTokenizer.nextToken()+"$");
        }

    }
}
