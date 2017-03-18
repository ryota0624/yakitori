import YakitoriTag.Companion.children
import YakitoriTag.Companion.div
import YakitoriTag.Companion.props
import kotlin.browser.document

/**
 * Created by ryota on 2017/03/19.
 */

@JsName("main")
fun main(args: Array<String>) {
    Yakitori.render(view(), document.getElementById("main")!!)
}

fun view(): YakitoriElement {
    val hogehog = div(props(classNames("main", "fun")),
            div("hoge"),
            div("hoge")
    )
    return hogehog
}