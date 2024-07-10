package programs;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Hashtable;

class Pr17 
    {
         public static void main(String args[])
        {  
           long start, end;   
            start = System.currentTimeMillis();
            for (int i = 0; i < 10000000; i++);
            end = System.currentTimeMillis();
            System.out.print(end - start);
        }
         }
    