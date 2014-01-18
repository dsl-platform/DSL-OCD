package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableListOfNullableGuids_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableListOfNullableGuids_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
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
        final NullableListOfNullableGuids_3 other = (NullableListOfNullableGuids_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableListOfNullableGuids_3(" + URI + ')'
                : "new NullableListOfNullableGuids_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableListOfNullableGuids_3(
            final java.util.List<java.util.UUID> nullableListOfNullableGuids) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableListOfNullableGuids(nullableListOfNullableGuids);
    }

    @JsonCreator
    private NullableListOfNullableGuids_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableListOfNullableGuids") final java.util.List<java.util.UUID> nullableListOfNullableGuids,
            @JsonProperty("calculatedNullableListOfNullableGuids") final java.util.List<java.util.UUID> calculatedNullableListOfNullableGuids,
            @JsonProperty("persistedNullableListOfNullableGuids") final java.util.List<java.util.UUID> persistedNullableListOfNullableGuids) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableListOfNullableGuids = nullableListOfNullableGuids;
        this.calculatedNullableListOfNullableGuids = calculatedNullableListOfNullableGuids == null
                ? new java.util.ArrayList<java.util.UUID>()
                : calculatedNullableListOfNullableGuids;
        this.persistedNullableListOfNullableGuids = persistedNullableListOfNullableGuids == null
                ? new java.util.ArrayList<java.util.UUID>()
                : persistedNullableListOfNullableGuids;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableListOfNullableGuids_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableListOfNullableGuids_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableListOfNullableGuids_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableListOfNullableGuids_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableGuids_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableGuids_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableListOfNullableGuids_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableGuids_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableGuids_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableListOfNullableGuids_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableGuids_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableListOfNullableGuids_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableGuids_3> search(
            final Specification<NullableListOfNullableGuids_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableGuids_3> search(
            final Specification<NullableListOfNullableGuids_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableListOfNullableGuids_3> search(
            final Specification<NullableListOfNullableGuids_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableGuids_3> search(
            final Specification<NullableListOfNullableGuids_3> specification,
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
                    .count(NullableListOfNullableGuids_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableListOfNullableGuids_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableListOfNullableGuids_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableGuids_3 result) {
        this.URI = result.URI;

        this.nullableListOfNullableGuids = result.nullableListOfNullableGuids;
        this.calculatedNullableListOfNullableGuids = result.calculatedNullableListOfNullableGuids;
        this.persistedNullableListOfNullableGuids = result.persistedNullableListOfNullableGuids;
        this.ID = result.ID;
    }

    public NullableListOfNullableGuids_3 persist() throws java.io.IOException {
        final NullableListOfNullableGuids_3 result;
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

    public NullableListOfNullableGuids_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableListOfNullableGuids_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.util.UUID> nullableListOfNullableGuids;

    @JsonProperty("nullableListOfNullableGuids")
    public java.util.List<java.util.UUID> getNullableListOfNullableGuids() {
        return nullableListOfNullableGuids;
    }

    public NullableListOfNullableGuids_3 setNullableListOfNullableGuids(
            final java.util.List<java.util.UUID> value) {
        this.nullableListOfNullableGuids = value;

        return this;
    }

    private java.util.List<java.util.UUID> calculatedNullableListOfNullableGuids;

    @JsonProperty("calculatedNullableListOfNullableGuids")
    public java.util.List<java.util.UUID> getCalculatedNullableListOfNullableGuids() {
        return this.calculatedNullableListOfNullableGuids;
    }

    private java.util.List<java.util.UUID> persistedNullableListOfNullableGuids;

    @JsonProperty("persistedNullableListOfNullableGuids")
    public java.util.List<java.util.UUID> getPersistedNullableListOfNullableGuids() {
        return this.persistedNullableListOfNullableGuids;
    }
}
