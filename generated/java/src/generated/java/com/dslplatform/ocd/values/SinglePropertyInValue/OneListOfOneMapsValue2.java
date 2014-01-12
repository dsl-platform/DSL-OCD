package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneMapsValue2 implements java.io.Serializable {
    public OneListOfOneMapsValue2(
            final java.util.List<java.util.Map<String, String>> oneListOfOneMaps) {
        setOneListOfOneMaps(oneListOfOneMaps);
    }

    public OneListOfOneMapsValue2() {
        this.oneListOfOneMaps = new java.util.ArrayList<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 513665743;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneMapsValue2)) return false;
        final OneListOfOneMapsValue2 other = (OneListOfOneMapsValue2) obj;

        if (!(this.oneListOfOneMaps.equals(other.oneListOfOneMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneMapsValue2(" + oneListOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> oneListOfOneMaps;

    @JsonProperty("oneListOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.Map<String, String>> getOneListOfOneMaps() {
        return oneListOfOneMaps;
    }

    public OneListOfOneMapsValue2 setOneListOfOneMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneMaps = value;

        return this;
    }
}
