package it.euris.academy2023.portfolio;

public class XmlTag {
    private final String tag;
    private final boolean closure;

    public XmlTag(String tag, boolean closure) {
        this.tag = tag;
        this.closure = closure;
    }

    @Override
    public String toString() {
        String s = "<";
        if (closure) {
            s += "/";
        }
        s += tag + ">\n";
        return s;
    }
}
