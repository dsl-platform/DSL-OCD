package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneMaps_1 implements java.io.Serializable {
    public OneArrayOfOneMaps_1(
            final java.util.Map<String, String>[] oneArrayOfOneMaps) {
        setOneArrayOfOneMaps(oneArrayOfOneMaps);
    }

    public OneArrayOfOneMaps_1() {
        this.oneArrayOfOneMaps = (java.util.Map<String, String>[]) java.lang.reflect.Array
                .newInstance(
                        (new java.util.HashMap<String, String>()).getClass(), 0);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 188100081;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneMaps_1)) return false;
        final OneArrayOfOneMaps_1 other = (OneArrayOfOneMaps_1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneMaps,
                other.oneArrayOfOneMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneMaps_1(" + oneArrayOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] oneArrayOfOneMaps;

    @JsonProperty("oneArrayOfOneMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String>[] getOneArrayOfOneMaps() {
        return oneArrayOfOneMaps;
    }

    public OneArrayOfOneMaps_1 setOneArrayOfOneMaps(
            final java.util.Map<String, String>[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneMaps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneMaps = value;

        return this;
    }
}
