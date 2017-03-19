import YakitoriTag.Companion.children
import YakitoriTag.Companion.y
import YakitoriTag.Companion.props
import example.TodoApplication
import kotlin.browser.document

/**
 * Created by ryota on 2017/03/19.
 */

@JsName("main")
fun main(args: Array<String>) {
//    Yakitori.render(view(), document.getElementById("main")!!)
    TodoApplication.start()
}

fun view(): YakitoriElement {
    val hogehog = y("div", props(classNames("main", "fun")),
            y("div", "hoge"),
            y("div", "hoge"),
            y("ul", children(
                    y("li", "hoge")
            ))
    )
    return hogehog
}