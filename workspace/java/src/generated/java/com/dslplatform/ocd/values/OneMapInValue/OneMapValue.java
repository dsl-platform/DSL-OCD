package com.dslplatform.ocd.values.OneMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneMapValue implements java.io.Serializable {
    public OneMapValue(
            final java.util.Map<String, String> oneMap) {
        setOneMap(oneMap);
    }

    public OneMapValue() {
        this.oneMap = new java.util.HashMap<String, String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1099519429;
        result = prime * result
                + (this.oneMap != null ? this.oneMap.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneMapValue)) return false;
        final OneMapValue other = (OneMapValue) obj;

        if (!(this.oneMap != null && this.oneMap.equals(other.oneMap) || this.oneMap == null
                && other.oneMap == null)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneMapValue(" + oneMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String> oneMap;

    @JsonProperty("oneMap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String> getOneMap() {
        return oneMap;
    }

    public OneMapValue setOneMap(final java.util.Map<String, String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneMap\" cannot be null!");
        this.oneMap = value;

        return this;
    }
}
