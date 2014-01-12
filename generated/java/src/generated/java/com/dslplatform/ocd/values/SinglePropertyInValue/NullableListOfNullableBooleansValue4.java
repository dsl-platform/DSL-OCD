package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableBooleansValue4 implements
        java.io.Serializable {
    public NullableListOfNullableBooleansValue4(
            final java.util.List<Boolean> nullableListOfNullableBooleans) {
        setNullableListOfNullableBooleans(nullableListOfNullableBooleans);
    }

    public NullableListOfNullableBooleansValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1270467127;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableBooleansValue4))
            return false;
        final NullableListOfNullableBooleansValue4 other = (NullableListOfNullableBooleansValue4) obj;

        if (!(this.nullableListOfNullableBooleans == other.nullableListOfNullableBooleans || this.nullableListOfNullableBooleans != null
                && this.nullableListOfNullableBooleans
                        .equals(other.nullableListOfNullableBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableBooleansValue4("
                + nullableListOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> nullableListOfNullableBooleans;

    @JsonProperty("nullableListOfNullableBooleans")
    public java.util.List<Boolean> getNullableListOfNullableBooleans() {
        return nullableListOfNullableBooleans;
    }

    public NullableListOfNullableBooleansValue4 setNullableListOfNullableBooleans(
            final java.util.List<Boolean> value) {
        this.nullableListOfNullableBooleans = value;

        return this;
    }
}
