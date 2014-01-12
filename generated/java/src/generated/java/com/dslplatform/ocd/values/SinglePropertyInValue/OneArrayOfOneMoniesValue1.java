package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneMoniesValue1 implements java.io.Serializable {
    public OneArrayOfOneMoniesValue1(
            final java.math.BigDecimal[] oneArrayOfOneMonies) {
        setOneArrayOfOneMonies(oneArrayOfOneMonies);
    }

    public OneArrayOfOneMoniesValue1() {
        this.oneArrayOfOneMonies = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1676550759;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneMoniesValue1)) return false;
        final OneArrayOfOneMoniesValue1 other = (OneArrayOfOneMoniesValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfOneMonies, other.oneArrayOfOneMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneMoniesValue1(" + oneArrayOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfOneMonies;

    @JsonProperty("oneArrayOfOneMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfOneMonies() {
        return oneArrayOfOneMonies;
    }

    public OneArrayOfOneMoniesValue1 setOneArrayOfOneMonies(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneMonies\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneMonies = value;

        this.oneArrayOfOneMonies = com.dslplatform.ocd.values.Guards.setScale(
                this.oneArrayOfOneMonies, 2);
        return this;
    }
}
