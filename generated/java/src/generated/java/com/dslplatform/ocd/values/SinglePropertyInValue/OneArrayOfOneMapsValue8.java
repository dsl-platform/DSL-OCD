package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneMapsValue8 implements java.io.Serializable {
    public OneArrayOfOneMapsValue8(
            final java.util.Map<String, String>[] oneArrayOfOneMaps) {
        setOneArrayOfOneMaps(oneArrayOfOneMaps);
    }

    @SuppressWarnings("unchecked")
    public OneArrayOfOneMapsValue8() {
        this.oneArrayOfOneMaps = new java.util.Map[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1240123326;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneMapsValue8)) return false;
        final OneArrayOfOneMapsValue8 other = (OneArrayOfOneMapsValue8) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneMaps,
                other.oneArrayOfOneMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneMapsValue8(" + oneArrayOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] oneArrayOfOneMaps;

    @JsonProperty("oneArrayOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String>[] getOneArrayOfOneMaps() {
        return oneArrayOfOneMaps;
    }

    public OneArrayOfOneMapsValue8 setOneArrayOfOneMaps(
            final java.util.Map<String, String>[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneMaps = value;

        return this;
    }
}
