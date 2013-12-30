package com.dslplatform.ocd.values.OptSetOptMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptMapValue implements java.io.Serializable {
    public OptSetOptMapValue(
            final java.util.Set<java.util.Map<String, String>> optSetOptMap) {
        setOptSetOptMap(optSetOptMap);
    }

    public OptSetOptMapValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 560617131;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptMapValue)) return false;
        final OptSetOptMapValue other = (OptSetOptMapValue) obj;

        if (!(this.optSetOptMap == other.optSetOptMap || this.optSetOptMap != null
                && this.optSetOptMap.equals(other.optSetOptMap))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptMapValue(" + optSetOptMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> optSetOptMap;

    @JsonProperty("optSetOptMap")
    public java.util.Set<java.util.Map<String, String>> getOptSetOptMap() {
        return optSetOptMap;
    }

    public OptSetOptMapValue setOptSetOptMap(
            final java.util.Set<java.util.Map<String, String>> value) {
        this.optSetOptMap = value;

        return this;
    }
}
