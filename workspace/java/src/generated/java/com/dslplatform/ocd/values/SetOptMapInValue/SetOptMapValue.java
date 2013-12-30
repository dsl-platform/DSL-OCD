package com.dslplatform.ocd.values.SetOptMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptMapValue implements java.io.Serializable {
    public SetOptMapValue(
            final java.util.Set<java.util.Map<String, String>> setOptMap) {
        setSetOptMap(setOptMap);
    }

    public SetOptMapValue() {
        this.setOptMap = new java.util.HashSet<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1642994348;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptMapValue)) return false;
        final SetOptMapValue other = (SetOptMapValue) obj;

        if (!(this.setOptMap.equals(other.setOptMap))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptMapValue(" + setOptMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> setOptMap;

    @JsonProperty("setOptMap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.Map<String, String>> getSetOptMap() {
        return setOptMap;
    }

    public SetOptMapValue setSetOptMap(
            final java.util.Set<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptMap\" cannot be null!");
        this.setOptMap = value;

        return this;
    }
}
