package org.andestech.learning.rfb19.g4;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.*;


import java.nio.file.Files;


@RunWith(Parameterized.class)
public class ParameterSummaTest {

    private int a,b,expectedS;

    private static int summa(int a, int b)
    {
        return a+b;
    }

    public ParameterSummaTest(int a, int b, int expectedS)
    {
        this.a = a;
        this.b = b;
        this.expectedS = expectedS;
    }

    //@Parameterized.Parameters
    public static Collection<Object[]> getData(){
        return Arrays.asList(
                new Object[][]{{1,2,3}, {2, -10, -8},
                        {2,5,8}, {3,2,5}}
        );
    }

   // @Parameterized.Parameters
    public static Collection<Object[]> getData2(){
        ArrayList<Object[]> arrayList =
        new ArrayList<>(10);

        arrayList.add(new Object[]{1,2,3});
        arrayList.add(new Object[]{2, -10, -8});
        arrayList.add(new Object[]{2,5,8});
        arrayList.add(new Object[]{3,2,5});
        arrayList.add(new Object[]{-3,-32,-35});

        return arrayList;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData3(){
        ArrayList<Object[]> arrayList =
                new ArrayList<>(10);

        File f = new File("src/test/resources/data1.txt");
        try(Scanner scanner = new Scanner(f))
        {
            scanner.useDelimiter("\n\r");
            while(scanner.hasNext())
            {
                String line = scanner.nextLine();

                if(line.startsWith("#") || line.isEmpty() || line.startsWith(" "))
                {  continue;}
                Object[] arr = new Object[3];
                int a,b,s;
                //System.out.println(line);
                String[] rawData = line.split(",|;");
                a = Integer.parseInt(rawData[0].trim());
                b = Integer.parseInt(rawData[1].trim());
                s = Integer.parseInt(rawData[2].trim());

                arr[0] = a; arr[1] = b; arr[2] = s;
                arrayList.add(arr);

            }

        }
        catch (IOException ex){
            ex.printStackTrace();
        }

        return arrayList;

    }

    //@Parameterized.Parameters  //Доделать дома!!
    public static Collection<Object[]> getData4(){
        ArrayList<Object[]> arrayList =
                new ArrayList<>(10);

      //  File f = new File("src/test/resources/data1.txt");

        try {
            List<String> rawList = Files.readAllLines(Paths.get("src/test/resources/data1.txt"), Charset.defaultCharset());
            System.out.println(rawList);
        }
        catch (IOException ex){ex.printStackTrace();}

        return arrayList;

    }

    @Test
    @Ignore
    public void summaTest(){
       int a =1, b=2, expectedSumma=3;
        Assert.assertEquals(expectedSumma, summa(a,b));

    }



    @Test
     public void summaParTest(){
      //  int a =1, b=2, expectedSumma=3;
        System.out.printf("test data: %d, %d, %d\n",a,b,expectedS);
        Assert.assertEquals(expectedS, summa(a,b));

    }


}
