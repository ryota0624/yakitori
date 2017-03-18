/**
 * Created by ryota on 2017/03/19.
 */

private class ClassName(value: String) : YakitoriStringProp("class", value)

fun classNames(vararg values: String): YakitoriStringProp {
    return ClassName(values.joinToString(" "))
}