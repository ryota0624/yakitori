package Inferno

/**
 * Created by ryota on 2017/03/18.
 */
import org.w3c.dom.Element
import kotlin.js.Json

/**
 * Created by ryota on 2017/03/18.
 */
external class Inferno {
    companion object {
        val version: dynamic
        fun createVNode(flags: Int, type: String?, props: Json?, children: Number, events: Json?, key: String?, ref: Any?, noNormalise: Boolean?): InfernoElement
        fun createVNode(flags: Int, type: String?, props: Json?, children: Any?, events: Json?, key: String?, ref: Any?, noNormalise: Boolean?): InfernoElement
        fun createVNode(flags: Int, type: String?, props: Json?, children: String, events: Json?, key: String?, ref: Any?, noNormalise: Boolean?): InfernoElement
        fun createVNode(flags: Int, type: String?, props: Json?, children: Array<String>, events: Json?, key: String?, ref: Any?, noNormalise: Boolean?): InfernoElement
        fun createVNode(flags: Int, type: String?, props: Json?, children: Array<Number>, events: Json?, key: String?, ref: Any?, noNormalise: Boolean?): InfernoElement
        fun createVNode(flags: Int, type: String?, props: Json?, children: Array<InfernoElement>, events: Json?, key: String?, ref: Any?, noNormalise: Boolean?): InfernoElement
        fun render(node: Any, container: Element)
    }
}

typealias InfernoElement = Any