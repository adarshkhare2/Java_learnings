package com.training.javaprograms;



import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.naming.directory.DirContext;



enum DIRACTION{    
    EAST(100), WEST ,NORTH(200),SOUTH;
    
    int value;
    DIRACTION()
    {
    	value=90;
    	System.out.println("Default cons.");
    }
    DIRACTION(int p )
    {
    	value=p;
    }
    
    public int getvalue()
    {
        return value;
    }
    
}



public class Demo_enum {



   private static final Object EAST = null;
private static final Object NORTH = null;

public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(DIRACTION.EAST);
        Set<DIRACTION> ss=EnumSet.of(DIRACTION.EAST,DIRACTION.SOUTH);
        
        for (DIRACTION x : ss) {
            System.out.println(x);
        }
        
        Map<DIRACTION,String> mm= new EnumMap<DIRACTION, String>(DIRACTION.class);
        mm.put(DIRACTION.EAST, "1");
        mm.put(DIRACTION.WEST, "2");
        mm.put(DIRACTION.NORTH, "3");
        mm.put(DIRACTION.SOUTH, "4");
        
           for(Map.Entry m:mm.entrySet()){   //Using m we are getting all entry set value in m. then we are useing for each to print key and value
               System.out.println(m.getKey()+" "+m.getValue());    
              }
           
        System.out.println( mm.containsKey("3"));
        System.out.println(mm.containsValue(EAST));
        System.out.println(mm.size());
        System.out.println(DIRACTION.NORTH.ordinal());//its position in its enum declaration, where the initial constant is assigned an ordinal of zero          
        System.out.println(mm.equals(ss));
        System.out.println(mm.get(NORTH));
}
    }