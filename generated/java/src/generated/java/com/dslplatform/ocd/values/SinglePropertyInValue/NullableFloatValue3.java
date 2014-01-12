package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableFloatValue3 implements java.io.Serializable {
    public NullableFloatValue3(
            final Float nullableFloat) {
        setNullableFloat(nullableFloat);
    }

    public NullableFloatValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 694727491;
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

        if (!(obj instanceof NullableFloatValue3)) return false;
        final NullableFloatValue3 other = (NullableFloatValue3) obj;

        if (!(this.nullableFloat == other.nullableFloat || this.nullableFloat != null
                && this.nullableFloat.equals(other.nullableFloat)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableFloatValue3(" + nullableFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float nullableFloat;

    @JsonProperty("nullableFloat")
    public Float getNullableFloat() {
        return nullableFloat;
    }

    public NullableFloatValue3 setNullableFloat(final Float value) {
        this.nullableFloat = value;

        return this;
    }
}
