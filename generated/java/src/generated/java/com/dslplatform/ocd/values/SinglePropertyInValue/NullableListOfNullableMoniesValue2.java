package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableMoniesValue2 implements
        java.io.Serializable {
    public NullableListOfNullableMoniesValue2(
            final java.util.List<java.math.BigDecimal> nullableListOfNullableMonies) {
        setNullableListOfNullableMonies(nullableListOfNullableMonies);
    }

    public NullableListOfNullableMoniesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 916749555;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableMoniesValue2)) return false;
        final NullableListOfNullableMoniesValue2 other = (NullableListOfNullableMoniesValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableListOfNullableMonies,
                other.nullableListOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableMoniesValue2("
                + nullableListOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfNullableMonies;

    @JsonProperty("nullableListOfNullableMonies")
    public java.util.List<java.math.BigDecimal> getNullableListOfNullableMonies() {
        return nullableListOfNullableMonies;
    }

    public NullableListOfNullableMoniesValue2 setNullableListOfNullableMonies(
            final java.util.List<java.math.BigDecimal> value) {
        this.nullableListOfNullableMonies = value;

        this.nullableListOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableListOfNullableMonies, 2);
        return this;
    }
}
