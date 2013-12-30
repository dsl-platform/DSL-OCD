package com.dslplatform.ocd.values.OptMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptMapValue implements java.io.Serializable {
    public OptMapValue(
            final java.util.Map<String, String> optMap) {
        setOptMap(optMap);
    }

    public OptMapValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1015202516;
        result = prime * result
                + (this.optMap != null ? this.optMap.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptMapValue)) return false;
        final OptMapValue other = (OptMapValue) obj;

        if (!(this.optMap != null && this.optMap.equals(other.optMap) || this.optMap == null
                && other.optMap == null)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptMapValue(" + optMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String> optMap;

    @JsonProperty("optMap")
    public java.util.Map<String, String> getOptMap() {
        return optMap;
    }

    public OptMapValue setOptMap(final java.util.Map<String, String> value) {
        this.optMap = value;

        return this;
    }
}
