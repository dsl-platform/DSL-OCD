package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneString_5 implements java.io.Serializable {
    public OneString_5(
            final String oneString,
            final String calculatedOneString,
            final String persistedOneString) {
        setOneString(oneString);
        this.calculatedOneString = calculatedOneString;
        this.persistedOneString = persistedOneString;
    }

    public OneString_5() {
        this.oneString = "";
        this.calculatedOneString = "";
        this.persistedOneString = "";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1053748519;
        result = prime * result
                + (this.oneString != null ? this.oneString.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneString != null ? this.calculatedOneString
                        .hashCode() : 0);
        result = prime
                * result
                + (this.persistedOneString != null ? this.persistedOneString
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneString_5)) return false;
        final OneString_5 other = (OneString_5) obj;

        if (!(this.oneString.equals(other.oneString))) return false;
        if (!(this.calculatedOneString.equals(other.calculatedOneString)))
            return false;
        if (!(this.persistedOneString.equals(other.persistedOneString)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneString_5(" + oneString + ',' + calculatedOneString + ','
                + persistedOneString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String oneString;

    @JsonProperty("oneString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String getOneString() {
        return oneString;
    }

    public OneString_5 setOneString(final String value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneString\" cannot be null!");
        this.oneString = value;

        return this;
    }

    private final String calculatedOneString;

    public String getCalculatedOneString() {
        return this.calculatedOneString;
    }

    private final String persistedOneString;

    public String getPersistedOneString() {
        return this.persistedOneString;
    }
}
