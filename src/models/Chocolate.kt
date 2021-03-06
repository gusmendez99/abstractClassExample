package models

class Chocolate(val name:String, val sugarContent:Int, val flavor:String) : Candy(name, sugarContent) {
    override fun toString(): String {
        return """
            name: $name
            sugarContent: $sugarContent
            flavor: $flavor
        """.trimIndent()
    }
}
