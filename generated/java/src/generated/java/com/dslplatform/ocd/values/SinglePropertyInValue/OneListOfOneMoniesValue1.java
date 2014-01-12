package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneMoniesValue1 implements java.io.Serializable {
    public OneListOfOneMoniesValue1(
            final java.util.List<java.math.BigDecimal> oneListOfOneMonies) {
        setOneListOfOneMonies(oneListOfOneMonies);
    }

    public OneListOfOneMoniesValue1() {
        this.oneListOfOneMonies = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2015657464;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneMoniesValue1)) return false;
        final OneListOfOneMoniesValue1 other = (OneListOfOneMoniesValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneListOfOneMonies, other.oneListOfOneMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneMoniesValue1(" + oneListOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfOneMonies;

    @JsonProperty("oneListOfOneMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfOneMonies() {
        return oneListOfOneMonies;
    }

    public OneListOfOneMoniesValue1 setOneListOfOneMonies(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneMonies\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneMonies = value;

        this.oneListOfOneMonies = com.dslplatform.ocd.values.Guards.setScale(
                this.oneListOfOneMonies, 2);
        return this;
    }
}
