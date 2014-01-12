package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableMoniesValue6 implements
        java.io.Serializable {
    public NullableArrayOfNullableMoniesValue6(
            final java.math.BigDecimal[] nullableArrayOfNullableMonies) {
        setNullableArrayOfNullableMonies(nullableArrayOfNullableMonies);
    }

    public NullableArrayOfNullableMoniesValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 241063812;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableMoniesValue6))
            return false;
        final NullableArrayOfNullableMoniesValue6 other = (NullableArrayOfNullableMoniesValue6) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableArrayOfNullableMonies,
                other.nullableArrayOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableMoniesValue6("
                + nullableArrayOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfNullableMonies;

    @JsonProperty("nullableArrayOfNullableMonies")
    public java.math.BigDecimal[] getNullableArrayOfNullableMonies() {
        return nullableArrayOfNullableMonies;
    }

    public NullableArrayOfNullableMoniesValue6 setNullableArrayOfNullableMonies(
            final java.math.BigDecimal[] value) {
        this.nullableArrayOfNullableMonies = value;

        this.nullableArrayOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableArrayOfNullableMonies, 2);
        return this;
    }
}
