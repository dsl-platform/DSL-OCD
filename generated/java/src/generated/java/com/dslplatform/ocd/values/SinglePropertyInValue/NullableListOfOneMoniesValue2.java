package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneMoniesValue2 implements
        java.io.Serializable {
    public NullableListOfOneMoniesValue2(
            final java.util.List<java.math.BigDecimal> nullableListOfOneMonies) {
        setNullableListOfOneMonies(nullableListOfOneMonies);
    }

    public NullableListOfOneMoniesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 69473738;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneMoniesValue2)) return false;
        final NullableListOfOneMoniesValue2 other = (NullableListOfOneMoniesValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableListOfOneMonies, other.nullableListOfOneMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneMoniesValue2(" + nullableListOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfOneMonies;

    @JsonProperty("nullableListOfOneMonies")
    public java.util.List<java.math.BigDecimal> getNullableListOfOneMonies() {
        return nullableListOfOneMonies;
    }

    public NullableListOfOneMoniesValue2 setNullableListOfOneMonies(
            final java.util.List<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneMonies = value;

        this.nullableListOfOneMonies = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableListOfOneMonies, 2);
        return this;
    }
}
