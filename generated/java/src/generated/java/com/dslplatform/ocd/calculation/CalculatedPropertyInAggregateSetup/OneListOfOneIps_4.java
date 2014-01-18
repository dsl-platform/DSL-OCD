package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfOneIps_4 implements java.io.Serializable, AggregateRoot {
    public OneListOfOneIps_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfOneIps = new java.util.ArrayList<java.net.InetAddress>();
        this.calculatedOneListOfOneIps = new java.util.ArrayList<java.net.InetAddress>();
        this.persistedOneListOfOneIps = new java.util.ArrayList<java.net.InetAddress>();
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
        final OneListOfOneIps_4 other = (OneListOfOneIps_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfOneIps_4(" + URI + ')'
                : "new OneListOfOneIps_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfOneIps_4(
            final java.util.List<java.net.InetAddress> oneListOfOneIps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfOneIps(oneListOfOneIps);
    }

    @JsonCreator
    private OneListOfOneIps_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfOneIps") final java.util.List<java.net.InetAddress> oneListOfOneIps,
            @JsonProperty("calculatedOneListOfOneIps") final java.util.List<java.net.InetAddress> calculatedOneListOfOneIps,
            @JsonProperty("persistedOneListOfOneIps") final java.util.List<java.net.InetAddress> persistedOneListOfOneIps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfOneIps = oneListOfOneIps == null
                ? new java.util.ArrayList<java.net.InetAddress>()
                : oneListOfOneIps;
        this.calculatedOneListOfOneIps = calculatedOneListOfOneIps;
        this.persistedOneListOfOneIps = persistedOneListOfOneIps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfOneIps_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfOneIps_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfOneIps_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfOneIps_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneIps_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneIps_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfOneIps_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneIps_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneIps_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfOneIps_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneIps_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfOneIps_4.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneIps_4> search(
            final Specification<OneListOfOneIps_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneIps_4> search(
            final Specification<OneListOfOneIps_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfOneIps_4> search(
            final Specification<OneListOfOneIps_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneIps_4> search(
            final Specification<OneListOfOneIps_4> specification,
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
                    .resolve(DomainProxy.class).count(OneListOfOneIps_4.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfOneIps_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfOneIps_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneIps_4 result) {
        this.URI = result.URI;

        this.oneListOfOneIps = result.oneListOfOneIps;
        this.calculatedOneListOfOneIps = result.calculatedOneListOfOneIps;
        this.persistedOneListOfOneIps = result.persistedOneListOfOneIps;
        this.ID = result.ID;
    }

    public OneListOfOneIps_4 persist() throws java.io.IOException {
        final OneListOfOneIps_4 result;
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

    public OneListOfOneIps_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfOneIps_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<java.net.InetAddress> oneListOfOneIps;

    @JsonProperty("oneListOfOneIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.InetAddress> getOneListOfOneIps() {
        return oneListOfOneIps;
    }

    public OneListOfOneIps_4 setOneListOfOneIps(
            final java.util.List<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneIps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneIps = value;

        return this;
    }

    private java.util.List<java.net.InetAddress> calculatedOneListOfOneIps;

    @JsonProperty("calculatedOneListOfOneIps")
    public java.util.List<java.net.InetAddress> getCalculatedOneListOfOneIps() {
        return this.calculatedOneListOfOneIps;
    }

    private java.util.List<java.net.InetAddress> persistedOneListOfOneIps;

    @JsonProperty("persistedOneListOfOneIps")
    public java.util.List<java.net.InetAddress> getPersistedOneListOfOneIps() {
        return this.persistedOneListOfOneIps;
    }
}
