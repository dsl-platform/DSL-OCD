package com.dslplatform.ocd.values.OptArrayOptStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptStringValue implements java.io.Serializable {
    public OptArrayOptStringValue(
            final String[] optArrayOptString) {
        setOptArrayOptString(optArrayOptString);
    }

    public OptArrayOptStringValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1376524851;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptStringValue)) return false;
        final OptArrayOptStringValue other = (OptArrayOptStringValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayOptString,
                other.optArrayOptString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptStringValue(" + optArrayOptString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] optArrayOptString;

    @JsonProperty("optArrayOptString")
    public String[] getOptArrayOptString() {
        return optArrayOptString;
    }

    public OptArrayOptStringValue setOptArrayOptString(final String[] value) {
        this.optArrayOptString = value;

        return this;
    }
}
