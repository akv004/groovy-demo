class Test {


    public static void main(String[] args) {
        System.out.println('Hello')
//
//        BigDecimal a = new BigDecimal("10.11")
//        BigDecimal b = new BigDecimal("11");
//        BigDecimal c = new BigDecimal("11");
//        BigDecimal d = new BigDecimal("111.111");
//        BigDecimal e = new BigDecimal("111.1111");
//
//        System.out.println(a >b)
//        System.out.println(a <b) //
//        System.out.println(c==b)
//        System.out.println(d>=e)
//
        List<String> alist = [1, 2, 3, 4]
        alist.each { item -> println(item) }

        Map map = ["k1": "v1", "k2": "v2"]
        map."c" = 'd'
        map['k3']='v3'
        map.each { k, v ->
            println "Key $k - Value $v"
        }


    }
}