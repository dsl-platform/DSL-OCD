package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableMapsValue6 implements java.io.Serializable {
    public OneSetOfNullableMapsValue6(
            final java.util.Set<java.util.Map<String, String>> oneSetOfNullableMaps) {
        setOneSetOfNullableMaps(oneSetOfNullableMaps);
    }

    public OneSetOfNullableMapsValue6() {
        this.oneSetOfNullableMaps = new java.util.HashSet<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1659622564;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableMapsValue6)) return false;
        final OneSetOfNullableMapsValue6 other = (OneSetOfNullableMapsValue6) obj;

        if (!(this.oneSetOfNullableMaps.equals(other.oneSetOfNullableMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableMapsValue6(" + oneSetOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> oneSetOfNullableMaps;

    @JsonProperty("oneSetOfNullableMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.Map<String, String>> getOneSetOfNullableMaps() {
        return oneSetOfNullableMaps;
    }

    public OneSetOfNullableMapsValue6 setOneSetOfNullableMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableMaps\" cannot be null!");
        this.oneSetOfNullableMaps = value;

        return this;
    }
}
