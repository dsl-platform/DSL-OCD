package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableFloatsValue3 implements
        java.io.Serializable {
    public OneArrayOfNullableFloatsValue3(
            final Float[] oneArrayOfNullableFloats) {
        setOneArrayOfNullableFloats(oneArrayOfNullableFloats);
    }

    public OneArrayOfNullableFloatsValue3() {
        this.oneArrayOfNullableFloats = new Float[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1026493538;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableFloatsValue3)) return false;
        final OneArrayOfNullableFloatsValue3 other = (OneArrayOfNullableFloatsValue3) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableFloats,
                other.oneArrayOfNullableFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableFloatsValue3(" + oneArrayOfNullableFloats
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float[] oneArrayOfNullableFloats;

    @JsonProperty("oneArrayOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Float[] getOneArrayOfNullableFloats() {
        return oneArrayOfNullableFloats;
    }

    public OneArrayOfNullableFloatsValue3 setOneArrayOfNullableFloats(
            final Float[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableFloats\" cannot be null!");
        this.oneArrayOfNullableFloats = value;

        return this;
    }
}
