package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableMoniesValue1 implements
        java.io.Serializable {
    public NullableListOfNullableMoniesValue1(
            final java.util.List<java.math.BigDecimal> nullableListOfNullableMonies) {
        setNullableListOfNullableMonies(nullableListOfNullableMonies);
    }

    public NullableListOfNullableMoniesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 649334386;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableMoniesValue1)) return false;
        final NullableListOfNullableMoniesValue1 other = (NullableListOfNullableMoniesValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableListOfNullableMonies,
                other.nullableListOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableMoniesValue1("
                + nullableListOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfNullableMonies;

    @JsonProperty("nullableListOfNullableMonies")
    public java.util.List<java.math.BigDecimal> getNullableListOfNullableMonies() {
        return nullableListOfNullableMonies;
    }

    public NullableListOfNullableMoniesValue1 setNullableListOfNullableMonies(
            final java.util.List<java.math.BigDecimal> value) {
        this.nullableListOfNullableMonies = value;

        this.nullableListOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableListOfNullableMonies, 2);
        return this;
    }
}
