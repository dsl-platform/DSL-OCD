package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneS3sValue2 implements java.io.Serializable {
    public OneListOfOneS3sValue2(
            final java.util.List<com.dslplatform.storage.S3> oneListOfOneS3s) {
        setOneListOfOneS3s(oneListOfOneS3s);
    }

    public OneListOfOneS3sValue2() {
        this.oneListOfOneS3s = new java.util.ArrayList<com.dslplatform.storage.S3>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1550739315;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneS3sValue2)) return false;
        final OneListOfOneS3sValue2 other = (OneListOfOneS3sValue2) obj;

        if (!(this.oneListOfOneS3s.equals(other.oneListOfOneS3s)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneS3sValue2(" + oneListOfOneS3s + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<com.dslplatform.storage.S3> oneListOfOneS3s;

    @JsonProperty("oneListOfOneS3s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<com.dslplatform.storage.S3> getOneListOfOneS3s() {
        return oneListOfOneS3s;
    }

    public OneListOfOneS3sValue2 setOneListOfOneS3s(
            final java.util.List<com.dslplatform.storage.S3> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneS3s\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneS3s = value;

        return this;
    }
}
