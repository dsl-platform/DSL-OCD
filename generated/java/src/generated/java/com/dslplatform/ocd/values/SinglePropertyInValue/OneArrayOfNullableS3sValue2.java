package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableS3sValue2 implements java.io.Serializable {
    public OneArrayOfNullableS3sValue2(
            final com.dslplatform.storage.S3[] oneArrayOfNullableS3s) {
        setOneArrayOfNullableS3s(oneArrayOfNullableS3s);
    }

    public OneArrayOfNullableS3sValue2() {
        this.oneArrayOfNullableS3s = new com.dslplatform.storage.S3[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 681486365;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableS3sValue2)) return false;
        final OneArrayOfNullableS3sValue2 other = (OneArrayOfNullableS3sValue2) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableS3s,
                other.oneArrayOfNullableS3s))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableS3sValue2(" + oneArrayOfNullableS3s + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private com.dslplatform.storage.S3[] oneArrayOfNullableS3s;

    @JsonProperty("oneArrayOfNullableS3s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public com.dslplatform.storage.S3[] getOneArrayOfNullableS3s() {
        return oneArrayOfNullableS3s;
    }

    public OneArrayOfNullableS3sValue2 setOneArrayOfNullableS3s(
            final com.dslplatform.storage.S3[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableS3s\" cannot be null!");
        this.oneArrayOfNullableS3s = value;

        return this;
    }
}
