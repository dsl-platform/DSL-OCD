package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableFloatsValue2 implements
        java.io.Serializable {
    public OneArrayOfNullableFloatsValue2(
            final Float[] oneArrayOfNullableFloats) {
        setOneArrayOfNullableFloats(oneArrayOfNullableFloats);
    }

    public OneArrayOfNullableFloatsValue2() {
        this.oneArrayOfNullableFloats = new Float[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 539590403;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableFloatsValue2)) return false;
        final OneArrayOfNullableFloatsValue2 other = (OneArrayOfNullableFloatsValue2) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableFloats,
                other.oneArrayOfNullableFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableFloatsValue2(" + oneArrayOfNullableFloats
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float[] oneArrayOfNullableFloats;

    @JsonProperty("oneArrayOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Float[] getOneArrayOfNullableFloats() {
        return oneArrayOfNullableFloats;
    }

    public OneArrayOfNullableFloatsValue2 setOneArrayOfNullableFloats(
            final Float[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableFloats\" cannot be null!");
        this.oneArrayOfNullableFloats = value;

        return this;
    }
}
