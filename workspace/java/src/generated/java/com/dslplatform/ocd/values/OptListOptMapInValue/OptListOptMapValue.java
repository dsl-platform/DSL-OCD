package com.dslplatform.ocd.values.OptListOptMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptMapValue implements java.io.Serializable {
    public OptListOptMapValue(
            final java.util.List<java.util.Map<String, String>> optListOptMap) {
        setOptListOptMap(optListOptMap);
    }

    public OptListOptMapValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1526377317;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptMapValue)) return false;
        final OptListOptMapValue other = (OptListOptMapValue) obj;

        if (!(this.optListOptMap == other.optListOptMap || this.optListOptMap != null
                && this.optListOptMap.equals(other.optListOptMap)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptMapValue(" + optListOptMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> optListOptMap;

    @JsonProperty("optListOptMap")
    public java.util.List<java.util.Map<String, String>> getOptListOptMap() {
        return optListOptMap;
    }

    public OptListOptMapValue setOptListOptMap(
            final java.util.List<java.util.Map<String, String>> value) {
        this.optListOptMap = value;

        return this;
    }
}
