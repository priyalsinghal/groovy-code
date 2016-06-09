List marks = [70,80,90,85,75]
println marks[0]
println marks[1]
println marks[2]
println marks[3]

for(int i=0; i< marks.size(); i++)
{
    println(marks[i])
    System.out.println(marks[i])

}

println("in groovy")

marks.each{
    println it
}

marks.each({hello ->
    println hello
}
)
