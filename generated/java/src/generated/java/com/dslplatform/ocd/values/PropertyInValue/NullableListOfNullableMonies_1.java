package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableMonies_1 implements
        java.io.Serializable {
    public NullableListOfNullableMonies_1(
            final java.util.List<java.math.BigDecimal> nullableListOfNullableMonies) {
        setNullableListOfNullableMonies(nullableListOfNullableMonies);
    }

    public NullableListOfNullableMonies_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 397598030;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableMonies_1)) return false;
        final NullableListOfNullableMonies_1 other = (NullableListOfNullableMonies_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableListOfNullableMonies,
                other.nullableListOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableMonies_1(" + nullableListOfNullableMonies
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfNullableMonies;

    @JsonProperty("nullableListOfNullableMonies")
    public java.util.List<java.math.BigDecimal> getNullableListOfNullableMonies() {
        return nullableListOfNullableMonies;
    }

    public NullableListOfNullableMonies_1 setNullableListOfNullableMonies(
            final java.util.List<java.math.BigDecimal> value) {
        this.nullableListOfNullableMonies = value;

        this.nullableListOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableListOfNullableMonies, 2);
        return this;
    }
}
