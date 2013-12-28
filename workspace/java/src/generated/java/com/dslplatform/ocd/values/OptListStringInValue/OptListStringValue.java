package com.dslplatform.ocd.values.OptListStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListStringValue implements java.io.Serializable {
    public OptListStringValue(
            final java.util.List<String> optListString) {
        setOptListString(optListString);
    }

    public OptListStringValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1165282129;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListStringValue)) return false;
        final OptListStringValue other = (OptListStringValue) obj;

        if (!(this.optListString == other.optListString || this.optListString != null
                && this.optListString.equals(other.optListString)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListStringValue(" + optListString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> optListString;

    @JsonProperty("optListString")
    public java.util.List<String> getOptListString() {
        return optListString;
    }

    public OptListStringValue setOptListString(
            final java.util.List<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListString = value;

        return this;
    }
}
