import generic.RandomBox
import models.Chocolate
import models.ForrestGump

fun main(args: Array<String>){

    println("FORREST GUMP")
    val chocolates = arrayListOf<Chocolate> (
            Chocolate("Chocolate 1", 100, "Nuez"),
            Chocolate("Chocolate 2", 20, "Blanco"),
            Chocolate("Chocolate 3", 20, "Mani")
    )

    val forrestGump = ForrestGump<Chocolate>(RandomBox<Chocolate>(chocolates))

    println(forrestGump.sayTheLine())
    println(forrestGump.sayTheLine())
    println(forrestGump.sayTheLine())
    println(forrestGump.sayTheLine()) //After three chocolates, it returns "Life sucks"

}