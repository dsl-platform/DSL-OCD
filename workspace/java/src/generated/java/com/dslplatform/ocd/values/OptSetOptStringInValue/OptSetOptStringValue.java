package com.dslplatform.ocd.values.OptSetOptStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptStringValue implements java.io.Serializable {
    public OptSetOptStringValue(
            final java.util.Set<String> optSetOptString) {
        setOptSetOptString(optSetOptString);
    }

    public OptSetOptStringValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 799526744;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptStringValue)) return false;
        final OptSetOptStringValue other = (OptSetOptStringValue) obj;

        if (!(this.optSetOptString == other.optSetOptString || this.optSetOptString != null
                && this.optSetOptString.equals(other.optSetOptString)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptStringValue(" + optSetOptString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> optSetOptString;

    @JsonProperty("optSetOptString")
    public java.util.Set<String> getOptSetOptString() {
        return optSetOptString;
    }

    public OptSetOptStringValue setOptSetOptString(
            final java.util.Set<String> value) {
        this.optSetOptString = value;

        return this;
    }
}
