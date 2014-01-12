package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneFloatsValue2 implements java.io.Serializable {
    public OneArrayOfOneFloatsValue2(
            final float[] oneArrayOfOneFloats) {
        setOneArrayOfOneFloats(oneArrayOfOneFloats);
    }

    public OneArrayOfOneFloatsValue2() {
        this.oneArrayOfOneFloats = new float[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1601551864;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneFloatsValue2)) return false;
        final OneArrayOfOneFloatsValue2 other = (OneArrayOfOneFloatsValue2) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneFloats,
                other.oneArrayOfOneFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneFloatsValue2(" + oneArrayOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private float[] oneArrayOfOneFloats;

    @JsonProperty("oneArrayOfOneFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public float[] getOneArrayOfOneFloats() {
        return oneArrayOfOneFloats;
    }

    public OneArrayOfOneFloatsValue2 setOneArrayOfOneFloats(final float[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneFloats\" cannot be null!");
        this.oneArrayOfOneFloats = value;

        return this;
    }
}
