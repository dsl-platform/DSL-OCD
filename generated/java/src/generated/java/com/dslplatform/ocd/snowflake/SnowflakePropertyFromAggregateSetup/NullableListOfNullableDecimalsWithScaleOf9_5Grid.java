package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDecimalsWithScaleOf9_5Grid implements
        Identifiable, java.io.Serializable {
    @JsonCreator
    public NullableListOfNullableDecimalsWithScaleOf9_5Grid(
            @JsonProperty("URI") final String URI,
            @JsonProperty("nullableListOfNullableDecimalsWithScaleOf9") final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9) {
        this.URI = URI;
        this.nullableListOfNullableDecimalsWithScaleOf9 = nullableListOfNullableDecimalsWithScaleOf9;
        com.dslplatform.ocd.snowflake.Guards.checkScale(
                nullableListOfNullableDecimalsWithScaleOf9, 9);
    }

    private NullableListOfNullableDecimalsWithScaleOf9_5Grid() {
        this.URI = null;
        this.nullableListOfNullableDecimalsWithScaleOf9 = null;
    }

    private final String URI;

    public String getURI() {
        return this.URI;
    }

    @Override
    public int hashCode() {
        return URI.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;
        final NullableListOfNullableDecimalsWithScaleOf9_5Grid other = (NullableListOfNullableDecimalsWithScaleOf9_5Grid) obj;

        return URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDecimalsWithScaleOf9_5Grid(" + URI + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public static NullableListOfNullableDecimalsWithScaleOf9_5Grid find(
            final String uri) throws java.io.IOException {
        return find(uri, null);
    }

    public static NullableListOfNullableDecimalsWithScaleOf9_5Grid find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableListOfNullableDecimalsWithScaleOf9_5Grid.class,
                            uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_5Grid> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_5Grid> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableListOfNullableDecimalsWithScaleOf9_5Grid.class,
                            uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_5Grid> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_5Grid> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_5Grid> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_5Grid> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(
                            NullableListOfNullableDecimalsWithScaleOf9_5Grid.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_5Grid> search(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_5Grid> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_5Grid> search(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_5Grid> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_5Grid> search(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_5Grid> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableDecimalsWithScaleOf9_5Grid> search(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_5Grid> specification,
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .search(specification, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count() throws java.io.IOException {
        return count(Bootstrap.getLocator());
    }

    public static long count(final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .count(NullableListOfNullableDecimalsWithScaleOf9_5Grid.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_5Grid> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableListOfNullableDecimalsWithScaleOf9_5Grid> specification,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).count(specification).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9;

    public java.util.List<java.math.BigDecimal> getNullableListOfNullableDecimalsWithScaleOf9() {
        return this.nullableListOfNullableDecimalsWithScaleOf9;
    }
}
