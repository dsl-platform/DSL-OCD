package com.dslplatform.ocd.values.OptListBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListBoolValue implements java.io.Serializable {
    public OptListBoolValue(
            final java.util.List<Boolean> optListBool) {
        setOptListBool(optListBool);
    }

    public OptListBoolValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 48472372;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListBoolValue)) return false;
        final OptListBoolValue other = (OptListBoolValue) obj;

        if (!(this.optListBool == other.optListBool || this.optListBool != null
                && this.optListBool.equals(other.optListBool))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListBoolValue(" + optListBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> optListBool;

    @JsonProperty("optListBool")
    public java.util.List<Boolean> getOptListBool() {
        return optListBool;
    }

    public OptListBoolValue setOptListBool(final java.util.List<Boolean> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListBool = value;

        return this;
    }
}
