package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableFloatValue2 implements java.io.Serializable {
    public NullableFloatValue2(
            final Float nullableFloat) {
        setNullableFloat(nullableFloat);
    }

    public NullableFloatValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 694727490;
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

        if (!(obj instanceof NullableFloatValue2)) return false;
        final NullableFloatValue2 other = (NullableFloatValue2) obj;

        if (!(this.nullableFloat == other.nullableFloat || this.nullableFloat != null
                && this.nullableFloat.equals(other.nullableFloat)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableFloatValue2(" + nullableFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float nullableFloat;

    @JsonProperty("nullableFloat")
    public Float getNullableFloat() {
        return nullableFloat;
    }

    public NullableFloatValue2 setNullableFloat(final Float value) {
        this.nullableFloat = value;

        return this;
    }
}
