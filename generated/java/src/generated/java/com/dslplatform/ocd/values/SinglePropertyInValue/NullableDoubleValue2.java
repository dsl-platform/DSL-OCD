package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableDoubleValue2 implements java.io.Serializable {
    public NullableDoubleValue2(
            final Double nullableDouble) {
        setNullableDouble(nullableDouble);
    }

    public NullableDoubleValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 774512209;
        result = prime
                * result
                + (this.nullableDouble != null
                        ? this.nullableDouble.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableDoubleValue2)) return false;
        final NullableDoubleValue2 other = (NullableDoubleValue2) obj;

        if (!(this.nullableDouble == other.nullableDouble || this.nullableDouble != null
                && this.nullableDouble.equals(other.nullableDouble)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDoubleValue2(" + nullableDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double nullableDouble;

    @JsonProperty("nullableDouble")
    public Double getNullableDouble() {
        return nullableDouble;
    }

    public NullableDoubleValue2 setNullableDouble(final Double value) {
        this.nullableDouble = value;

        return this;
    }
}
