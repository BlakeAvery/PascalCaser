class Stringer constructor(s: String) {
    private var string: String
    init {
        string = s
    }
    private fun toArrayList(list: List<String>): ArrayList<String> {
        val ret = ArrayList<String>()
        for(x in 0 until list.size) {
            ret.add(x, list[x])
        }
        return ret
    }
    fun pascalArray(): Array<String> {
        val temp = string.split(Regex("(?=[A-Z])"))
        var ret = toArrayList(temp)
        for(x in ret.size until ret.size + 4) {
            ret.add(x, "null")
        }
        return ret.toTypedArray()
    }
}