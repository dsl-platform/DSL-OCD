package com.dslplatform.ocd.values.SetMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetMapValue implements java.io.Serializable {
    public SetMapValue(
            final java.util.Set<java.util.Map<String, String>> setMap) {
        setSetMap(setMap);
    }

    public SetMapValue() {
        this.setMap = new java.util.HashSet<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 869972361;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetMapValue)) return false;
        final SetMapValue other = (SetMapValue) obj;

        if (!(this.setMap.equals(other.setMap))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetMapValue(" + setMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> setMap;

    @JsonProperty("setMap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.Map<String, String>> getSetMap() {
        return setMap;
    }

    public SetMapValue setSetMap(
            final java.util.Set<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setMap\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setMap = value;

        return this;
    }
}
