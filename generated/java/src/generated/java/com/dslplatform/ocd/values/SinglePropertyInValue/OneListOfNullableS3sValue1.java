package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableS3sValue1 implements java.io.Serializable {
    public OneListOfNullableS3sValue1(
            final java.util.List<com.dslplatform.storage.S3> oneListOfNullableS3s) {
        setOneListOfNullableS3s(oneListOfNullableS3s);
    }

    public OneListOfNullableS3sValue1() {
        this.oneListOfNullableS3s = new java.util.ArrayList<com.dslplatform.storage.S3>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1258013819;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableS3sValue1)) return false;
        final OneListOfNullableS3sValue1 other = (OneListOfNullableS3sValue1) obj;

        if (!(this.oneListOfNullableS3s.equals(other.oneListOfNullableS3s)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableS3sValue1(" + oneListOfNullableS3s + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<com.dslplatform.storage.S3> oneListOfNullableS3s;

    @JsonProperty("oneListOfNullableS3s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<com.dslplatform.storage.S3> getOneListOfNullableS3s() {
        return oneListOfNullableS3s;
    }

    public OneListOfNullableS3sValue1 setOneListOfNullableS3s(
            final java.util.List<com.dslplatform.storage.S3> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableS3s\" cannot be null!");
        this.oneListOfNullableS3s = value;

        return this;
    }
}
