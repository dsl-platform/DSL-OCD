package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneMonies_1 implements java.io.Serializable {
    public OneSetOfOneMonies_1(
            final java.util.Set<java.math.BigDecimal> oneSetOfOneMonies) {
        setOneSetOfOneMonies(oneSetOfOneMonies);
    }

    public OneSetOfOneMonies_1() {
        this.oneSetOfOneMonies = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 716287548;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneMonies_1)) return false;
        final OneSetOfOneMonies_1 other = (OneSetOfOneMonies_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneSetOfOneMonies, other.oneSetOfOneMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneMonies_1(" + oneSetOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfOneMonies;

    @JsonProperty("oneSetOfOneMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfOneMonies() {
        return oneSetOfOneMonies;
    }

    public OneSetOfOneMonies_1 setOneSetOfOneMonies(
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
