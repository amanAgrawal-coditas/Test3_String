package Test3_8thSeptember;
import java.util.*;
class Test
 {
    Scanner sc=new Scanner(System.in);
    boolean loop=true;
    void display (String[] array)
    {
        while(loop==true)
        {
            System.out.println("enter 1 for sort");
            System.out.println("enter 2 for normal sort");
            System.out.println("enter 3 to append your string");
            System.out.println("enter 4 to Reverse your String");
            int cases=sc.nextInt();
            switch(cases)
            {
                case 1:
                {
                    System.out.println("the normal array is");
                    for (String index : array)
                    {
                        System.out.println(index);
                    }
                    for (int index = 0; index < array.length - 1; index++)
                    {
                        for (int j = 0; j < array.length - index - 1; j++)
                        {
                            if (array[j].length() > array[j + 1].length())
                            {
                                String temp = array[j];
                                array[j] = array[j + 1];
                                array[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("the sorted array is");
                    for (int i = 0; i < array.length; i++)
                    {
                        System.out.println(array[i]);
                    }
                    break;
                }
                case 2:
                {
                    Arrays.sort(array);
                    System.out.println("Lexicographical Array is ");
                    for (int i = 0; i < array.length; i++)
                    {
                        System.out.println(array[i]);
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("enter the new String");
                    String name="I love coding";
                    StringTokenizer stringTokenizer=new StringTokenizer(name);
                    while(stringTokenizer.hasMoreTokens())
                    {
                        System.out.println(stringTokenizer.nextToken()+"$");
                    }
                 break;
                }
                case 4:
                {
                    String str=Arrays.toString(array);
                    char[] ch = str.toCharArray();
                    System.out.println("the reverse array is ");
                    for (int i = ch.length - 1; i >= 0; i--)
                    {
                        System.out.println(ch[i]);
                    }
                        break;
                }
                    default:System.exit(0);
            }
        }

    }
 }

public class Test3
 {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        String[] array = new String[n];
        System.out.println("Enter the Elements of the array");
        for (int i = 0; i <array.length; i++)
        {
            array[i] = sc.next();
        }
        Test test=new Test();
        test.display(array);

    }
 }
