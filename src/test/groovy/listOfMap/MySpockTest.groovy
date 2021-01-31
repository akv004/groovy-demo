package listOfMap

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MySpockTest extends Specification {

    def "should calculate: #x + #y = #sum"() {
        expect:
        sum == (x + y)

        where:
        x | y  | sum
        1 | 2  | 3
        2 | 5  | 7
        3 | -1 | 2
    }

    def "Groovy Map Add Values "() {
        given:
        def student = [:] // Initialize empty map

        when:
        student.put('name', 'John') // java notation
        student['surname'] = 'Doe' // You can state key in square brackets
        student << [age: 17] // This is something output redirection in unix commands. key-value pair put inside map object
        student.class = "11C" // Dot notation is also available
        student.'school' = "Groovy School" // Same as previous

        then:
        student == [name: 'John', surname: 'Doe', age: 17, class: '11C', school: 'Groovy School']

        //Remove By Key
        when:
        student.remove('school')// Remove by key
        student = student - [class: '11C'] // This is something like arithmetic operation
        then:
        student == [name: 'John', surname: 'Doe', age: 17]

    }


    def "Collect all name from list of Users"() {
        given:
        List<User> usermap = [[name: 'amit', age: 33],
                              [name: 'Bhola', age: 22],
                              [name: 'Balu', age: 21],
                              [name: 'Kaka', age: 24],
                              [name: 'Mamu', age: 222]]

        def listOofMap = [[name: 'amit', age: 33],
                          [name: 'Bhola', age: 22],
                          [name: 'Balu', age: 21],
                          [name: 'Kaka', age: 24],
                          [name: 'Mamu', age: 222]]
        when:
        List<String> names = usermap.name // TO GET list of attribute from Object or Map
        List<String> namesFromMap = listOofMap.name

        then:
        names[0] == 'amit'
        namesFromMap[1] == 'Bhola'
    }


    //List and iterations
    def "Iteration over list"() {
        given:
        List<User> users = [[name: 'amit', age: 33],
                            [name: 'Bhola', age: 22],
                            [name: 'Balu', age: 21],
                            [name: 'Kaka', age: 24],
                            [name: 'Mamu', age: 222]]


        when:

        users.each { println(it) } // iterate over list
        users.eachWithIndex {it,i-> println('index='+i + ' , user='+it)}
        // iterate with index and populate new list
        List<Map> newListWithId = []
        users.eachWithIndex { it, i -> newListWithId << [id:i]+ it }
        println(newListWithId)

        then:
        users[0] == [name: 'amit', age: 33]
        newListWithId[0] == [id:0, name: 'amit', age: 33]
    }


    static class User {
        String name
        Integer age

        User(String name, Integer age) {
            this.name = name
            this.age = age
        }
    }


}
