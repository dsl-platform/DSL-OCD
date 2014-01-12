package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableMapsValue1 implements java.io.Serializable {
    public OneListOfNullableMapsValue1(
            final java.util.List<java.util.Map<String, String>> oneListOfNullableMaps) {
        setOneListOfNullableMaps(oneListOfNullableMaps);
    }

    public OneListOfNullableMapsValue1() {
        this.oneListOfNullableMaps = new java.util.ArrayList<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1552057419;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableMapsValue1)) return false;
        final OneListOfNullableMapsValue1 other = (OneListOfNullableMapsValue1) obj;

        if (!(this.oneListOfNullableMaps.equals(other.oneListOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableMapsValue1(" + oneListOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> oneListOfNullableMaps;

    @JsonProperty("oneListOfNullableMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.Map<String, String>> getOneListOfNullableMaps() {
        return oneListOfNullableMaps;
    }

    public OneListOfNullableMapsValue1 setOneListOfNullableMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableMaps\" cannot be null!");
        this.oneListOfNullableMaps = value;

        return this;
    }
}
