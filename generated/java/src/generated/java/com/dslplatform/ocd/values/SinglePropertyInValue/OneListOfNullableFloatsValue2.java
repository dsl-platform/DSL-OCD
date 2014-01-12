package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableFloatsValue2 implements
        java.io.Serializable {
    public OneListOfNullableFloatsValue2(
            final java.util.List<Float> oneListOfNullableFloats) {
        setOneListOfNullableFloats(oneListOfNullableFloats);
    }

    public OneListOfNullableFloatsValue2() {
        this.oneListOfNullableFloats = new java.util.ArrayList<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 129186944;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableFloatsValue2)) return false;
        final OneListOfNullableFloatsValue2 other = (OneListOfNullableFloatsValue2) obj;

        if (!(this.oneListOfNullableFloats
                .equals(other.oneListOfNullableFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableFloatsValue2(" + oneListOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> oneListOfNullableFloats;

    @JsonProperty("oneListOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Float> getOneListOfNullableFloats() {
        return oneListOfNullableFloats;
    }

    public OneListOfNullableFloatsValue2 setOneListOfNullableFloats(
            final java.util.List<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableFloats\" cannot be null!");
        this.oneListOfNullableFloats = value;

        return this;
    }
}
