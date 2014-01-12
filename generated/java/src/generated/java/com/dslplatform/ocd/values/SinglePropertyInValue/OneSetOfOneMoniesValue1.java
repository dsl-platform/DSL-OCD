package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneMoniesValue1 implements java.io.Serializable {
    public OneSetOfOneMoniesValue1(
            final java.util.Set<java.math.BigDecimal> oneSetOfOneMonies) {
        setOneSetOfOneMonies(oneSetOfOneMonies);
    }

    public OneSetOfOneMoniesValue1() {
        this.oneSetOfOneMonies = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1830538096;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneMoniesValue1)) return false;
        final OneSetOfOneMoniesValue1 other = (OneSetOfOneMoniesValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneSetOfOneMonies, other.oneSetOfOneMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneMoniesValue1(" + oneSetOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfOneMonies;

    @JsonProperty("oneSetOfOneMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfOneMonies() {
        return oneSetOfOneMonies;
    }

    public OneSetOfOneMoniesValue1 setOneSetOfOneMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneMonies\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneMonies = value;

        this.oneSetOfOneMonies = com.dslplatform.ocd.values.Guards.setScale(
                this.oneSetOfOneMonies, 2);
        return this;
    }
}
