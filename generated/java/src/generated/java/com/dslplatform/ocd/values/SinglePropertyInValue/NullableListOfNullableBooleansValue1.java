package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableBooleansValue1 implements
        java.io.Serializable {
    public NullableListOfNullableBooleansValue1(
            final java.util.List<Boolean> nullableListOfNullableBooleans) {
        setNullableListOfNullableBooleans(nullableListOfNullableBooleans);
    }

    public NullableListOfNullableBooleansValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2029982014;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableBooleansValue1))
            return false;
        final NullableListOfNullableBooleansValue1 other = (NullableListOfNullableBooleansValue1) obj;

        if (!(this.nullableListOfNullableBooleans == other.nullableListOfNullableBooleans || this.nullableListOfNullableBooleans != null
                && this.nullableListOfNullableBooleans
                        .equals(other.nullableListOfNullableBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableBooleansValue1("
                + nullableListOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> nullableListOfNullableBooleans;

    @JsonProperty("nullableListOfNullableBooleans")
    public java.util.List<Boolean> getNullableListOfNullableBooleans() {
        return nullableListOfNullableBooleans;
    }

    public NullableListOfNullableBooleansValue1 setNullableListOfNullableBooleans(
            final java.util.List<Boolean> value) {
        this.nullableListOfNullableBooleans = value;

        return this;
    }
}
