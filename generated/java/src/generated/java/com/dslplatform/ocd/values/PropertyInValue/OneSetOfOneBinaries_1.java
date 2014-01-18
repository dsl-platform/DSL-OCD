package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneBinaries_1 implements java.io.Serializable {
    public OneSetOfOneBinaries_1(
            final java.util.Set<byte[]> oneSetOfOneBinaries) {
        setOneSetOfOneBinaries(oneSetOfOneBinaries);
    }

    public OneSetOfOneBinaries_1() {
        this.oneSetOfOneBinaries = new java.util.HashSet<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 826238284;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneBinaries_1)) return false;
        final OneSetOfOneBinaries_1 other = (OneSetOfOneBinaries_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneSetOfOneBinaries, other.oneSetOfOneBinaries)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneBinaries_1(" + oneSetOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> oneSetOfOneBinaries;

    @JsonProperty("oneSetOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<byte[]> getOneSetOfOneBinaries() {
        return oneSetOfOneBinaries;
    }

    public OneSetOfOneBinaries_1 setOneSetOfOneBinaries(
            final java.util.Set<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneBinaries = value;

        return this;
    }
}
