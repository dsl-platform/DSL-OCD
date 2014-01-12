package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneMapsValue4 implements java.io.Serializable {
    public OneListOfOneMapsValue4(
            final java.util.List<java.util.Map<String, String>> oneListOfOneMaps) {
        setOneListOfOneMaps(oneListOfOneMaps);
    }

    public OneListOfOneMapsValue4() {
        this.oneListOfOneMaps = new java.util.ArrayList<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 649133671;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneMapsValue4)) return false;
        final OneListOfOneMapsValue4 other = (OneListOfOneMapsValue4) obj;

        if (!(this.oneListOfOneMaps.equals(other.oneListOfOneMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneMapsValue4(" + oneListOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> oneListOfOneMaps;

    @JsonProperty("oneListOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.Map<String, String>> getOneListOfOneMaps() {
        return oneListOfOneMaps;
    }

    public OneListOfOneMapsValue4 setOneListOfOneMaps(
            final java.util.List<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneMaps = value;

        return this;
    }
}
