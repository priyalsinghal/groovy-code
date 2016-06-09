/**
 * Created by priyal on 8/6/16.
 */
println "hello"

List a= [2,3,4,5,6]

if (a){
    println("the a is non-empty")
}

String b = ""

if(b){
    println "b is non-empty"
}
else{
    println "b is empty"
}

Map data=[firstName: "shubham", lastName: "jain", info: "I came late today"]

println data
println(data.firstName)
println(data.get("firstName"))
println(data["lastName"])