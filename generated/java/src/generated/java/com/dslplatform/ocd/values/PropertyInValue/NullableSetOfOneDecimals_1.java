package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDecimals_1 implements java.io.Serializable {
    public NullableSetOfOneDecimals_1(
            final java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimals) {
        setNullableSetOfOneDecimals(nullableSetOfOneDecimals);
    }

    public NullableSetOfOneDecimals_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1292684608;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDecimals_1)) return false;
        final NullableSetOfOneDecimals_1 other = (NullableSetOfOneDecimals_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfOneDecimals, other.nullableSetOfOneDecimals)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDecimals_1(" + nullableSetOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimals;

    @JsonProperty("nullableSetOfOneDecimals")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfOneDecimals() {
        return nullableSetOfOneDecimals;
    }

    public NullableSetOfOneDecimals_1 setNullableSetOfOneDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneDecimals = value;

        return this;
    }
}
