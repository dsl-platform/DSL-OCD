package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneMoniesValue2 implements java.io.Serializable {
    public NullableSetOfOneMoniesValue2(
            final java.util.Set<java.math.BigDecimal> nullableSetOfOneMonies) {
        setNullableSetOfOneMonies(nullableSetOfOneMonies);
    }

    public NullableSetOfOneMoniesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 820483460;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneMoniesValue2)) return false;
        final NullableSetOfOneMoniesValue2 other = (NullableSetOfOneMoniesValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfOneMonies, other.nullableSetOfOneMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneMoniesValue2(" + nullableSetOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfOneMonies;

    @JsonProperty("nullableSetOfOneMonies")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfOneMonies() {
        return nullableSetOfOneMonies;
    }

    public NullableSetOfOneMoniesValue2 setNullableSetOfOneMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneMonies = value;

        this.nullableSetOfOneMonies = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableSetOfOneMonies, 2);
        return this;
    }
}
