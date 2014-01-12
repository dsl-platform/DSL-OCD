package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableFloatValue1 implements java.io.Serializable {
    public NullableFloatValue1(
            final Float nullableFloat) {
        setNullableFloat(nullableFloat);
    }

    public NullableFloatValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 694727489;
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

        if (!(obj instanceof NullableFloatValue1)) return false;
        final NullableFloatValue1 other = (NullableFloatValue1) obj;

        if (!(this.nullableFloat == other.nullableFloat || this.nullableFloat != null
                && this.nullableFloat.equals(other.nullableFloat)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableFloatValue1(" + nullableFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float nullableFloat;

    @JsonProperty("nullableFloat")
    public Float getNullableFloat() {
        return nullableFloat;
    }

    public NullableFloatValue1 setNullableFloat(final Float value) {
        this.nullableFloat = value;

        return this;
    }
}
