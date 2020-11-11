package collections.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String args[]) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "London", 21));
        people.add(new Person("Swann", "London", 21));
        people.add(new Person("Kevin", "London", 23));
        people.add(new Person("Monobo", "Tokyo", 23));
        people.add(new Person("Sam", "Paris", 23));
        people.add(new Person("Nadal", "Paris", 31));


        /// group by city

        Map<String, List<Person>> groupByCity = people.stream().collect(Collectors.groupingBy(Person::getCity));
        System.out.println(groupByCity);
    }


    static class Person {
        private String name;
        private String city;
        private int age;

        public Person(String name, String city, int age) {
            this.name = name;
            this.city = city;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s(%s,%d)", name, city, age);
        }


    }


}
