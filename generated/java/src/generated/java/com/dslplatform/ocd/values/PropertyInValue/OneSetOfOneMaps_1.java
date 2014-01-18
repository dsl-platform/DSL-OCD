package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneMaps_1 implements java.io.Serializable {
    public OneSetOfOneMaps_1(
            final java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps) {
        setOneSetOfOneMaps(oneSetOfOneMaps);
    }

    public OneSetOfOneMaps_1() {
        this.oneSetOfOneMaps = new java.util.HashSet<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 794839190;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneMaps_1)) return false;
        final OneSetOfOneMaps_1 other = (OneSetOfOneMaps_1) obj;

        if (!(this.oneSetOfOneMaps.equals(other.oneSetOfOneMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneMaps_1(" + oneSetOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps;

    @JsonProperty("oneSetOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.Map<String, String>> getOneSetOfOneMaps() {
        return oneSetOfOneMaps;
    }

    public OneSetOfOneMaps_1 setOneSetOfOneMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneMaps = value;

        return this;
    }
}
