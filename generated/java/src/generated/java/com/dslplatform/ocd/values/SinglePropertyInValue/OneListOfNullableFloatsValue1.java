package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableFloatsValue1 implements
        java.io.Serializable {
    public OneListOfNullableFloatsValue1(
            final java.util.List<Float> oneListOfNullableFloats) {
        setOneListOfNullableFloats(oneListOfNullableFloats);
    }

    public OneListOfNullableFloatsValue1() {
        this.oneListOfNullableFloats = new java.util.ArrayList<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 129186943;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableFloatsValue1)) return false;
        final OneListOfNullableFloatsValue1 other = (OneListOfNullableFloatsValue1) obj;

        if (!(this.oneListOfNullableFloats
                .equals(other.oneListOfNullableFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableFloatsValue1(" + oneListOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> oneListOfNullableFloats;

    @JsonProperty("oneListOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Float> getOneListOfNullableFloats() {
        return oneListOfNullableFloats;
    }

    public OneListOfNullableFloatsValue1 setOneListOfNullableFloats(
            final java.util.List<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableFloats\" cannot be null!");
        this.oneListOfNullableFloats = value;

        return this;
    }
}
