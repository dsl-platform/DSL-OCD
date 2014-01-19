package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableBinaries_6Grid implements Identifiable,
        java.io.Serializable {
    @JsonCreator
    public OneArrayOfNullableBinaries_6Grid(
            @JsonProperty("URI") final String URI,
            @JsonProperty("oneArrayOfNullableBinaries") final byte[][] oneArrayOfNullableBinaries) {
        this.URI = URI;
        this.oneArrayOfNullableBinaries = oneArrayOfNullableBinaries;
        if (oneArrayOfNullableBinaries == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableBinaries\" cannot be null!");
    }

    private OneArrayOfNullableBinaries_6Grid() {
        this.URI = null;
        this.oneArrayOfNullableBinaries = null;
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
        final OneArrayOfNullableBinaries_6Grid other = (OneArrayOfNullableBinaries_6Grid) obj;

        return URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableBinaries_6Grid(" + URI + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public static OneArrayOfNullableBinaries_6Grid find(final String uri)
            throws java.io.IOException {
        return find(uri, null);
    }

    public static OneArrayOfNullableBinaries_6Grid find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfNullableBinaries_6Grid.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableBinaries_6Grid> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableBinaries_6Grid> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfNullableBinaries_6Grid.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableBinaries_6Grid> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableBinaries_6Grid> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableBinaries_6Grid> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableBinaries_6Grid> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfNullableBinaries_6Grid.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableBinaries_6Grid> search(
            final Specification<OneArrayOfNullableBinaries_6Grid> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableBinaries_6Grid> search(
            final Specification<OneArrayOfNullableBinaries_6Grid> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableBinaries_6Grid> search(
            final Specification<OneArrayOfNullableBinaries_6Grid> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableBinaries_6Grid> search(
            final Specification<OneArrayOfNullableBinaries_6Grid> specification,
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
                    .count(OneArrayOfNullableBinaries_6Grid.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfNullableBinaries_6Grid> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfNullableBinaries_6Grid> specification,
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

    private final byte[][] oneArrayOfNullableBinaries;

    public byte[][] getOneArrayOfNullableBinaries() {
        return this.oneArrayOfNullableBinaries;
    }
}
