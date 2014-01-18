package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableFloat_1 implements java.io.Serializable {
    public NullableFloat_1(
            final Float nullableFloat) {
        setNullableFloat(nullableFloat);
    }

    public NullableFloat_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2001755437;
        result = prime
                * result
                + (this.nullableFloat != null
                        ? this.nullableFloat.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableFloat_1)) return false;
        final NullableFloat_1 other = (NullableFloat_1) obj;

        if (!(this.nullableFloat == other.nullableFloat || this.nullableFloat != null
                && this.nullableFloat.equals(other.nullableFloat)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableFloat_1(" + nullableFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float nullableFloat;

    @JsonProperty("nullableFloat")
    public Float getNullableFloat() {
        return nullableFloat;
    }

    public NullableFloat_1 setNullableFloat(final Float value) {
        this.nullableFloat = value;

        return this;
    }
}
