package com.dslplatform.ocd.values.OptSetBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetBoolValue implements java.io.Serializable {
    public OptSetBoolValue(
            final java.util.Set<Boolean> optSetBool) {
        setOptSetBool(optSetBool);
    }

    public OptSetBoolValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1778069122;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetBoolValue)) return false;
        final OptSetBoolValue other = (OptSetBoolValue) obj;

        if (!(this.optSetBool == other.optSetBool || this.optSetBool != null
                && this.optSetBool.equals(other.optSetBool))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetBoolValue(" + optSetBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> optSetBool;

    @JsonProperty("optSetBool")
    public java.util.Set<Boolean> getOptSetBool() {
        return optSetBool;
    }

    public OptSetBoolValue setOptSetBool(final java.util.Set<Boolean> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetBool = value;

        return this;
    }
}
