package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableMapsValue3 implements java.io.Serializable {
    public OneListOfNullableMapsValue3(
            final java.util.List<java.util.Map<String, String>> oneListOfNullableMaps) {
        setOneListOfNullableMaps(oneListOfNullableMaps);
    }

    public OneListOfNullableMapsValue3() {
        this.oneListOfNullableMaps = new java.util.ArrayList<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1552057421;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableMapsValue3)) return false;
        final OneListOfNullableMapsValue3 other = (OneListOfNullableMapsValue3) obj;

        if (!(this.oneListOfNullableMaps.equals(other.oneListOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableMapsValue3(" + oneListOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> oneListOfNullableMaps;

    @JsonProperty("oneListOfNullableMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.Map<String, String>> getOneListOfNullableMaps() {
        return oneListOfNullableMaps;
    }

    public OneListOfNullableMapsValue3 setOneListOfNullableMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableMaps\" cannot be null!");
        this.oneListOfNullableMaps = value;

        return this;
    }
}
