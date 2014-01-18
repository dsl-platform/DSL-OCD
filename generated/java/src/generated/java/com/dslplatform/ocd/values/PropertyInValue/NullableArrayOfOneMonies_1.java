package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneMonies_1 implements java.io.Serializable {
    public NullableArrayOfOneMonies_1(
            final java.math.BigDecimal[] nullableArrayOfOneMonies) {
        setNullableArrayOfOneMonies(nullableArrayOfOneMonies);
    }

    public NullableArrayOfOneMonies_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 473265858;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneMonies_1)) return false;
        final NullableArrayOfOneMonies_1 other = (NullableArrayOfOneMonies_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableArrayOfOneMonies, other.nullableArrayOfOneMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneMonies_1(" + nullableArrayOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfOneMonies;

    @JsonProperty("nullableArrayOfOneMonies")
    public java.math.BigDecimal[] getNullableArrayOfOneMonies() {
        return nullableArrayOfOneMonies;
    }

    public NullableArrayOfOneMonies_1 setNullableArrayOfOneMonies(
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
