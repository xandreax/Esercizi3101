package it.euris.academy2023.portfolio.entities;

import it.euris.academy2023.portfolio.XmlRow;
import it.euris.academy2023.portfolio.XmlTag;

import java.util.LinkedHashMap;
import java.util.Map;

public class Balance {
    private final static String TAG_BALANCE = "balance";
    private final FinancialInstrument financialInstrument;
    private final int totQuotas;

    public Balance(FinancialInstrument financialInstrument, int totQuotas) {
        this.financialInstrument = financialInstrument;
        this.totQuotas = totQuotas;
    }

    public FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }

    public int getTotQuotas() {
        return totQuotas;
    }

    @Override
    public String toString() {
        String s = "";
        s += new XmlRow(TAG_BALANCE, mapBalanceValues()).render();
        s += financialInstrument;
        s += new XmlTag(TAG_BALANCE, true);
        return s;
    }

    private Map<String, Object> mapBalanceValues() {
        Map<String, Object> parametersMap = new LinkedHashMap<>();
        parametersMap.put("num_quote", totQuotas);
        return parametersMap;
    }
}
