package com.dslplatform.ocd.values.OptArrayMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayMapValue implements java.io.Serializable {
    public OptArrayMapValue(
            final java.util.Map<String, String>[] optArrayMap) {
        setOptArrayMap(optArrayMap);
    }

    public OptArrayMapValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 500782743;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayMapValue)) return false;
        final OptArrayMapValue other = (OptArrayMapValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayMap, other.optArrayMap)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayMapValue(" + optArrayMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] optArrayMap;

    @JsonProperty("optArrayMap")
    public java.util.Map<String, String>[] getOptArrayMap() {
        return optArrayMap;
    }

    public OptArrayMapValue setOptArrayMap(
            final java.util.Map<String, String>[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optArrayMap = value;

        return this;
    }
}
