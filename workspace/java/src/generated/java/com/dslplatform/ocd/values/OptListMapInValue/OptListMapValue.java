package com.dslplatform.ocd.values.OptListMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListMapValue implements java.io.Serializable {
    public OptListMapValue(
            final java.util.List<java.util.Map<String, String>> optListMap) {
        setOptListMap(optListMap);
    }

    public OptListMapValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1626575788;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListMapValue)) return false;
        final OptListMapValue other = (OptListMapValue) obj;

        if (!(this.optListMap == other.optListMap || this.optListMap != null
                && this.optListMap.equals(other.optListMap))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListMapValue(" + optListMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> optListMap;

    @JsonProperty("optListMap")
    public java.util.List<java.util.Map<String, String>> getOptListMap() {
        return optListMap;
    }

    public OptListMapValue setOptListMap(
            final java.util.List<java.util.Map<String, String>> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListMap = value;

        return this;
    }
}
