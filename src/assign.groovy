class Person2{
    String firstName
    String lastName
    String Email
    int age


    /*
    String toString()
    {
    return "${firstName} ${lastName} ${age}"
     */
}
Map m1=[firstName: "hello", lastName: "bolo", Email: "jsdjbfbv" , age: 13]
Map m2=[firstName: "hiiii", lastName: "byeee", Email: "jsdjjdjdbcbfbv" , age: 15]
Map m3=[firstName: "priyal", lastName: "singhal", Email: "qwidjbfbv" , age: 17]
Map m4=[firstName: "smita", lastName: "pallem", Email: "oiujsdjbfbv" , age: 18]
Map m5=[firstName: "pooja", lastName: "agrawal", Email: "poiujsdjbfbv" , age: 20]

Person2 p1=new Person2(m1)
Person2 p2=new Person2(m2)
Person2 p3=new Person2(m3)
Person2 p4=new Person2(m4)
Person2 p5=new Person2(m5)

List a=[p1,p2,p3,p4,p5]


    a.each {
        println "${it.firstName} ${it.lastName} ${it.age}"
    }