package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfNullableIps_4 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfNullableIps_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfNullableIps = new java.util.HashSet<java.net.InetAddress>();
        this.calculatedOneSetOfNullableIps = new java.util.HashSet<java.net.InetAddress>();
        this.persistedOneSetOfNullableIps = new java.util.HashSet<java.net.InetAddress>();
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
        final OneSetOfNullableIps_4 other = (OneSetOfNullableIps_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfNullableIps_4(" + URI + ')'
                : "new OneSetOfNullableIps_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfNullableIps_4(
            final java.util.Set<java.net.InetAddress> oneSetOfNullableIps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfNullableIps(oneSetOfNullableIps);
    }

    @JsonCreator
    private OneSetOfNullableIps_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfNullableIps") final java.util.Set<java.net.InetAddress> oneSetOfNullableIps,
            @JsonProperty("calculatedOneSetOfNullableIps") final java.util.Set<java.net.InetAddress> calculatedOneSetOfNullableIps,
            @JsonProperty("persistedOneSetOfNullableIps") final java.util.Set<java.net.InetAddress> persistedOneSetOfNullableIps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfNullableIps = oneSetOfNullableIps == null
                ? new java.util.HashSet<java.net.InetAddress>()
                : oneSetOfNullableIps;
        this.calculatedOneSetOfNullableIps = calculatedOneSetOfNullableIps;
        this.persistedOneSetOfNullableIps = persistedOneSetOfNullableIps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfNullableIps_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfNullableIps_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfNullableIps_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfNullableIps_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableIps_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableIps_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfNullableIps_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableIps_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableIps_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfNullableIps_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableIps_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfNullableIps_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableIps_4> search(
            final Specification<OneSetOfNullableIps_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableIps_4> search(
            final Specification<OneSetOfNullableIps_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfNullableIps_4> search(
            final Specification<OneSetOfNullableIps_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableIps_4> search(
            final Specification<OneSetOfNullableIps_4> specification,
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
                    .count(OneSetOfNullableIps_4.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfNullableIps_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfNullableIps_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableIps_4 result) {
        this.URI = result.URI;

        this.oneSetOfNullableIps = result.oneSetOfNullableIps;
        this.calculatedOneSetOfNullableIps = result.calculatedOneSetOfNullableIps;
        this.persistedOneSetOfNullableIps = result.persistedOneSetOfNullableIps;
        this.ID = result.ID;
    }

    public OneSetOfNullableIps_4 persist() throws java.io.IOException {
        final OneSetOfNullableIps_4 result;
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

    public OneSetOfNullableIps_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfNullableIps_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.net.InetAddress> oneSetOfNullableIps;

    @JsonProperty("oneSetOfNullableIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.InetAddress> getOneSetOfNullableIps() {
        return oneSetOfNullableIps;
    }

    public OneSetOfNullableIps_4 setOneSetOfNullableIps(
            final java.util.Set<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableIps\" cannot be null!");
        this.oneSetOfNullableIps = value;

        return this;
    }

    private java.util.Set<java.net.InetAddress> calculatedOneSetOfNullableIps;

    @JsonProperty("calculatedOneSetOfNullableIps")
    public java.util.Set<java.net.InetAddress> getCalculatedOneSetOfNullableIps() {
        return this.calculatedOneSetOfNullableIps;
    }

    private java.util.Set<java.net.InetAddress> persistedOneSetOfNullableIps;

    @JsonProperty("persistedOneSetOfNullableIps")
    public java.util.Set<java.net.InetAddress> getPersistedOneSetOfNullableIps() {
        return this.persistedOneSetOfNullableIps;
    }
}
