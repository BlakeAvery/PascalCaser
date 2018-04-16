fun main(args: Array<String>) {
    print("Enter a string in PascalCase: ")
    val str = readLine() ?: ""
    val stringer = Stringer(str)
    val returner = stringer.pascalArray()
    for(x in 0 until returner.size) {
        println(returner[x])
    }
}