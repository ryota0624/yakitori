package Generator

/**
 * Created by ryota on 2017/03/19.
 */

val tags = arrayOf("a", "abbr", "acronym", "address", "applet", "area", "article", "aside", "audio", "b", "base", "basefont", "bdi", "bdo", "bgsound", "big", "blink", "blockquote", "body", "br", "canvas", "caption", "center", "cite", "code", "col", "colgroup", "command", "!-- --", "datalist", "dd", "del", "details", "dfn", "dir", "div", "dl", "!DOCTYPE", "dt", "em", "embed", "fieldset", "figure", "figcaption", "footer", "font", "form", "frame", "frameset", "h1> 〜 <h6", "head", "header", "hgroup", "hr", "html", "i", "iframe", "img", "input", "ins", "kbd", "keygen", "label", "legend", "li", "link", "listing", "map", "mark", "marquee", "menu", "meta", "meter", "multicol", "nav", "nobr", "noembed", "noframes", "noscript", "object", "ol", "optgroup", "option", "output", "p", "param", "picture", "plaintext", "pre", "progress", "q", "rb", "rp", "rt", "rtc", "ruby", "s", "samp", "script", "section", "select", "small", "source", "spacer", "span", "strike", "strong", "style", "sub", "summary", "sup", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "time", "title", "tr", "track", "tt", "u", "ul", "var", "video", "wbr", "xmp", "!DOCTYPE", "body", "head", "html", "base", "head", "link", "meta", "style", "title", "article", "aside", "div", "footer", "h1> 〜 <h6", "header", "nav", "p", "section", "abbr", "address", "cite", "code", "del", "details", "dfn", "em", "ins", "kbd", "pre", "q", "s", "samp", "strong", "summary", "template", "time", "var", "b", "bdo", "br", "font", "i", "nobr", "rb", "rp", "rt", "ruby", "small", "span", "sub", "sup", "tt", "u", "wbr", "a", "area", "base", "link", "map", "audio", "canvas", "embed", "figcaption", "figure", "img", "object", "param", "picture", "source", "track", "video", "dd", "dir", "dl", "dt", "li", "ol", "ul", "caption", "col", "colgroup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "fieldset", "form", "input", "label", "legend", "option", "optgroup", "select", "textarea", "frame", "frameset", "iframe", "noframes", "noscript", "script", "style", "!-- --", "acronym", "applet", "basefont", "bgsound", "big", "blink", "center", "dir", "font", "frame", "frameset", "hgroup", "keygen", "listing", "marquee", "multicol", "nobr", "noembed", "noframes", "plaintext", "spacer", "strike", "tt", "xmp")

fun template(tag: String): String {
    return """
            fun ${tag}(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag(${tag}, props, children(children))
            fun ${tag}(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag(${tag}, props, children)
            fun ${tag}(props: YakitoriProperties, text: String) = Yakitori.tag(${tag}, props, text)
            fun ${tag}(vararg children: YakitoriElement) = Yakitori.tag(${tag}, emptyArray(), children(children))
            fun ${tag}(text: String) = Yakitori.tag(${tag}, emptyArray(), text)
            """
}

fun writeFile() {
     tags.map {
        template(it)
    } .joinToString("\n")
}