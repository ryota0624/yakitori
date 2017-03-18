class YakitoriTag {
    companion object {
        fun children(vararg tags: YakitoriElement): Array<YakitoriElement> {
            return tags.filter {
                it is YakitoriElement
            }.toTypedArray()
        }

        fun props(vararg p: YakitoriProp<out Any>): YakitoriProperties {
            return p
        }

        fun a(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("a", props, children(children))
        fun a(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("a", props, children)
        fun a(props: YakitoriProperties, text: String) = Yakitori.tag("a", props, text)
        fun a(vararg children: YakitoriElement) = Yakitori.tag("a", emptyArray(), children(children))
        fun a(text: String) = Yakitori.tag("a", emptyArray(), text)


        fun abbr(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("abbr", props, children(children))
        fun abbr(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("abbr", props, children)
        fun abbr(props: YakitoriProperties, text: String) = Yakitori.tag("abbr", props, text)
        fun abbr(vararg children: YakitoriElement) = Yakitori.tag("abbr", emptyArray(), children(children))
        fun abbr(text: String) = Yakitori.tag("abbr", emptyArray(), text)


        fun acronym(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("acronym", props, children(children))
        fun acronym(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("acronym", props, children)
        fun acronym(props: YakitoriProperties, text: String) = Yakitori.tag("acronym", props, text)
        fun acronym(vararg children: YakitoriElement) = Yakitori.tag("acronym", emptyArray(), children(children))
        fun acronym(text: String) = Yakitori.tag("acronym", emptyArray(), text)


        fun address(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("address", props, children(children))
        fun address(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("address", props, children)
        fun address(props: YakitoriProperties, text: String) = Yakitori.tag("address", props, text)
        fun address(vararg children: YakitoriElement) = Yakitori.tag("address", emptyArray(), children(children))
        fun address(text: String) = Yakitori.tag("address", emptyArray(), text)


        fun applet(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("applet", props, children(children))
        fun applet(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("applet", props, children)
        fun applet(props: YakitoriProperties, text: String) = Yakitori.tag("applet", props, text)
        fun applet(vararg children: YakitoriElement) = Yakitori.tag("applet", emptyArray(), children(children))
        fun applet(text: String) = Yakitori.tag("applet", emptyArray(), text)


        fun area(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("area", props, children(children))
        fun area(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("area", props, children)
        fun area(props: YakitoriProperties, text: String) = Yakitori.tag("area", props, text)
        fun area(vararg children: YakitoriElement) = Yakitori.tag("area", emptyArray(), children(children))
        fun area(text: String) = Yakitori.tag("area", emptyArray(), text)


        fun article(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("article", props, children(children))
        fun article(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("article", props, children)
        fun article(props: YakitoriProperties, text: String) = Yakitori.tag("article", props, text)
        fun article(vararg children: YakitoriElement) = Yakitori.tag("article", emptyArray(), children(children))
        fun article(text: String) = Yakitori.tag("article", emptyArray(), text)


        fun aside(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("aside", props, children(children))
        fun aside(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("aside", props, children)
        fun aside(props: YakitoriProperties, text: String) = Yakitori.tag("aside", props, text)
        fun aside(vararg children: YakitoriElement) = Yakitori.tag("aside", emptyArray(), children(children))
        fun aside(text: String) = Yakitori.tag("aside", emptyArray(), text)


        fun audio(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("audio", props, children(children))
        fun audio(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("audio", props, children)
        fun audio(props: YakitoriProperties, text: String) = Yakitori.tag("audio", props, text)
        fun audio(vararg children: YakitoriElement) = Yakitori.tag("audio", emptyArray(), children(children))
        fun audio(text: String) = Yakitori.tag("audio", emptyArray(), text)


        fun b(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("b", props, children(children))
        fun b(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("b", props, children)
        fun b(props: YakitoriProperties, text: String) = Yakitori.tag("b", props, text)
        fun b(vararg children: YakitoriElement) = Yakitori.tag("b", emptyArray(), children(children))
        fun b(text: String) = Yakitori.tag("b", emptyArray(), text)


        fun base(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("base", props, children(children))
        fun base(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("base", props, children)
        fun base(props: YakitoriProperties, text: String) = Yakitori.tag("base", props, text)
        fun base(vararg children: YakitoriElement) = Yakitori.tag("base", emptyArray(), children(children))
        fun base(text: String) = Yakitori.tag("base", emptyArray(), text)


        fun basefont(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("basefont", props, children(children))
        fun basefont(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("basefont", props, children)
        fun basefont(props: YakitoriProperties, text: String) = Yakitori.tag("basefont", props, text)
        fun basefont(vararg children: YakitoriElement) = Yakitori.tag("basefont", emptyArray(), children(children))
        fun basefont(text: String) = Yakitori.tag("basefont", emptyArray(), text)


        fun bdi(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("bdi", props, children(children))
        fun bdi(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("bdi", props, children)
        fun bdi(props: YakitoriProperties, text: String) = Yakitori.tag("bdi", props, text)
        fun bdi(vararg children: YakitoriElement) = Yakitori.tag("bdi", emptyArray(), children(children))
        fun bdi(text: String) = Yakitori.tag("bdi", emptyArray(), text)


        fun bdo(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("bdo", props, children(children))
        fun bdo(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("bdo", props, children)
        fun bdo(props: YakitoriProperties, text: String) = Yakitori.tag("bdo", props, text)
        fun bdo(vararg children: YakitoriElement) = Yakitori.tag("bdo", emptyArray(), children(children))
        fun bdo(text: String) = Yakitori.tag("bdo", emptyArray(), text)


        fun bgsound(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("bgsound", props, children(children))
        fun bgsound(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("bgsound", props, children)
        fun bgsound(props: YakitoriProperties, text: String) = Yakitori.tag("bgsound", props, text)
        fun bgsound(vararg children: YakitoriElement) = Yakitori.tag("bgsound", emptyArray(), children(children))
        fun bgsound(text: String) = Yakitori.tag("bgsound", emptyArray(), text)


        fun big(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("big", props, children(children))
        fun big(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("big", props, children)
        fun big(props: YakitoriProperties, text: String) = Yakitori.tag("big", props, text)
        fun big(vararg children: YakitoriElement) = Yakitori.tag("big", emptyArray(), children(children))
        fun big(text: String) = Yakitori.tag("big", emptyArray(), text)


        fun blink(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("blink", props, children(children))
        fun blink(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("blink", props, children)
        fun blink(props: YakitoriProperties, text: String) = Yakitori.tag("blink", props, text)
        fun blink(vararg children: YakitoriElement) = Yakitori.tag("blink", emptyArray(), children(children))
        fun blink(text: String) = Yakitori.tag("blink", emptyArray(), text)


        fun blockquote(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("blockquote", props, children(children))
        fun blockquote(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("blockquote", props, children)
        fun blockquote(props: YakitoriProperties, text: String) = Yakitori.tag("blockquote", props, text)
        fun blockquote(vararg children: YakitoriElement) = Yakitori.tag("blockquote", emptyArray(), children(children))
        fun blockquote(text: String) = Yakitori.tag("blockquote", emptyArray(), text)


        fun body(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("body", props, children(children))
        fun body(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("body", props, children)
        fun body(props: YakitoriProperties, text: String) = Yakitori.tag("body", props, text)
        fun body(vararg children: YakitoriElement) = Yakitori.tag("body", emptyArray(), children(children))
        fun body(text: String) = Yakitori.tag("body", emptyArray(), text)


        fun br(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("br", props, children(children))
        fun br(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("br", props, children)
        fun br(props: YakitoriProperties, text: String) = Yakitori.tag("br", props, text)
        fun br(vararg children: YakitoriElement) = Yakitori.tag("br", emptyArray(), children(children))
        fun br(text: String) = Yakitori.tag("br", emptyArray(), text)


        fun canvas(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("canvas", props, children(children))
        fun canvas(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("canvas", props, children)
        fun canvas(props: YakitoriProperties, text: String) = Yakitori.tag("canvas", props, text)
        fun canvas(vararg children: YakitoriElement) = Yakitori.tag("canvas", emptyArray(), children(children))
        fun canvas(text: String) = Yakitori.tag("canvas", emptyArray(), text)


        fun caption(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("caption", props, children(children))
        fun caption(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("caption", props, children)
        fun caption(props: YakitoriProperties, text: String) = Yakitori.tag("caption", props, text)
        fun caption(vararg children: YakitoriElement) = Yakitori.tag("caption", emptyArray(), children(children))
        fun caption(text: String) = Yakitori.tag("caption", emptyArray(), text)


        fun center(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("center", props, children(children))
        fun center(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("center", props, children)
        fun center(props: YakitoriProperties, text: String) = Yakitori.tag("center", props, text)
        fun center(vararg children: YakitoriElement) = Yakitori.tag("center", emptyArray(), children(children))
        fun center(text: String) = Yakitori.tag("center", emptyArray(), text)


        fun cite(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("cite", props, children(children))
        fun cite(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("cite", props, children)
        fun cite(props: YakitoriProperties, text: String) = Yakitori.tag("cite", props, text)
        fun cite(vararg children: YakitoriElement) = Yakitori.tag("cite", emptyArray(), children(children))
        fun cite(text: String) = Yakitori.tag("cite", emptyArray(), text)


        fun code(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("code", props, children(children))
        fun code(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("code", props, children)
        fun code(props: YakitoriProperties, text: String) = Yakitori.tag("code", props, text)
        fun code(vararg children: YakitoriElement) = Yakitori.tag("code", emptyArray(), children(children))
        fun code(text: String) = Yakitori.tag("code", emptyArray(), text)


        fun col(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("col", props, children(children))
        fun col(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("col", props, children)
        fun col(props: YakitoriProperties, text: String) = Yakitori.tag("col", props, text)
        fun col(vararg children: YakitoriElement) = Yakitori.tag("col", emptyArray(), children(children))
        fun col(text: String) = Yakitori.tag("col", emptyArray(), text)


        fun colgroup(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("colgroup", props, children(children))
        fun colgroup(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("colgroup", props, children)
        fun colgroup(props: YakitoriProperties, text: String) = Yakitori.tag("colgroup", props, text)
        fun colgroup(vararg children: YakitoriElement) = Yakitori.tag("colgroup", emptyArray(), children(children))
        fun colgroup(text: String) = Yakitori.tag("colgroup", emptyArray(), text)


        fun command(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("command", props, children(children))
        fun command(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("command", props, children)
        fun command(props: YakitoriProperties, text: String) = Yakitori.tag("command", props, text)
        fun command(vararg children: YakitoriElement) = Yakitori.tag("command", emptyArray(), children(children))
        fun command(text: String) = Yakitori.tag("command", emptyArray(), text)

        fun datalist(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("datalist", props, children(children))
        fun datalist(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("datalist", props, children)
        fun datalist(props: YakitoriProperties, text: String) = Yakitori.tag("datalist", props, text)
        fun datalist(vararg children: YakitoriElement) = Yakitori.tag("datalist", emptyArray(), children(children))
        fun datalist(text: String) = Yakitori.tag("datalist", emptyArray(), text)


        fun dd(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("dd", props, children(children))
        fun dd(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("dd", props, children)
        fun dd(props: YakitoriProperties, text: String) = Yakitori.tag("dd", props, text)
        fun dd(vararg children: YakitoriElement) = Yakitori.tag("dd", emptyArray(), children(children))
        fun dd(text: String) = Yakitori.tag("dd", emptyArray(), text)


        fun del(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("del", props, children(children))
        fun del(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("del", props, children)
        fun del(props: YakitoriProperties, text: String) = Yakitori.tag("del", props, text)
        fun del(vararg children: YakitoriElement) = Yakitori.tag("del", emptyArray(), children(children))
        fun del(text: String) = Yakitori.tag("del", emptyArray(), text)


        fun details(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("details", props, children(children))
        fun details(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("details", props, children)
        fun details(props: YakitoriProperties, text: String) = Yakitori.tag("details", props, text)
        fun details(vararg children: YakitoriElement) = Yakitori.tag("details", emptyArray(), children(children))
        fun details(text: String) = Yakitori.tag("details", emptyArray(), text)


        fun dfn(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("dfn", props, children(children))
        fun dfn(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("dfn", props, children)
        fun dfn(props: YakitoriProperties, text: String) = Yakitori.tag("dfn", props, text)
        fun dfn(vararg children: YakitoriElement) = Yakitori.tag("dfn", emptyArray(), children(children))
        fun dfn(text: String) = Yakitori.tag("dfn", emptyArray(), text)


        fun dir(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("dir", props, children(children))
        fun dir(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("dir", props, children)
        fun dir(props: YakitoriProperties, text: String) = Yakitori.tag("dir", props, text)
        fun dir(vararg children: YakitoriElement) = Yakitori.tag("dir", emptyArray(), children(children))
        fun dir(text: String) = Yakitori.tag("dir", emptyArray(), text)


        fun div(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("div", props, children(children))
        fun div(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("div", props, children)
        fun div(props: YakitoriProperties, text: String) = Yakitori.tag("div", props, text)
        fun div(vararg children: YakitoriElement) = Yakitori.tag("div", emptyArray(), children(children))
        fun div(text: String) = Yakitori.tag("div", emptyArray(), text)


        fun dl(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("dl", props, children(children))
        fun dl(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("dl", props, children)
        fun dl(props: YakitoriProperties, text: String) = Yakitori.tag("dl", props, text)
        fun dl(vararg children: YakitoriElement) = Yakitori.tag("dl", emptyArray(), children(children))
        fun dl(text: String) = Yakitori.tag("dl", emptyArray(), text)

        fun dt(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("dt", props, children(children))
        fun dt(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("dt", props, children)
        fun dt(props: YakitoriProperties, text: String) = Yakitori.tag("dt", props, text)
        fun dt(vararg children: YakitoriElement) = Yakitori.tag("dt", emptyArray(), children(children))
        fun dt(text: String) = Yakitori.tag("dt", emptyArray(), text)


        fun em(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("em", props, children(children))
        fun em(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("em", props, children)
        fun em(props: YakitoriProperties, text: String) = Yakitori.tag("em", props, text)
        fun em(vararg children: YakitoriElement) = Yakitori.tag("em", emptyArray(), children(children))
        fun em(text: String) = Yakitori.tag("em", emptyArray(), text)


        fun embed(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("embed", props, children(children))
        fun embed(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("embed", props, children)
        fun embed(props: YakitoriProperties, text: String) = Yakitori.tag("embed", props, text)
        fun embed(vararg children: YakitoriElement) = Yakitori.tag("embed", emptyArray(), children(children))
        fun embed(text: String) = Yakitori.tag("embed", emptyArray(), text)


        fun fieldset(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("fieldset", props, children(children))
        fun fieldset(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("fieldset", props, children)
        fun fieldset(props: YakitoriProperties, text: String) = Yakitori.tag("fieldset", props, text)
        fun fieldset(vararg children: YakitoriElement) = Yakitori.tag("fieldset", emptyArray(), children(children))
        fun fieldset(text: String) = Yakitori.tag("fieldset", emptyArray(), text)


        fun figure(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("figure", props, children(children))
        fun figure(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("figure", props, children)
        fun figure(props: YakitoriProperties, text: String) = Yakitori.tag("figure", props, text)
        fun figure(vararg children: YakitoriElement) = Yakitori.tag("figure", emptyArray(), children(children))
        fun figure(text: String) = Yakitori.tag("figure", emptyArray(), text)


        fun figcaption(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("figcaption", props, children(children))
        fun figcaption(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("figcaption", props, children)
        fun figcaption(props: YakitoriProperties, text: String) = Yakitori.tag("figcaption", props, text)
        fun figcaption(vararg children: YakitoriElement) = Yakitori.tag("figcaption", emptyArray(), children(children))
        fun figcaption(text: String) = Yakitori.tag("figcaption", emptyArray(), text)


        fun footer(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("footer", props, children(children))
        fun footer(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("footer", props, children)
        fun footer(props: YakitoriProperties, text: String) = Yakitori.tag("footer", props, text)
        fun footer(vararg children: YakitoriElement) = Yakitori.tag("footer", emptyArray(), children(children))
        fun footer(text: String) = Yakitori.tag("footer", emptyArray(), text)


        fun font(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("font", props, children(children))
        fun font(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("font", props, children)
        fun font(props: YakitoriProperties, text: String) = Yakitori.tag("font", props, text)
        fun font(vararg children: YakitoriElement) = Yakitori.tag("font", emptyArray(), children(children))
        fun font(text: String) = Yakitori.tag("font", emptyArray(), text)


        fun form(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("form", props, children(children))
        fun form(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("form", props, children)
        fun form(props: YakitoriProperties, text: String) = Yakitori.tag("form", props, text)
        fun form(vararg children: YakitoriElement) = Yakitori.tag("form", emptyArray(), children(children))
        fun form(text: String) = Yakitori.tag("form", emptyArray(), text)


        fun frame(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("frame", props, children(children))
        fun frame(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("frame", props, children)
        fun frame(props: YakitoriProperties, text: String) = Yakitori.tag("frame", props, text)
        fun frame(vararg children: YakitoriElement) = Yakitori.tag("frame", emptyArray(), children(children))
        fun frame(text: String) = Yakitori.tag("frame", emptyArray(), text)


        fun frameset(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("frameset", props, children(children))
        fun frameset(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("frameset", props, children)
        fun frameset(props: YakitoriProperties, text: String) = Yakitori.tag("frameset", props, text)
        fun frameset(vararg children: YakitoriElement) = Yakitori.tag("frameset", emptyArray(), children(children))
        fun frameset(text: String) = Yakitori.tag("frameset", emptyArray(), text)


        fun head(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("head", props, children(children))
        fun head(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("head", props, children)
        fun head(props: YakitoriProperties, text: String) = Yakitori.tag("head", props, text)
        fun head(vararg children: YakitoriElement) = Yakitori.tag("head", emptyArray(), children(children))
        fun head(text: String) = Yakitori.tag("head", emptyArray(), text)


        fun header(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("header", props, children(children))
        fun header(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("header", props, children)
        fun header(props: YakitoriProperties, text: String) = Yakitori.tag("header", props, text)
        fun header(vararg children: YakitoriElement) = Yakitori.tag("header", emptyArray(), children(children))
        fun header(text: String) = Yakitori.tag("header", emptyArray(), text)


        fun hgroup(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("hgroup", props, children(children))
        fun hgroup(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("hgroup", props, children)
        fun hgroup(props: YakitoriProperties, text: String) = Yakitori.tag("hgroup", props, text)
        fun hgroup(vararg children: YakitoriElement) = Yakitori.tag("hgroup", emptyArray(), children(children))
        fun hgroup(text: String) = Yakitori.tag("hgroup", emptyArray(), text)


        fun hr(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("hr", props, children(children))
        fun hr(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("hr", props, children)
        fun hr(props: YakitoriProperties, text: String) = Yakitori.tag("hr", props, text)
        fun hr(vararg children: YakitoriElement) = Yakitori.tag("hr", emptyArray(), children(children))
        fun hr(text: String) = Yakitori.tag("hr", emptyArray(), text)


        fun html(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("html", props, children(children))
        fun html(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("html", props, children)
        fun html(props: YakitoriProperties, text: String) = Yakitori.tag("html", props, text)
        fun html(vararg children: YakitoriElement) = Yakitori.tag("html", emptyArray(), children(children))
        fun html(text: String) = Yakitori.tag("html", emptyArray(), text)


        fun i(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("i", props, children(children))
        fun i(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("i", props, children)
        fun i(props: YakitoriProperties, text: String) = Yakitori.tag("i", props, text)
        fun i(vararg children: YakitoriElement) = Yakitori.tag("i", emptyArray(), children(children))
        fun i(text: String) = Yakitori.tag("i", emptyArray(), text)


        fun iframe(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("iframe", props, children(children))
        fun iframe(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("iframe", props, children)
        fun iframe(props: YakitoriProperties, text: String) = Yakitori.tag("iframe", props, text)
        fun iframe(vararg children: YakitoriElement) = Yakitori.tag("iframe", emptyArray(), children(children))
        fun iframe(text: String) = Yakitori.tag("iframe", emptyArray(), text)


        fun img(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("img", props, children(children))
        fun img(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("img", props, children)
        fun img(props: YakitoriProperties, text: String) = Yakitori.tag("img", props, text)
        fun img(vararg children: YakitoriElement) = Yakitori.tag("img", emptyArray(), children(children))
        fun img(text: String) = Yakitori.tag("img", emptyArray(), text)


        fun input(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("input", props, children(children))
        fun input(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("input", props, children)
        fun input(props: YakitoriProperties, text: String) = Yakitori.tag("input", props, text)
        fun input(vararg children: YakitoriElement) = Yakitori.tag("input", emptyArray(), children(children))
        fun input(text: String) = Yakitori.tag("input", emptyArray(), text)


        fun ins(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("ins", props, children(children))
        fun ins(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("ins", props, children)
        fun ins(props: YakitoriProperties, text: String) = Yakitori.tag("ins", props, text)
        fun ins(vararg children: YakitoriElement) = Yakitori.tag("ins", emptyArray(), children(children))
        fun ins(text: String) = Yakitori.tag("ins", emptyArray(), text)


        fun kbd(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("kbd", props, children(children))
        fun kbd(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("kbd", props, children)
        fun kbd(props: YakitoriProperties, text: String) = Yakitori.tag("kbd", props, text)
        fun kbd(vararg children: YakitoriElement) = Yakitori.tag("kbd", emptyArray(), children(children))
        fun kbd(text: String) = Yakitori.tag("kbd", emptyArray(), text)


        fun keygen(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("keygen", props, children(children))
        fun keygen(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("keygen", props, children)
        fun keygen(props: YakitoriProperties, text: String) = Yakitori.tag("keygen", props, text)
        fun keygen(vararg children: YakitoriElement) = Yakitori.tag("keygen", emptyArray(), children(children))
        fun keygen(text: String) = Yakitori.tag("keygen", emptyArray(), text)


        fun label(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("label", props, children(children))
        fun label(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("label", props, children)
        fun label(props: YakitoriProperties, text: String) = Yakitori.tag("label", props, text)
        fun label(vararg children: YakitoriElement) = Yakitori.tag("label", emptyArray(), children(children))
        fun label(text: String) = Yakitori.tag("label", emptyArray(), text)


        fun legend(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("legend", props, children(children))
        fun legend(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("legend", props, children)
        fun legend(props: YakitoriProperties, text: String) = Yakitori.tag("legend", props, text)
        fun legend(vararg children: YakitoriElement) = Yakitori.tag("legend", emptyArray(), children(children))
        fun legend(text: String) = Yakitori.tag("legend", emptyArray(), text)


        fun li(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("li", props, children(children))
        fun li(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("li", props, children)
        fun li(props: YakitoriProperties, text: String) = Yakitori.tag("li", props, text)
        fun li(vararg children: YakitoriElement) = Yakitori.tag("li", emptyArray(), children(children))
        fun li(text: String) = Yakitori.tag("li", emptyArray(), text)


        fun link(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("link", props, children(children))
        fun link(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("link", props, children)
        fun link(props: YakitoriProperties, text: String) = Yakitori.tag("link", props, text)
        fun link(vararg children: YakitoriElement) = Yakitori.tag("link", emptyArray(), children(children))
        fun link(text: String) = Yakitori.tag("link", emptyArray(), text)


        fun listing(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("listing", props, children(children))
        fun listing(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("listing", props, children)
        fun listing(props: YakitoriProperties, text: String) = Yakitori.tag("listing", props, text)
        fun listing(vararg children: YakitoriElement) = Yakitori.tag("listing", emptyArray(), children(children))
        fun listing(text: String) = Yakitori.tag("listing", emptyArray(), text)


        fun map(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("map", props, children(children))
        fun map(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("map", props, children)
        fun map(props: YakitoriProperties, text: String) = Yakitori.tag("map", props, text)
        fun map(vararg children: YakitoriElement) = Yakitori.tag("map", emptyArray(), children(children))
        fun map(text: String) = Yakitori.tag("map", emptyArray(), text)


        fun mark(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("mark", props, children(children))
        fun mark(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("mark", props, children)
        fun mark(props: YakitoriProperties, text: String) = Yakitori.tag("mark", props, text)
        fun mark(vararg children: YakitoriElement) = Yakitori.tag("mark", emptyArray(), children(children))
        fun mark(text: String) = Yakitori.tag("mark", emptyArray(), text)


        fun marquee(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("marquee", props, children(children))
        fun marquee(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("marquee", props, children)
        fun marquee(props: YakitoriProperties, text: String) = Yakitori.tag("marquee", props, text)
        fun marquee(vararg children: YakitoriElement) = Yakitori.tag("marquee", emptyArray(), children(children))
        fun marquee(text: String) = Yakitori.tag("marquee", emptyArray(), text)


        fun menu(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("menu", props, children(children))
        fun menu(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("menu", props, children)
        fun menu(props: YakitoriProperties, text: String) = Yakitori.tag("menu", props, text)
        fun menu(vararg children: YakitoriElement) = Yakitori.tag("menu", emptyArray(), children(children))
        fun menu(text: String) = Yakitori.tag("menu", emptyArray(), text)


        fun meta(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("meta", props, children(children))
        fun meta(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("meta", props, children)
        fun meta(props: YakitoriProperties, text: String) = Yakitori.tag("meta", props, text)
        fun meta(vararg children: YakitoriElement) = Yakitori.tag("meta", emptyArray(), children(children))
        fun meta(text: String) = Yakitori.tag("meta", emptyArray(), text)


        fun meter(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("meter", props, children(children))
        fun meter(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("meter", props, children)
        fun meter(props: YakitoriProperties, text: String) = Yakitori.tag("meter", props, text)
        fun meter(vararg children: YakitoriElement) = Yakitori.tag("meter", emptyArray(), children(children))
        fun meter(text: String) = Yakitori.tag("meter", emptyArray(), text)


        fun multicol(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("multicol", props, children(children))
        fun multicol(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("multicol", props, children)
        fun multicol(props: YakitoriProperties, text: String) = Yakitori.tag("multicol", props, text)
        fun multicol(vararg children: YakitoriElement) = Yakitori.tag("multicol", emptyArray(), children(children))
        fun multicol(text: String) = Yakitori.tag("multicol", emptyArray(), text)


        fun nav(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("nav", props, children(children))
        fun nav(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("nav", props, children)
        fun nav(props: YakitoriProperties, text: String) = Yakitori.tag("nav", props, text)
        fun nav(vararg children: YakitoriElement) = Yakitori.tag("nav", emptyArray(), children(children))
        fun nav(text: String) = Yakitori.tag("nav", emptyArray(), text)


        fun nobr(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("nobr", props, children(children))
        fun nobr(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("nobr", props, children)
        fun nobr(props: YakitoriProperties, text: String) = Yakitori.tag("nobr", props, text)
        fun nobr(vararg children: YakitoriElement) = Yakitori.tag("nobr", emptyArray(), children(children))
        fun nobr(text: String) = Yakitori.tag("nobr", emptyArray(), text)


        fun noembed(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("noembed", props, children(children))
        fun noembed(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("noembed", props, children)
        fun noembed(props: YakitoriProperties, text: String) = Yakitori.tag("noembed", props, text)
        fun noembed(vararg children: YakitoriElement) = Yakitori.tag("noembed", emptyArray(), children(children))
        fun noembed(text: String) = Yakitori.tag("noembed", emptyArray(), text)


        fun noframes(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("noframes", props, children(children))
        fun noframes(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("noframes", props, children)
        fun noframes(props: YakitoriProperties, text: String) = Yakitori.tag("noframes", props, text)
        fun noframes(vararg children: YakitoriElement) = Yakitori.tag("noframes", emptyArray(), children(children))
        fun noframes(text: String) = Yakitori.tag("noframes", emptyArray(), text)


        fun noscript(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("noscript", props, children(children))
        fun noscript(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("noscript", props, children)
        fun noscript(props: YakitoriProperties, text: String) = Yakitori.tag("noscript", props, text)
        fun noscript(vararg children: YakitoriElement) = Yakitori.tag("noscript", emptyArray(), children(children))
        fun noscript(text: String) = Yakitori.tag("noscript", emptyArray(), text)


        fun ol(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("ol", props, children(children))
        fun ol(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("ol", props, children)
        fun ol(props: YakitoriProperties, text: String) = Yakitori.tag("ol", props, text)
        fun ol(vararg children: YakitoriElement) = Yakitori.tag("ol", emptyArray(), children(children))
        fun ol(text: String) = Yakitori.tag("ol", emptyArray(), text)


        fun optgroup(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("optgroup", props, children(children))
        fun optgroup(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("optgroup", props, children)
        fun optgroup(props: YakitoriProperties, text: String) = Yakitori.tag("optgroup", props, text)
        fun optgroup(vararg children: YakitoriElement) = Yakitori.tag("optgroup", emptyArray(), children(children))
        fun optgroup(text: String) = Yakitori.tag("optgroup", emptyArray(), text)


        fun option(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("option", props, children(children))
        fun option(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("option", props, children)
        fun option(props: YakitoriProperties, text: String) = Yakitori.tag("option", props, text)
        fun option(vararg children: YakitoriElement) = Yakitori.tag("option", emptyArray(), children(children))
        fun option(text: String) = Yakitori.tag("option", emptyArray(), text)


        fun output(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("output", props, children(children))
        fun output(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("output", props, children)
        fun output(props: YakitoriProperties, text: String) = Yakitori.tag("output", props, text)
        fun output(vararg children: YakitoriElement) = Yakitori.tag("output", emptyArray(), children(children))
        fun output(text: String) = Yakitori.tag("output", emptyArray(), text)


        fun p(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("p", props, children(children))
        fun p(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("p", props, children)
        fun p(props: YakitoriProperties, text: String) = Yakitori.tag("p", props, text)
        fun p(vararg children: YakitoriElement) = Yakitori.tag("p", emptyArray(), children(children))
        fun p(text: String) = Yakitori.tag("p", emptyArray(), text)


        fun param(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("param", props, children(children))
        fun param(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("param", props, children)
        fun param(props: YakitoriProperties, text: String) = Yakitori.tag("param", props, text)
        fun param(vararg children: YakitoriElement) = Yakitori.tag("param", emptyArray(), children(children))
        fun param(text: String) = Yakitori.tag("param", emptyArray(), text)


        fun picture(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("picture", props, children(children))
        fun picture(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("picture", props, children)
        fun picture(props: YakitoriProperties, text: String) = Yakitori.tag("picture", props, text)
        fun picture(vararg children: YakitoriElement) = Yakitori.tag("picture", emptyArray(), children(children))
        fun picture(text: String) = Yakitori.tag("picture", emptyArray(), text)


        fun plaintext(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("plaintext", props, children(children))
        fun plaintext(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("plaintext", props, children)
        fun plaintext(props: YakitoriProperties, text: String) = Yakitori.tag("plaintext", props, text)
        fun plaintext(vararg children: YakitoriElement) = Yakitori.tag("plaintext", emptyArray(), children(children))
        fun plaintext(text: String) = Yakitori.tag("plaintext", emptyArray(), text)


        fun pre(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("pre", props, children(children))
        fun pre(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("pre", props, children)
        fun pre(props: YakitoriProperties, text: String) = Yakitori.tag("pre", props, text)
        fun pre(vararg children: YakitoriElement) = Yakitori.tag("pre", emptyArray(), children(children))
        fun pre(text: String) = Yakitori.tag("pre", emptyArray(), text)


        fun progress(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("progress", props, children(children))
        fun progress(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("progress", props, children)
        fun progress(props: YakitoriProperties, text: String) = Yakitori.tag("progress", props, text)
        fun progress(vararg children: YakitoriElement) = Yakitori.tag("progress", emptyArray(), children(children))
        fun progress(text: String) = Yakitori.tag("progress", emptyArray(), text)


        fun q(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("q", props, children(children))
        fun q(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("q", props, children)
        fun q(props: YakitoriProperties, text: String) = Yakitori.tag("q", props, text)
        fun q(vararg children: YakitoriElement) = Yakitori.tag("q", emptyArray(), children(children))
        fun q(text: String) = Yakitori.tag("q", emptyArray(), text)


        fun rb(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("rb", props, children(children))
        fun rb(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("rb", props, children)
        fun rb(props: YakitoriProperties, text: String) = Yakitori.tag("rb", props, text)
        fun rb(vararg children: YakitoriElement) = Yakitori.tag("rb", emptyArray(), children(children))
        fun rb(text: String) = Yakitori.tag("rb", emptyArray(), text)


        fun rp(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("rp", props, children(children))
        fun rp(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("rp", props, children)
        fun rp(props: YakitoriProperties, text: String) = Yakitori.tag("rp", props, text)
        fun rp(vararg children: YakitoriElement) = Yakitori.tag("rp", emptyArray(), children(children))
        fun rp(text: String) = Yakitori.tag("rp", emptyArray(), text)


        fun rt(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("rt", props, children(children))
        fun rt(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("rt", props, children)
        fun rt(props: YakitoriProperties, text: String) = Yakitori.tag("rt", props, text)
        fun rt(vararg children: YakitoriElement) = Yakitori.tag("rt", emptyArray(), children(children))
        fun rt(text: String) = Yakitori.tag("rt", emptyArray(), text)


        fun rtc(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("rtc", props, children(children))
        fun rtc(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("rtc", props, children)
        fun rtc(props: YakitoriProperties, text: String) = Yakitori.tag("rtc", props, text)
        fun rtc(vararg children: YakitoriElement) = Yakitori.tag("rtc", emptyArray(), children(children))
        fun rtc(text: String) = Yakitori.tag("rtc", emptyArray(), text)


        fun ruby(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("ruby", props, children(children))
        fun ruby(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("ruby", props, children)
        fun ruby(props: YakitoriProperties, text: String) = Yakitori.tag("ruby", props, text)
        fun ruby(vararg children: YakitoriElement) = Yakitori.tag("ruby", emptyArray(), children(children))
        fun ruby(text: String) = Yakitori.tag("ruby", emptyArray(), text)


        fun s(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("s", props, children(children))
        fun s(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("s", props, children)
        fun s(props: YakitoriProperties, text: String) = Yakitori.tag("s", props, text)
        fun s(vararg children: YakitoriElement) = Yakitori.tag("s", emptyArray(), children(children))
        fun s(text: String) = Yakitori.tag("s", emptyArray(), text)


        fun samp(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("samp", props, children(children))
        fun samp(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("samp", props, children)
        fun samp(props: YakitoriProperties, text: String) = Yakitori.tag("samp", props, text)
        fun samp(vararg children: YakitoriElement) = Yakitori.tag("samp", emptyArray(), children(children))
        fun samp(text: String) = Yakitori.tag("samp", emptyArray(), text)


        fun script(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("script", props, children(children))
        fun script(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("script", props, children)
        fun script(props: YakitoriProperties, text: String) = Yakitori.tag("script", props, text)
        fun script(vararg children: YakitoriElement) = Yakitori.tag("script", emptyArray(), children(children))
        fun script(text: String) = Yakitori.tag("script", emptyArray(), text)


        fun section(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("section", props, children(children))
        fun section(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("section", props, children)
        fun section(props: YakitoriProperties, text: String) = Yakitori.tag("section", props, text)
        fun section(vararg children: YakitoriElement) = Yakitori.tag("section", emptyArray(), children(children))
        fun section(text: String) = Yakitori.tag("section", emptyArray(), text)


        fun select(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("select", props, children(children))
        fun select(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("select", props, children)
        fun select(props: YakitoriProperties, text: String) = Yakitori.tag("select", props, text)
        fun select(vararg children: YakitoriElement) = Yakitori.tag("select", emptyArray(), children(children))
        fun select(text: String) = Yakitori.tag("select", emptyArray(), text)


        fun small(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("small", props, children(children))
        fun small(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("small", props, children)
        fun small(props: YakitoriProperties, text: String) = Yakitori.tag("small", props, text)
        fun small(vararg children: YakitoriElement) = Yakitori.tag("small", emptyArray(), children(children))
        fun small(text: String) = Yakitori.tag("small", emptyArray(), text)


        fun source(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("source", props, children(children))
        fun source(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("source", props, children)
        fun source(props: YakitoriProperties, text: String) = Yakitori.tag("source", props, text)
        fun source(vararg children: YakitoriElement) = Yakitori.tag("source", emptyArray(), children(children))
        fun source(text: String) = Yakitori.tag("source", emptyArray(), text)


        fun spacer(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("spacer", props, children(children))
        fun spacer(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("spacer", props, children)
        fun spacer(props: YakitoriProperties, text: String) = Yakitori.tag("spacer", props, text)
        fun spacer(vararg children: YakitoriElement) = Yakitori.tag("spacer", emptyArray(), children(children))
        fun spacer(text: String) = Yakitori.tag("spacer", emptyArray(), text)


        fun span(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("span", props, children(children))
        fun span(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("span", props, children)
        fun span(props: YakitoriProperties, text: String) = Yakitori.tag("span", props, text)
        fun span(vararg children: YakitoriElement) = Yakitori.tag("span", emptyArray(), children(children))
        fun span(text: String) = Yakitori.tag("span", emptyArray(), text)


        fun strike(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("strike", props, children(children))
        fun strike(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("strike", props, children)
        fun strike(props: YakitoriProperties, text: String) = Yakitori.tag("strike", props, text)
        fun strike(vararg children: YakitoriElement) = Yakitori.tag("strike", emptyArray(), children(children))
        fun strike(text: String) = Yakitori.tag("strike", emptyArray(), text)


        fun strong(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("strong", props, children(children))
        fun strong(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("strong", props, children)
        fun strong(props: YakitoriProperties, text: String) = Yakitori.tag("strong", props, text)
        fun strong(vararg children: YakitoriElement) = Yakitori.tag("strong", emptyArray(), children(children))
        fun strong(text: String) = Yakitori.tag("strong", emptyArray(), text)


        fun style(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("style", props, children(children))
        fun style(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("style", props, children)
        fun style(props: YakitoriProperties, text: String) = Yakitori.tag("style", props, text)
        fun style(vararg children: YakitoriElement) = Yakitori.tag("style", emptyArray(), children(children))
        fun style(text: String) = Yakitori.tag("style", emptyArray(), text)


        fun sub(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("sub", props, children(children))
        fun sub(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("sub", props, children)
        fun sub(props: YakitoriProperties, text: String) = Yakitori.tag("sub", props, text)
        fun sub(vararg children: YakitoriElement) = Yakitori.tag("sub", emptyArray(), children(children))
        fun sub(text: String) = Yakitori.tag("sub", emptyArray(), text)


        fun summary(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("summary", props, children(children))
        fun summary(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("summary", props, children)
        fun summary(props: YakitoriProperties, text: String) = Yakitori.tag("summary", props, text)
        fun summary(vararg children: YakitoriElement) = Yakitori.tag("summary", emptyArray(), children(children))
        fun summary(text: String) = Yakitori.tag("summary", emptyArray(), text)


        fun sup(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("sup", props, children(children))
        fun sup(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("sup", props, children)
        fun sup(props: YakitoriProperties, text: String) = Yakitori.tag("sup", props, text)
        fun sup(vararg children: YakitoriElement) = Yakitori.tag("sup", emptyArray(), children(children))
        fun sup(text: String) = Yakitori.tag("sup", emptyArray(), text)


        fun table(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("table", props, children(children))
        fun table(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("table", props, children)
        fun table(props: YakitoriProperties, text: String) = Yakitori.tag("table", props, text)
        fun table(vararg children: YakitoriElement) = Yakitori.tag("table", emptyArray(), children(children))
        fun table(text: String) = Yakitori.tag("table", emptyArray(), text)


        fun tbody(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("tbody", props, children(children))
        fun tbody(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("tbody", props, children)
        fun tbody(props: YakitoriProperties, text: String) = Yakitori.tag("tbody", props, text)
        fun tbody(vararg children: YakitoriElement) = Yakitori.tag("tbody", emptyArray(), children(children))
        fun tbody(text: String) = Yakitori.tag("tbody", emptyArray(), text)


        fun td(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("td", props, children(children))
        fun td(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("td", props, children)
        fun td(props: YakitoriProperties, text: String) = Yakitori.tag("td", props, text)
        fun td(vararg children: YakitoriElement) = Yakitori.tag("td", emptyArray(), children(children))
        fun td(text: String) = Yakitori.tag("td", emptyArray(), text)


        fun template(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("template", props, children(children))
        fun template(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("template", props, children)
        fun template(props: YakitoriProperties, text: String) = Yakitori.tag("template", props, text)
        fun template(vararg children: YakitoriElement) = Yakitori.tag("template", emptyArray(), children(children))
        fun template(text: String) = Yakitori.tag("template", emptyArray(), text)


        fun textarea(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("textarea", props, children(children))
        fun textarea(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("textarea", props, children)
        fun textarea(props: YakitoriProperties, text: String) = Yakitori.tag("textarea", props, text)
        fun textarea(vararg children: YakitoriElement) = Yakitori.tag("textarea", emptyArray(), children(children))
        fun textarea(text: String) = Yakitori.tag("textarea", emptyArray(), text)


        fun tfoot(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("tfoot", props, children(children))
        fun tfoot(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("tfoot", props, children)
        fun tfoot(props: YakitoriProperties, text: String) = Yakitori.tag("tfoot", props, text)
        fun tfoot(vararg children: YakitoriElement) = Yakitori.tag("tfoot", emptyArray(), children(children))
        fun tfoot(text: String) = Yakitori.tag("tfoot", emptyArray(), text)


        fun th(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("th", props, children(children))
        fun th(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("th", props, children)
        fun th(props: YakitoriProperties, text: String) = Yakitori.tag("th", props, text)
        fun th(vararg children: YakitoriElement) = Yakitori.tag("th", emptyArray(), children(children))
        fun th(text: String) = Yakitori.tag("th", emptyArray(), text)


        fun thead(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("thead", props, children(children))
        fun thead(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("thead", props, children)
        fun thead(props: YakitoriProperties, text: String) = Yakitori.tag("thead", props, text)
        fun thead(vararg children: YakitoriElement) = Yakitori.tag("thead", emptyArray(), children(children))
        fun thead(text: String) = Yakitori.tag("thead", emptyArray(), text)


        fun time(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("time", props, children(children))
        fun time(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("time", props, children)
        fun time(props: YakitoriProperties, text: String) = Yakitori.tag("time", props, text)
        fun time(vararg children: YakitoriElement) = Yakitori.tag("time", emptyArray(), children(children))
        fun time(text: String) = Yakitori.tag("time", emptyArray(), text)


        fun title(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("title", props, children(children))
        fun title(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("title", props, children)
        fun title(props: YakitoriProperties, text: String) = Yakitori.tag("title", props, text)
        fun title(vararg children: YakitoriElement) = Yakitori.tag("title", emptyArray(), children(children))
        fun title(text: String) = Yakitori.tag("title", emptyArray(), text)


        fun tr(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("tr", props, children(children))
        fun tr(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("tr", props, children)
        fun tr(props: YakitoriProperties, text: String) = Yakitori.tag("tr", props, text)
        fun tr(vararg children: YakitoriElement) = Yakitori.tag("tr", emptyArray(), children(children))
        fun tr(text: String) = Yakitori.tag("tr", emptyArray(), text)


        fun track(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("track", props, children(children))
        fun track(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("track", props, children)
        fun track(props: YakitoriProperties, text: String) = Yakitori.tag("track", props, text)
        fun track(vararg children: YakitoriElement) = Yakitori.tag("track", emptyArray(), children(children))
        fun track(text: String) = Yakitori.tag("track", emptyArray(), text)


        fun tt(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("tt", props, children(children))
        fun tt(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("tt", props, children)
        fun tt(props: YakitoriProperties, text: String) = Yakitori.tag("tt", props, text)
        fun tt(vararg children: YakitoriElement) = Yakitori.tag("tt", emptyArray(), children(children))
        fun tt(text: String) = Yakitori.tag("tt", emptyArray(), text)


        fun u(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("u", props, children(children))
        fun u(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("u", props, children)
        fun u(props: YakitoriProperties, text: String) = Yakitori.tag("u", props, text)
        fun u(vararg children: YakitoriElement) = Yakitori.tag("u", emptyArray(), children(children))
        fun u(text: String) = Yakitori.tag("u", emptyArray(), text)


        fun ul(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("ul", props, children(children))
        fun ul(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("ul", props, children)
        fun ul(props: YakitoriProperties, text: String) = Yakitori.tag("ul", props, text)
        fun ul(vararg children: YakitoriElement) = Yakitori.tag("ul", emptyArray(), children(children))
        fun ul(text: String) = Yakitori.tag("ul", emptyArray(), text)

        fun video(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("video", props, children(children))
        fun video(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("video", props, children)
        fun video(props: YakitoriProperties, text: String) = Yakitori.tag("video", props, text)
        fun video(vararg children: YakitoriElement) = Yakitori.tag("video", emptyArray(), children(children))
        fun video(text: String) = Yakitori.tag("video", emptyArray(), text)


        fun wbr(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("wbr", props, children(children))
        fun wbr(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("wbr", props, children)
        fun wbr(props: YakitoriProperties, text: String) = Yakitori.tag("wbr", props, text)
        fun wbr(vararg children: YakitoriElement) = Yakitori.tag("wbr", emptyArray(), children(children))
        fun wbr(text: String) = Yakitori.tag("wbr", emptyArray(), text)


        fun xmp(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("xmp", props, children(children))
        fun xmp(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("xmp", props, children)
        fun xmp(props: YakitoriProperties, text: String) = Yakitori.tag("xmp", props, text)
        fun xmp(vararg children: YakitoriElement) = Yakitori.tag("xmp", emptyArray(), children(children))
        fun xmp(text: String) = Yakitori.tag("xmp", emptyArray(), text)


        fun h1(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("h1", props, children(children))
        fun h1(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("h1", props, children)
        fun h1(props: YakitoriProperties, text: String) = Yakitori.tag("h1", props, text)
        fun h1(vararg children: YakitoriElement) = Yakitori.tag("h1", emptyArray(), children(children))
        fun h1(text: String) = Yakitori.tag("h1", emptyArray(), text)


        fun h2(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("h2", props, children(children))
        fun h2(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("h2", props, children)
        fun h2(props: YakitoriProperties, text: String) = Yakitori.tag("h2", props, text)
        fun h2(vararg children: YakitoriElement) = Yakitori.tag("h2", emptyArray(), children(children))
        fun h2(text: String) = Yakitori.tag("h2", emptyArray(), text)


        fun h3(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("h3", props, children(children))
        fun h3(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("h3", props, children)
        fun h3(props: YakitoriProperties, text: String) = Yakitori.tag("h3", props, text)
        fun h3(vararg children: YakitoriElement) = Yakitori.tag("h3", emptyArray(), children(children))
        fun h3(text: String) = Yakitori.tag("h3", emptyArray(), text)


        fun h4(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("h4", props, children(children))
        fun h4(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("h4", props, children)
        fun h4(props: YakitoriProperties, text: String) = Yakitori.tag("h4", props, text)
        fun h4(vararg children: YakitoriElement) = Yakitori.tag("h4", emptyArray(), children(children))
        fun h4(text: String) = Yakitori.tag("h4", emptyArray(), text)


        fun h5(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("h5", props, children(children))
        fun h5(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("h5", props, children)
        fun h5(props: YakitoriProperties, text: String) = Yakitori.tag("h5", props, text)
        fun h5(vararg children: YakitoriElement) = Yakitori.tag("h5", emptyArray(), children(children))
        fun h5(text: String) = Yakitori.tag("h5", emptyArray(), text)


        fun h6(props: YakitoriProperties, vararg children: YakitoriElement) = Yakitori.tag("h6", props, children(children))
        fun h6(props: YakitoriProperties, children: Array<YakitoriElement>) = Yakitori.tag("h6", props, children)
        fun h6(props: YakitoriProperties, text: String) = Yakitori.tag("h6", props, text)
        fun h6(vararg children: YakitoriElement) = Yakitori.tag("h6", emptyArray(), children(children))
        fun h6(text: String) = Yakitori.tag("h6", emptyArray(), text)

    }
}
        