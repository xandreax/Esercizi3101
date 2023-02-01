package it.euris.academy2023.portfolio;

import java.util.Map;

public class XmlRow {
    private final String tag;
    private final Map<String, Object> parameters;

    public XmlRow(String tag, Map<String, Object> parameters) {
        this.tag = tag;
        this.parameters = parameters;
    }

    public String render() {
        String s = "<" + tag;
        for (String key : parameters.keySet()) {
            s += " " + key + "=\"" + parameters.get(key) + "\"";
        }
        s += ">\n";
        return s;
    }
}
