package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableMoniesValue1 implements
        java.io.Serializable {
    public NullableSetOfNullableMoniesValue1(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies) {
        setNullableSetOfNullableMonies(nullableSetOfNullableMonies);
    }

    public NullableSetOfNullableMoniesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2099450408;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableMoniesValue1)) return false;
        final NullableSetOfNullableMoniesValue1 other = (NullableSetOfNullableMoniesValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfNullableMonies,
                other.nullableSetOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableMoniesValue1("
                + nullableSetOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies;

    @JsonProperty("nullableSetOfNullableMonies")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableMonies() {
        return nullableSetOfNullableMonies;
    }

    public NullableSetOfNullableMoniesValue1 setNullableSetOfNullableMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        this.nullableSetOfNullableMonies = value;

        this.nullableSetOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableSetOfNullableMonies, 2);
        return this;
    }
}
