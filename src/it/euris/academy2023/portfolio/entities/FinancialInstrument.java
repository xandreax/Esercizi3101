package it.euris.academy2023.portfolio.entities;

import it.euris.academy2023.portfolio.XmlRow;
import it.euris.academy2023.portfolio.XmlTag;

import java.util.LinkedHashMap;
import java.util.Map;

public class FinancialInstrument {
    private final static String TAG_FINANCIAL_INSTRUMENT = "financialInstrument";
    public enum FinancialInstrumentType{
        EQY("Azione"),
        FND("Fondo"),
        BND("Obbligazione"),
        CC("Liquido"),
        POL("Polizza");

        private final String type;

        FinancialInstrumentType(String type) {
            this.type = type;
        }

        public String getTypeString() {
            return type;
        }
    }
    private final String code;
    private final String description;
    private final float lastPrice;
    private final String country;
    private final String currency;
    private final FinancialInstrumentType type;

    public FinancialInstrument(String code, String description, float lastPrice, String country, String currency, FinancialInstrumentType type) {
        this.code = code;
        this.description = description;
        this.lastPrice = lastPrice;
        this.country = country;
        this.currency = currency;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public float getLastPrice() {
        return lastPrice;
    }

    public String getCountry() {
        return country;
    }

    public String getCurrency() {
        return currency;
    }

    public FinancialInstrumentType getType() {
        return type;
    }

    @Override
    public String toString() {
        String s = "";
        s += new XmlRow(TAG_FINANCIAL_INSTRUMENT, mapFinancialInstrumentValues()).render();
        s += new XmlTag(TAG_FINANCIAL_INSTRUMENT, false);
        return s;
    }

    private Map<String, Object> mapFinancialInstrumentValues() {
        Map<String, Object> parametersMap = new LinkedHashMap<>();
        parametersMap.put("code", code);
        parametersMap.put("description", description);
        parametersMap.put("last_price", lastPrice);
        parametersMap.put("country", country);
        parametersMap.put("currency", currency);
        parametersMap.put("type", type.getTypeString());
        return parametersMap;
    }
}
