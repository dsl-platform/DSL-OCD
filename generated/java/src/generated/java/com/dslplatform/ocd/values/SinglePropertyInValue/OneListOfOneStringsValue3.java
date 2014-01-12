package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneStringsValue3 implements java.io.Serializable {
    public OneListOfOneStringsValue3(
            final java.util.List<String> oneListOfOneStrings) {
        setOneListOfOneStrings(oneListOfOneStrings);
    }

    public OneListOfOneStringsValue3() {
        this.oneListOfOneStrings = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 822616411;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneStringsValue3)) return false;
        final OneListOfOneStringsValue3 other = (OneListOfOneStringsValue3) obj;

        if (!(this.oneListOfOneStrings.equals(other.oneListOfOneStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneStringsValue3(" + oneListOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfOneStrings;

    @JsonProperty("oneListOfOneStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfOneStrings() {
        return oneListOfOneStrings;
    }

    public OneListOfOneStringsValue3 setOneListOfOneStrings(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneStrings\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneStrings = value;

        return this;
    }
}
