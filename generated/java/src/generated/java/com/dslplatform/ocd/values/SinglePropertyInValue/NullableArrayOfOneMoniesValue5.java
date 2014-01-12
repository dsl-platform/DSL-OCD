package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneMoniesValue5 implements
        java.io.Serializable {
    public NullableArrayOfOneMoniesValue5(
            final java.math.BigDecimal[] nullableArrayOfOneMonies) {
        setNullableArrayOfOneMonies(nullableArrayOfOneMonies);
    }

    public NullableArrayOfOneMoniesValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2001708626;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneMoniesValue5)) return false;
        final NullableArrayOfOneMoniesValue5 other = (NullableArrayOfOneMoniesValue5) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableArrayOfOneMonies, other.nullableArrayOfOneMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneMoniesValue5(" + nullableArrayOfOneMonies
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfOneMonies;

    @JsonProperty("nullableArrayOfOneMonies")
    public java.math.BigDecimal[] getNullableArrayOfOneMonies() {
        return nullableArrayOfOneMonies;
    }

    public NullableArrayOfOneMoniesValue5 setNullableArrayOfOneMonies(
            final java.math.BigDecimal[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneMonies = value;

        this.nullableArrayOfOneMonies = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableArrayOfOneMonies, 2);
        return this;
    }
}
