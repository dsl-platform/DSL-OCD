package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableFloatsValue4 implements
        java.io.Serializable {
    public OneArrayOfNullableFloatsValue4(
            final Float[] oneArrayOfNullableFloats) {
        setOneArrayOfNullableFloats(oneArrayOfNullableFloats);
    }

    public OneArrayOfNullableFloatsValue4() {
        this.oneArrayOfNullableFloats = new Float[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1346159457;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableFloatsValue4)) return false;
        final OneArrayOfNullableFloatsValue4 other = (OneArrayOfNullableFloatsValue4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableFloats,
                other.oneArrayOfNullableFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableFloatsValue4(" + oneArrayOfNullableFloats
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float[] oneArrayOfNullableFloats;

    @JsonProperty("oneArrayOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Float[] getOneArrayOfNullableFloats() {
        return oneArrayOfNullableFloats;
    }

    public OneArrayOfNullableFloatsValue4 setOneArrayOfNullableFloats(
            final Float[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableFloats\" cannot be null!");
        this.oneArrayOfNullableFloats = value;

        return this;
    }
}
