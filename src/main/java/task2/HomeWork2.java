package task2;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("На вход дается массив и число. Вывести пару чисел, которые дают сумму - заданное число.");
        System.out.println();

        System.out.println(getSortNumber(Arrays.asList(3, 4, 2, 7), 10));



    }

        public static List<Integer> getSortNumber(List<Integer> miList, int sumNumber) {

        if (miList == null) {
            return new ArrayList<>();
        }
        Set<Integer> s = new HashSet<>();
        for (Integer in : miList) {
            int findNumber = sumNumber - in;
            if (s.contains(findNumber)) {
                return Arrays.asList(findNumber, in);
            }
            s.add(in);
        }
        return new ArrayList<>();
    }
}

    /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */


