package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableMoniesValue2 implements
        java.io.Serializable {
    public NullableSetOfNullableMoniesValue2(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies) {
        setNullableSetOfNullableMonies(nullableSetOfNullableMonies);
    }

    public NullableSetOfNullableMoniesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2099450409;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableMoniesValue2)) return false;
        final NullableSetOfNullableMoniesValue2 other = (NullableSetOfNullableMoniesValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfNullableMonies,
                other.nullableSetOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableMoniesValue2("
                + nullableSetOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies;

    @JsonProperty("nullableSetOfNullableMonies")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableMonies() {
        return nullableSetOfNullableMonies;
    }

    public NullableSetOfNullableMoniesValue2 setNullableSetOfNullableMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        this.nullableSetOfNullableMonies = value;

        this.nullableSetOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableSetOfNullableMonies, 2);
        return this;
    }
}
