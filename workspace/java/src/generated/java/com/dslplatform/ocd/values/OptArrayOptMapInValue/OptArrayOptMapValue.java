package com.dslplatform.ocd.values.OptArrayOptMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptMapValue implements java.io.Serializable {
    public OptArrayOptMapValue(
            final java.util.Map<String, String>[] optArrayOptMap) {
        setOptArrayOptMap(optArrayOptMap);
    }

    public OptArrayOptMapValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 909496666;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptMapValue)) return false;
        final OptArrayOptMapValue other = (OptArrayOptMapValue) obj;

        if (!(java.util.Arrays
                .equals(this.optArrayOptMap, other.optArrayOptMap)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptMapValue(" + optArrayOptMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] optArrayOptMap;

    @JsonProperty("optArrayOptMap")
    public java.util.Map<String, String>[] getOptArrayOptMap() {
        return optArrayOptMap;
    }

    public OptArrayOptMapValue setOptArrayOptMap(
            final java.util.Map<String, String>[] value) {
        this.optArrayOptMap = value;

        return this;
    }
}
