package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableBooleansValue6 implements
        java.io.Serializable {
    public NullableSetOfNullableBooleansValue6(
            final java.util.Set<Boolean> nullableSetOfNullableBooleans) {
        setNullableSetOfNullableBooleans(nullableSetOfNullableBooleans);
    }

    public NullableSetOfNullableBooleansValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 899819081;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableBooleansValue6))
            return false;
        final NullableSetOfNullableBooleansValue6 other = (NullableSetOfNullableBooleansValue6) obj;

        if (!(this.nullableSetOfNullableBooleans == other.nullableSetOfNullableBooleans || this.nullableSetOfNullableBooleans != null
                && this.nullableSetOfNullableBooleans
                        .equals(other.nullableSetOfNullableBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableBooleansValue6("
                + nullableSetOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> nullableSetOfNullableBooleans;

    @JsonProperty("nullableSetOfNullableBooleans")
    public java.util.Set<Boolean> getNullableSetOfNullableBooleans() {
        return nullableSetOfNullableBooleans;
    }

    public NullableSetOfNullableBooleansValue6 setNullableSetOfNullableBooleans(
            final java.util.Set<Boolean> value) {
        this.nullableSetOfNullableBooleans = value;

        return this;
    }
}
