package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableMonies_1 implements
        java.io.Serializable {
    public NullableSetOfNullableMonies_1(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies) {
        setNullableSetOfNullableMonies(nullableSetOfNullableMonies);
    }

    public NullableSetOfNullableMonies_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 352160660;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableMonies_1)) return false;
        final NullableSetOfNullableMonies_1 other = (NullableSetOfNullableMonies_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfNullableMonies,
                other.nullableSetOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableMonies_1(" + nullableSetOfNullableMonies
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies;

    @JsonProperty("nullableSetOfNullableMonies")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableMonies() {
        return nullableSetOfNullableMonies;
    }

    public NullableSetOfNullableMonies_1 setNullableSetOfNullableMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        this.nullableSetOfNullableMonies = value;

        this.nullableSetOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableSetOfNullableMonies, 2);
        return this;
    }
}
