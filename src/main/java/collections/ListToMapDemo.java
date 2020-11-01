package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToMapDemo {


    public static void main(String args[]){
        List devList = new ArrayList<Developer>();
        devList.add(new Developer("Amit",45, Arrays.asList("java","C++")));
        devList.add(new Developer("Tim",22, Arrays.asList("Pascal","python")));
        devList.add(new Developer("Jim",28, Arrays.asList("Groovy","Node")));

        Map<String,Developer> map = (Map<String, Developer>) devList.stream().collect(Collectors.toMap(Developer::getName, dev->dev));

        System.out.println(map);


    }

    static class Developer {
        String name;
        int age;
        List<String> skills;

        public Developer(String name, int age, List<String> skills) {
            this.name = name;
            this.age = age;
            this.skills = skills;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public List<String> getSkills() {
            return skills;
        }

        public void setSkills(List<String> skills) {
            this.skills = skills;
        }

        @Override
        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", skills=" + skills +
                    '}';
        }
    }
}
