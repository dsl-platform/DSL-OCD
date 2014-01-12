package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableS3sValue2 implements java.io.Serializable {
    public OneSetOfNullableS3sValue2(
            final java.util.Set<com.dslplatform.storage.S3> oneSetOfNullableS3s) {
        setOneSetOfNullableS3s(oneSetOfNullableS3s);
    }

    public OneSetOfNullableS3sValue2() {
        this.oneSetOfNullableS3s = new java.util.HashSet<com.dslplatform.storage.S3>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 823558148;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableS3sValue2)) return false;
        final OneSetOfNullableS3sValue2 other = (OneSetOfNullableS3sValue2) obj;

        if (!(this.oneSetOfNullableS3s.equals(other.oneSetOfNullableS3s)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableS3sValue2(" + oneSetOfNullableS3s + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<com.dslplatform.storage.S3> oneSetOfNullableS3s;

    @JsonProperty("oneSetOfNullableS3s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<com.dslplatform.storage.S3> getOneSetOfNullableS3s() {
        return oneSetOfNullableS3s;
    }

    public OneSetOfNullableS3sValue2 setOneSetOfNullableS3s(
            final java.util.Set<com.dslplatform.storage.S3> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableS3s\" cannot be null!");
        this.oneSetOfNullableS3s = value;

        return this;
    }
}
