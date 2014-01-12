package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneStringValue3 implements java.io.Serializable {
    public OneStringValue3(
            final String oneString) {
        setOneString(oneString);
    }

    public OneStringValue3() {
        this.oneString = "";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 961499111;
        result = prime * result
                + (this.oneString != null ? this.oneString.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneStringValue3)) return false;
        final OneStringValue3 other = (OneStringValue3) obj;

        if (!(this.oneString.equals(other.oneString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneStringValue3(" + oneString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String oneString;

    @JsonProperty("oneString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String getOneString() {
        return oneString;
    }

    public OneStringValue3 setOneString(final String value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneString\" cannot be null!");
        this.oneString = value;

        return this;
    }
}
