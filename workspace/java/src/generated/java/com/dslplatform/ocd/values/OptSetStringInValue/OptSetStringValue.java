package com.dslplatform.ocd.values.OptSetStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetStringValue implements java.io.Serializable {
    public OptSetStringValue(
            final java.util.Set<String> optSetString) {
        setOptSetString(optSetString);
    }

    public OptSetStringValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1023390985;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetStringValue)) return false;
        final OptSetStringValue other = (OptSetStringValue) obj;

        if (!(this.optSetString == other.optSetString || this.optSetString != null
                && this.optSetString.equals(other.optSetString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetStringValue(" + optSetString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> optSetString;

    @JsonProperty("optSetString")
    public java.util.Set<String> getOptSetString() {
        return optSetString;
    }

    public OptSetStringValue setOptSetString(final java.util.Set<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetString = value;

        return this;
    }
}
