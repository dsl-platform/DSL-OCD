package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneS3sValue4 implements java.io.Serializable {
    public OneArrayOfOneS3sValue4(
            final com.dslplatform.storage.S3[] oneArrayOfOneS3s) {
        setOneArrayOfOneS3s(oneArrayOfOneS3s);
    }

    public OneArrayOfOneS3sValue4() {
        this.oneArrayOfOneS3s = new com.dslplatform.storage.S3[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 878053470;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneS3sValue4)) return false;
        final OneArrayOfOneS3sValue4 other = (OneArrayOfOneS3sValue4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneS3s,
                other.oneArrayOfOneS3s))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneS3sValue4(" + oneArrayOfOneS3s + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private com.dslplatform.storage.S3[] oneArrayOfOneS3s;

    @JsonProperty("oneArrayOfOneS3s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public com.dslplatform.storage.S3[] getOneArrayOfOneS3s() {
        return oneArrayOfOneS3s;
    }

    public OneArrayOfOneS3sValue4 setOneArrayOfOneS3s(
            final com.dslplatform.storage.S3[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneS3s\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneS3s = value;

        return this;
    }
}
