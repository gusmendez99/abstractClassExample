package generic

import java.util.*

open class RandomBox <T> (private val buffer: ArrayList<T>) {
    fun pickOne():T? {
        if(buffer.isNotEmpty()){
            return buffer.removeAt(Random().nextInt(buffer.size))
        }
        return null
    }


}