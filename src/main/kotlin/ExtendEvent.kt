/**
 * Created by ryota on 2017/03/18.
 */
import org.w3c.dom.*
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

/**
 * Created by ryota on 2017/03/18.
 */

abstract class FormEventTarget : EventTarget() {
    abstract var value: String
}

abstract class InputTextEvent(type: String, eventInitDict: EventInit) : Event(type = type, eventInitDict = eventInitDict) {
    override abstract var target: FormEventTarget
}