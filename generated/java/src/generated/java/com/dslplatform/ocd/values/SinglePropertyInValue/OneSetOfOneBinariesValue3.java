package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneBinariesValue3 implements java.io.Serializable {
    public OneSetOfOneBinariesValue3(
            final java.util.Set<byte[]> oneSetOfOneBinaries) {
        setOneSetOfOneBinaries(oneSetOfOneBinaries);
    }

    public OneSetOfOneBinariesValue3() {
        this.oneSetOfOneBinaries = new java.util.HashSet<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1497761210;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneBinariesValue3)) return false;
        final OneSetOfOneBinariesValue3 other = (OneSetOfOneBinariesValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneSetOfOneBinaries, other.oneSetOfOneBinaries)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneBinariesValue3(" + oneSetOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> oneSetOfOneBinaries;

    @JsonProperty("oneSetOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<byte[]> getOneSetOfOneBinaries() {
        return oneSetOfOneBinaries;
    }

    public OneSetOfOneBinariesValue3 setOneSetOfOneBinaries(
            final java.util.Set<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneBinaries = value;

        return this;
    }
}
