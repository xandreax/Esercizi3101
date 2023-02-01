package it.euris.academy2023.portfolio.entities;

import it.euris.academy2023.portfolio.XmlRow;
import it.euris.academy2023.portfolio.XmlTag;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Account {
    private final static String TAG_ACCOUNT = "account";
    private final static String TAG_BALANCES = "account";
    public enum BalanceType{
        DT("Deposito titoli"),
        CC("Conto corrente"),
        DR("Deposito risparmio");

        private String typeString;
        BalanceType(String typeString){
            this.typeString = typeString;
        }

        public String getTypeString() {
            return typeString;
        }
    }

    private final String code;
    private final List<Balance> balances;
    private final BalanceType type;

    public Account(String code, BalanceType type) {
        this.code = code;
        this.type = type;
        this.balances = new ArrayList<>();
    }

    public void addBalance(Balance b){
        balances.add(b);
    }

    public String getCode() {
        return code;
    }

    public List<Balance> getBalances() {
        return balances;
    }

    public BalanceType getType() {
        return type;
    }

    @Override
    public String toString() {
        String s = "";
        s += new XmlRow(TAG_ACCOUNT, mapAccountValues()).render();
        s += new XmlTag(TAG_BALANCES, false);
        for (Balance b: balances) {
            s += b;
        }
        s += new XmlTag(TAG_BALANCES, true);
        s += new XmlTag(TAG_ACCOUNT, true);
        return s;
    }

    private Map<String, Object> mapAccountValues() {
        Map<String, Object> parametersMap = new LinkedHashMap<>();
        parametersMap.put("code", code);
        parametersMap.put("balance_type", type.getTypeString());
        return parametersMap;
    }
}
