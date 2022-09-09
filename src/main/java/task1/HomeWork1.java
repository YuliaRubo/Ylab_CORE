package task1;


import java.util.*;
import java.util.stream.Collectors;


    public class HomeWork1 {

        public static class Person {
            final int id;

            final String name;

            Person(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Person person)) return false;
                return getId() == person.getId() && getName().equals(person.getName());
            }

            @Override
            public int hashCode() {
                return Objects.hash(getId(), getName());
            }
        }

        private static Person[] RAW_DATA = new Person[]{
                new Person(0, "Harry"),
                new Person(0, "Harry"), // дубликат
                new Person(1, "Harry"), // тёзка
                new Person(2, "Harry"),
                new Person(3, "Emily"),
                new Person(4, "Jack"),
                new Person(4, "Jack"),
                new Person(5, "Amelia"),
                new Person(5, "Amelia"),
                new Person(6, "Amelia"),
                new Person(7, "Amelia"),
                new Person(8, "Amelia"),
        };


        public static void main(String[] args) {
            System.out.println("Raw data:");
            System.out.println();

            for (Person person : RAW_DATA) {
                System.out.println(person.id + " - " + person.name);
            }

            System.out.println();
            System.out.println("**************************************************");
            System.out.println();
            System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
            System.out.println();

           Integer in =  RAW_DATA.length;


            Map<String, Long> map = Arrays.stream(RAW_DATA)
                    .filter(Objects::nonNull)
                    .distinct()
                    .sorted(Comparator.comparing(o -> o.name))
                    .collect(Collectors.groupingBy(Person::getName,LinkedHashMap::new, Collectors.counting()));
            map.forEach((k,v)->System.out.println("Key: " + k +  "\n" + "Value:" + v));

            }
        /*
        Task1
            Убрать дубликаты, отсортировать по идентификатору, сгруппировать по имени

            Что должно получиться Key: Amelia
                Value:4
                Key: Emily
                Value:1
                Key: Harry
                Value:3
                Key: Jack
                Value:1
         */








        }



