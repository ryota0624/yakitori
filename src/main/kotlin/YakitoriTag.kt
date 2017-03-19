fun List<YakitoriElement?>.nullFlatMap(): List<YakitoriElement> {
    return this
            .filter { it != null }
            .map { it.unsafeCast<YakitoriElement>()}
}

class YakitoriTag {
    companion object {
        fun children(vararg tags: YakitoriElement?): Array<YakitoriElement> {
            return tags.filter {
                it is YakitoriElement
            }.nullFlatMap().toTypedArray()
        }

        fun props(vararg p: YakitoriProp<out Any>): YakitoriProperties {
            return p
        }

        fun y(type: String, props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag(type, props, children(children))
        fun y(type: String, props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag(type, props, children)
        fun y(type: String, props: YakitoriProperties, text: String) = Yakitori.tag(type, props, text)
        fun y(type: String, vararg children: YakitoriElement) = Yakitori.tag(type, emptyArray(), children(children))
        fun y(type: String, text: String) = Yakitori.tag(type, emptyArray(), text)
    }
}
        