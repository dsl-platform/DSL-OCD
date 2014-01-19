package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOneGuids_6 implements java.io.Serializable, AggregateRoot {
    public OneSetOfOneGuids_6() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOneGuids = new java.util.HashSet<java.util.UUID>();
    }

    private transient final ServiceLocator _serviceLocator;
    private transient final DomainProxy _domainProxy;
    private transient final CrudProxy _crudProxy;

    private String URI;

    @JsonProperty("URI")
    public String getURI() {
        return this.URI;
    }

    @Override
    public int hashCode() {
        return URI != null ? URI.hashCode() : super.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;
        final OneSetOfOneGuids_6 other = (OneSetOfOneGuids_6) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfOneGuids_6(" + URI + ')'
                : "new OneSetOfOneGuids_6(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOneGuids_6(
            final java.util.Set<java.util.UUID> oneSetOfOneGuids) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOneGuids(oneSetOfOneGuids);
    }

    @JsonCreator
    private OneSetOfOneGuids_6(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOneGuids") final java.util.Set<java.util.UUID> oneSetOfOneGuids) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOneGuids = oneSetOfOneGuids == null
                ? new java.util.HashSet<java.util.UUID>()
                : oneSetOfOneGuids;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOneGuids_6 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOneGuids_6 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOneGuids_6 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfOneGuids_6.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneGuids_6> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneGuids_6> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOneGuids_6.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneGuids_6> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneGuids_6> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOneGuids_6> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneGuids_6> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOneGuids_6.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneGuids_6> search(
            final Specification<OneSetOfOneGuids_6> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneGuids_6> search(
            final Specification<OneSetOfOneGuids_6> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOneGuids_6> search(
            final Specification<OneSetOfOneGuids_6> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneGuids_6> search(
            final Specification<OneSetOfOneGuids_6> specification,
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
                    .resolve(DomainProxy.class).count(OneSetOfOneGuids_6.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfOneGuids_6> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOneGuids_6> specification,
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

    private void updateWithAnother(
            final com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneGuids_6 result) {
        this.URI = result.URI;

        this.oneSetOfOneGuids = result.oneSetOfOneGuids;
        this.ID = result.ID;
    }

    public OneSetOfOneGuids_6 persist() throws java.io.IOException {
        final OneSetOfOneGuids_6 result;
        try {
            result = this.URI == null
                    ? _crudProxy.create(this).get()
                    : _crudProxy.update(this).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
        this.updateWithAnother(result);
        return this;
    }

    public OneSetOfOneGuids_6 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfOneGuids_6.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.util.UUID> oneSetOfOneGuids;

    @JsonProperty("oneSetOfOneGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.UUID> getOneSetOfOneGuids() {
        return oneSetOfOneGuids;
    }

    public OneSetOfOneGuids_6 setOneSetOfOneGuids(
            final java.util.Set<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneGuids\" cannot be null!");
        com.dslplatform.ocd.snowflake.Guards.checkNulls(value);
        this.oneSetOfOneGuids = value;

        return this;
    }
}
