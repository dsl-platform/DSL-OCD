package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneInteger_5 implements java.io.Serializable {
    public OneInteger_5(
            final int oneInteger,
            final int calculatedOneInteger,
            final int persistedOneInteger) {
        setOneInteger(oneInteger);
        this.calculatedOneInteger = calculatedOneInteger;
        this.persistedOneInteger = persistedOneInteger;
    }

    public OneInteger_5() {
        this.oneInteger = 0;
        this.calculatedOneInteger = 0;
        this.persistedOneInteger = 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1064573548;
        result = prime * result + (this.oneInteger);
        result = prime * result + (this.calculatedOneInteger);
        result = prime * result + (this.persistedOneInteger);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneInteger_5)) return false;
        final OneInteger_5 other = (OneInteger_5) obj;

        if (!(this.oneInteger == other.oneInteger)) return false;
        if (!(this.calculatedOneInteger == other.calculatedOneInteger))
            return false;
        if (!(this.persistedOneInteger == other.persistedOneInteger))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneInteger_5(" + oneInteger + ',' + calculatedOneInteger + ','
                + persistedOneInteger + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int oneInteger;

    @JsonProperty("oneInteger")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getOneInteger() {
        return oneInteger;
    }

    public OneInteger_5 setOneInteger(final int value) {
        this.oneInteger = value;

        return this;
    }

    private final int calculatedOneInteger;

    public int getCalculatedOneInteger() {
        return this.calculatedOneInteger;
    }

    private final int persistedOneInteger;

    public int getPersistedOneInteger() {
        return this.persistedOneInteger;
    }
}
