package com.dslplatform.ocd.values.OptListOptFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptFloatValue implements java.io.Serializable {
    public OptListOptFloatValue(
            final java.util.List<Float> optListOptFloat) {
        setOptListOptFloat(optListOptFloat);
    }

    public OptListOptFloatValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 55755927;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptFloatValue)) return false;
        final OptListOptFloatValue other = (OptListOptFloatValue) obj;

        if (!(this.optListOptFloat == other.optListOptFloat || this.optListOptFloat != null
                && this.optListOptFloat.equals(other.optListOptFloat)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptFloatValue(" + optListOptFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> optListOptFloat;

    @JsonProperty("optListOptFloat")
    public java.util.List<Float> getOptListOptFloat() {
        return optListOptFloat;
    }

    public OptListOptFloatValue setOptListOptFloat(
            final java.util.List<Float> value) {
        this.optListOptFloat = value;

        return this;
    }
}
