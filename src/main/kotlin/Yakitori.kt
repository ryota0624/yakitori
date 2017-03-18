/**
 * Created by ryota on 2017/03/18.
 */

import Inferno.*
import org.w3c.dom.Node
import org.w3c.dom.Element
import org.w3c.dom.events.Event
import kotlin.js.Json
import kotlin.js.json

abstract class YakitoriProp<T>(val name: String, val value: T) {
    class Ref(handler: (Node) -> Unit) : YakitoriProp<(Node) -> Unit>(value = handler, name = "ref")
    class Key(value: String) : YakitoriProp<String>(value = value, name = "key")
}

abstract class YakitoriStringProp(name: String, value: String) : YakitoriProp<String>(name, value) {
}

sealed class EventProp<T>(val eventName: String, val handler: (T) -> dynamic) : YakitoriProp<(T) -> dynamic>(name = eventName, value = handler) {
    class onClick(handler: (Event) -> dynamic) : EventProp<Event>(eventName = "onclick", handler = handler)
    class onInput(handler: (Event) -> dynamic) : EventProp<Event>(eventName = "onInput", handler = handler)
    class onInputText(textHandler: (String) -> dynamic) : EventProp<InputTextEvent>(eventName = "onInput", handler = { event ->
        textHandler(event.target.value)
    })

    class onChange(handler: (Event) -> dynamic) : EventProp<Event>(eventName = "onchange", handler = handler)
}


typealias YakitoriElement = InfernoElement

typealias YakitoriProperties = Array<out YakitoriProp<out Any>>

open class Yakitori {
    companion object {
        val version: dynamic = Inferno.version
        private fun propsToJson(props: YakitoriProperties): Json {
            return json(*props.filter { prop ->
                prop is YakitoriStringProp
            }.map { prop ->
                Pair(prop.name, prop.value)
            }.toTypedArray())
        }

        private fun propsToEvents(props: YakitoriProperties): Json {
            return json(*props.filter { prop ->
                prop is EventProp<*>
            }.map { prop ->
                Pair(prop.name, prop.value)
            }.toTypedArray())
        }

        private fun pickKeyFromProps(props: YakitoriProperties): String? {
            val value = props.find {
                it.name == "key"
            }?.value

            return if (value is String) value else null
        }

        private fun pickRefFromProps(props: YakitoriProperties): Function<*>? {
            val value = props.find {
                it.name == "ref"
            }?.value

            return if (value is Function<*>) value else null
        }

        fun createVNode(n: Int, tag: String, props: YakitoriProperties, children: Array<YakitoriElement>): YakitoriElement {
            return Inferno.createVNode(flags = n, type = tag, props = propsToJson(props), children = children, events = propsToEvents(props), key = pickKeyFromProps(props), noNormalise = null, ref = pickRefFromProps(props))
        }

        fun createVNode(n: Int, tag: String, props: YakitoriProperties, children: String): YakitoriElement {
            return Inferno.createVNode(n, tag, propsToJson(props), children = children, events = propsToEvents(props), key = pickKeyFromProps(props), noNormalise = null, ref = pickRefFromProps(props))
        }

        fun createVNode(n: Int, tag: String, props: YakitoriProperties): YakitoriElement {
            return Inferno.createVNode(n, tag, propsToJson(props), children = null, events = propsToEvents(props), key = pickKeyFromProps(props), noNormalise = null, ref = pickRefFromProps(props))
        }

        fun tag(name: String, children: Array<YakitoriElement>): YakitoriElement {
            return Yakitori.createVNode(2, name, emptyArray(), children)
        }
        fun tag(name: String, text: String): YakitoriElement {
            return Yakitori.createVNode(2, name, emptyArray(), text)
        }
        fun tag(name: String, props: YakitoriProperties, text: String): YakitoriElement {
            return Yakitori.createVNode(2, name, props, text)
        }
        fun tag(name: String, props: YakitoriProperties, children: Array<YakitoriElement>): YakitoriElement {
            return Yakitori.createVNode(2, name, props, children)
        }

        fun tag(name: String, props: YakitoriProperties): YakitoriElement {
            return Yakitori.createVNode(2, name, props, emptyArray())
        }



        fun render(node: YakitoriElement, container: Element) = Inferno.render(node, container)

    }
}