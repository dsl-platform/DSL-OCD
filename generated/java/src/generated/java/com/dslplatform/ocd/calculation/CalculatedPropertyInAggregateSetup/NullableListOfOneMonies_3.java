package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableListOfOneMonies_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableListOfOneMonies_3() {
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
        final NullableListOfOneMonies_3 other = (NullableListOfOneMonies_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableListOfOneMonies_3(" + URI + ')'
                : "new NullableListOfOneMonies_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableListOfOneMonies_3(
            final java.util.List<java.math.BigDecimal> nullableListOfOneMonies) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableListOfOneMonies(nullableListOfOneMonies);
    }

    @JsonCreator
    private NullableListOfOneMonies_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableListOfOneMonies") final java.util.List<java.math.BigDecimal> nullableListOfOneMonies,
            @JsonProperty("calculatedNullableListOfOneMonies") final java.util.List<java.math.BigDecimal> calculatedNullableListOfOneMonies,
            @JsonProperty("persistedNullableListOfOneMonies") final java.util.List<java.math.BigDecimal> persistedNullableListOfOneMonies) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableListOfOneMonies = nullableListOfOneMonies;
        this.calculatedNullableListOfOneMonies = calculatedNullableListOfOneMonies == null
                ? new java.util.ArrayList<java.math.BigDecimal>()
                : calculatedNullableListOfOneMonies;
        this.persistedNullableListOfOneMonies = persistedNullableListOfOneMonies == null
                ? new java.util.ArrayList<java.math.BigDecimal>()
                : persistedNullableListOfOneMonies;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableListOfOneMonies_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableListOfOneMonies_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableListOfOneMonies_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableListOfOneMonies_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfOneMonies_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneMonies_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableListOfOneMonies_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfOneMonies_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneMonies_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableListOfOneMonies_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneMonies_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableListOfOneMonies_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfOneMonies_3> search(
            final Specification<NullableListOfOneMonies_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneMonies_3> search(
            final Specification<NullableListOfOneMonies_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableListOfOneMonies_3> search(
            final Specification<NullableListOfOneMonies_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneMonies_3> search(
            final Specification<NullableListOfOneMonies_3> specification,
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
                    .count(NullableListOfOneMonies_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableListOfOneMonies_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableListOfOneMonies_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneMonies_3 result) {
        this.URI = result.URI;

        this.nullableListOfOneMonies = result.nullableListOfOneMonies;
        this.calculatedNullableListOfOneMonies = result.calculatedNullableListOfOneMonies;
        this.persistedNullableListOfOneMonies = result.persistedNullableListOfOneMonies;
        this.ID = result.ID;
    }

    public NullableListOfOneMonies_3 persist() throws java.io.IOException {
        final NullableListOfOneMonies_3 result;
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

    public NullableListOfOneMonies_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableListOfOneMonies_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.math.BigDecimal> nullableListOfOneMonies;

    @JsonProperty("nullableListOfOneMonies")
    public java.util.List<java.math.BigDecimal> getNullableListOfOneMonies() {
        return nullableListOfOneMonies;
    }

    public NullableListOfOneMonies_3 setNullableListOfOneMonies(
            final java.util.List<java.math.BigDecimal> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneMonies = value;

        this.nullableListOfOneMonies = value == null
                ? null
                : com.dslplatform.ocd.calculation.Guards.setScale(
                        this.nullableListOfOneMonies, 2);
        return this;
    }

    private java.util.List<java.math.BigDecimal> calculatedNullableListOfOneMonies;

    @JsonProperty("calculatedNullableListOfOneMonies")
    public java.util.List<java.math.BigDecimal> getCalculatedNullableListOfOneMonies() {
        return this.calculatedNullableListOfOneMonies;
    }

    private java.util.List<java.math.BigDecimal> persistedNullableListOfOneMonies;

    @JsonProperty("persistedNullableListOfOneMonies")
    public java.util.List<java.math.BigDecimal> getPersistedNullableListOfOneMonies() {
        return this.persistedNullableListOfOneMonies;
    }
}
