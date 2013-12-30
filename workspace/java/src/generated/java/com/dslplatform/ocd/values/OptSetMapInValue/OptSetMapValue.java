package com.dslplatform.ocd.values.OptSetMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetMapValue implements java.io.Serializable {
    public OptSetMapValue(
            final java.util.Set<java.util.Map<String, String>> optSetMap) {
        setOptSetMap(optSetMap);
    }

    public OptSetMapValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1055905934;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetMapValue)) return false;
        final OptSetMapValue other = (OptSetMapValue) obj;

        if (!(this.optSetMap == other.optSetMap || this.optSetMap != null
                && this.optSetMap.equals(other.optSetMap))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetMapValue(" + optSetMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> optSetMap;

    @JsonProperty("optSetMap")
    public java.util.Set<java.util.Map<String, String>> getOptSetMap() {
        return optSetMap;
    }

    public OptSetMapValue setOptSetMap(
            final java.util.Set<java.util.Map<String, String>> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetMap = value;

        return this;
    }
}
