package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfOneXmls_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableSetOfOneXmls_3() {
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
        final NullableSetOfOneXmls_3 other = (NullableSetOfOneXmls_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfOneXmls_3(" + URI + ')'
                : "new NullableSetOfOneXmls_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfOneXmls_3(
            final java.util.Set<org.w3c.dom.Element> nullableSetOfOneXmls) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfOneXmls(nullableSetOfOneXmls);
    }

    @JsonCreator
    private NullableSetOfOneXmls_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfOneXmls") final java.util.Set<org.w3c.dom.Element> nullableSetOfOneXmls,
            @JsonProperty("calculatedNullableSetOfOneXmls") final java.util.Set<org.w3c.dom.Element> calculatedNullableSetOfOneXmls,
            @JsonProperty("persistedNullableSetOfOneXmls") final java.util.Set<org.w3c.dom.Element> persistedNullableSetOfOneXmls) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfOneXmls = nullableSetOfOneXmls;
        this.calculatedNullableSetOfOneXmls = calculatedNullableSetOfOneXmls == null
                ? new java.util.HashSet<org.w3c.dom.Element>()
                : calculatedNullableSetOfOneXmls;
        this.persistedNullableSetOfOneXmls = persistedNullableSetOfOneXmls == null
                ? new java.util.HashSet<org.w3c.dom.Element>()
                : persistedNullableSetOfOneXmls;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfOneXmls_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfOneXmls_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfOneXmls_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfOneXmls_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneXmls_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneXmls_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfOneXmls_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneXmls_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneXmls_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfOneXmls_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneXmls_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfOneXmls_3.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneXmls_3> search(
            final Specification<NullableSetOfOneXmls_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneXmls_3> search(
            final Specification<NullableSetOfOneXmls_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfOneXmls_3> search(
            final Specification<NullableSetOfOneXmls_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneXmls_3> search(
            final Specification<NullableSetOfOneXmls_3> specification,
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
                    .count(NullableSetOfOneXmls_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfOneXmls_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfOneXmls_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneXmls_3 result) {
        this.URI = result.URI;

        this.nullableSetOfOneXmls = result.nullableSetOfOneXmls;
        this.calculatedNullableSetOfOneXmls = result.calculatedNullableSetOfOneXmls;
        this.persistedNullableSetOfOneXmls = result.persistedNullableSetOfOneXmls;
        this.ID = result.ID;
    }

    public NullableSetOfOneXmls_3 persist() throws java.io.IOException {
        final NullableSetOfOneXmls_3 result;
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

    public NullableSetOfOneXmls_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableSetOfOneXmls_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<org.w3c.dom.Element> nullableSetOfOneXmls;

    @JsonProperty("nullableSetOfOneXmls")
    public java.util.Set<org.w3c.dom.Element> getNullableSetOfOneXmls() {
        return nullableSetOfOneXmls;
    }

    public NullableSetOfOneXmls_3 setNullableSetOfOneXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneXmls = value;

        return this;
    }

    private java.util.Set<org.w3c.dom.Element> calculatedNullableSetOfOneXmls;

    @JsonProperty("calculatedNullableSetOfOneXmls")
    public java.util.Set<org.w3c.dom.Element> getCalculatedNullableSetOfOneXmls() {
        return this.calculatedNullableSetOfOneXmls;
    }

    private java.util.Set<org.w3c.dom.Element> persistedNullableSetOfOneXmls;

    @JsonProperty("persistedNullableSetOfOneXmls")
    public java.util.Set<org.w3c.dom.Element> getPersistedNullableSetOfOneXmls() {
        return this.persistedNullableSetOfOneXmls;
    }
}
