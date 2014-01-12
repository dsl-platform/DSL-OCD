package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneS3sValue1 implements java.io.Serializable {
    public OneSetOfOneS3sValue1(
            final java.util.Set<com.dslplatform.storage.S3> oneSetOfOneS3s) {
        setOneSetOfOneS3s(oneSetOfOneS3s);
    }

    public OneSetOfOneS3sValue1() {
        this.oneSetOfOneS3s = new java.util.HashSet<com.dslplatform.storage.S3>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1886602072;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneS3sValue1)) return false;
        final OneSetOfOneS3sValue1 other = (OneSetOfOneS3sValue1) obj;

        if (!(this.oneSetOfOneS3s.equals(other.oneSetOfOneS3s))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneS3sValue1(" + oneSetOfOneS3s + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<com.dslplatform.storage.S3> oneSetOfOneS3s;

    @JsonProperty("oneSetOfOneS3s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<com.dslplatform.storage.S3> getOneSetOfOneS3s() {
        return oneSetOfOneS3s;
    }

    public OneSetOfOneS3sValue1 setOneSetOfOneS3s(
            final java.util.Set<com.dslplatform.storage.S3> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneS3s\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneS3s = value;

        return this;
    }
}
