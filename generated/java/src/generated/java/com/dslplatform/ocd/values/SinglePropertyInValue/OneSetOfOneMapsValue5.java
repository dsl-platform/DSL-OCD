package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneMapsValue5 implements java.io.Serializable {
    public OneSetOfOneMapsValue5(
            final java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps) {
        setOneSetOfOneMaps(oneSetOfOneMaps);
    }

    public OneSetOfOneMapsValue5() {
        this.oneSetOfOneMaps = new java.util.HashSet<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1780008026;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneMapsValue5)) return false;
        final OneSetOfOneMapsValue5 other = (OneSetOfOneMapsValue5) obj;

        if (!(this.oneSetOfOneMaps.equals(other.oneSetOfOneMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneMapsValue5(" + oneSetOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps;

    @JsonProperty("oneSetOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.Map<String, String>> getOneSetOfOneMaps() {
        return oneSetOfOneMaps;
    }

    public OneSetOfOneMapsValue5 setOneSetOfOneMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneMaps = value;

        return this;
    }
}
