package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableDoubleValue1 implements java.io.Serializable {
    public NullableDoubleValue1(
            final Double nullableDouble) {
        setNullableDouble(nullableDouble);
    }

    public NullableDoubleValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1954371146;
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

        if (!(obj instanceof NullableDoubleValue1)) return false;
        final NullableDoubleValue1 other = (NullableDoubleValue1) obj;

        if (!(this.nullableDouble == other.nullableDouble || this.nullableDouble != null
                && this.nullableDouble.equals(other.nullableDouble)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDoubleValue1(" + nullableDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double nullableDouble;

    @JsonProperty("nullableDouble")
    public Double getNullableDouble() {
        return nullableDouble;
    }

    public NullableDoubleValue1 setNullableDouble(final Double value) {
        this.nullableDouble = value;

        return this;
    }
}
