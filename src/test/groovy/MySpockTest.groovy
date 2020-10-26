import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MySpockTest extends Specification{

        def "should calculate: #x + #y = #sum"() {

            expect:
            1 ==1

//            expect:
//              1==
//
//            where:
//            x | y  | sum
//            1 | 2  | 3
//            2 | 5  | 7
//            3 | -1 | 2

        }
}
