package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDecimals_1 implements java.io.Serializable {
    public NullableListOfOneDecimals_1(
            final java.util.List<java.math.BigDecimal> nullableListOfOneDecimals) {
        setNullableListOfOneDecimals(nullableListOfOneDecimals);
    }

    public NullableListOfOneDecimals_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1821494382;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDecimals_1)) return false;
        final NullableListOfOneDecimals_1 other = (NullableListOfOneDecimals_1) obj;

        if (!(com.dslplatform.ocd.values.Guards
                .compareBigDecimal(this.nullableListOfOneDecimals,
                        other.nullableListOfOneDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDecimals_1(" + nullableListOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfOneDecimals;

    @JsonProperty("nullableListOfOneDecimals")
    public java.util.List<java.math.BigDecimal> getNullableListOfOneDecimals() {
        return nullableListOfOneDecimals;
    }

    public NullableListOfOneDecimals_1 setNullableListOfOneDecimals(
            final java.util.List<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneDecimals = value;

        return this;
    }
}
