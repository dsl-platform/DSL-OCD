package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableDouble_1 implements java.io.Serializable {
    public NullableDouble_1(
            final Double nullableDouble) {
        setNullableDouble(nullableDouble);
    }

    public NullableDouble_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1793230734;
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

        if (!(obj instanceof NullableDouble_1)) return false;
        final NullableDouble_1 other = (NullableDouble_1) obj;

        if (!(this.nullableDouble == other.nullableDouble || this.nullableDouble != null
                && this.nullableDouble.equals(other.nullableDouble)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDouble_1(" + nullableDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double nullableDouble;

    @JsonProperty("nullableDouble")
    public Double getNullableDouble() {
        return nullableDouble;
    }

    public NullableDouble_1 setNullableDouble(final Double value) {
        this.nullableDouble = value;

        return this;
    }
}
