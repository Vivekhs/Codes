package tree;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hack5{

   public static void main(String args[])
    {
      List<String> Languages = Arrays.asList("Python","Java","python");
      Map<String, Integer> LanguagesLength = 
      Languages.stream().collect(Collectors.toMap(Function.identity(), String::length));

      System.out.println("list: " + Languages);

    }
}
