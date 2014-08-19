package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfNullableIpsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateIp.Aggregate1S0Ip> aggregate1S0IpRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfNullableIpsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S0IpRepository = locator.resolve(ocd.AggregateSurrogateIp.repositories.Aggregate1S0IpRepository.class);
    }

    /* Testing the "p1S0Ip" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0IpDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S0Ip();
        final java.util.Set<java.net.InetAddress> testValue = aggregate.getP1S0Ip();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1S0Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Ip());
    }

    /* Testing the "p1S0Ip" Default property value after active record persist */
    @org.junit.Test
    public void testP1S0IpDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S0Ip();
        final java.util.Set<java.net.InetAddress> testValue = aggregate.getP1S0Ip();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Ip().getP1S0Ip());

        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S0Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S0Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Ip" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0IpNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(null); }};
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S0Ip()
                .setP1S0Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1S0Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Ip());
    }

    /* Testing the "p1S0Ip" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S0IpNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(null); }};
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S0Ip()
                .setP1S0Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Ip().getP1S0Ip());

        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S0Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S0Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Ip" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0IpNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff")); }};
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S0Ip()
                .setP1S0Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1S0Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Ip());
    }

    /* Testing the "p1S0Ip" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S0IpNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff")); }};
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S0Ip()
                .setP1S0Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Ip().getP1S0Ip());

        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S0Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S0Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Ip" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0IpNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("0")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("::1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff")); }};
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S0Ip()
                .setP1S0Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1S0Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Ip());
    }

    /* Testing the "p1S0Ip" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S0IpNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("0")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("::1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff")); }};
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S0Ip()
                .setP1S0Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Ip().getP1S0Ip());

        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S0Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S0Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Ip" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0IpNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(null); add(com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("0")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("::1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff")); }};
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S0Ip()
                .setP1S0Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1S0Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Ip());
    }

    /* Testing the "p1S0Ip" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1S0IpNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(null); add(com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("0")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("::1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff")); }};
        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S0Ip()
                .setP1S0Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Ip().getP1S0Ip());

        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S0Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1S0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S0Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
