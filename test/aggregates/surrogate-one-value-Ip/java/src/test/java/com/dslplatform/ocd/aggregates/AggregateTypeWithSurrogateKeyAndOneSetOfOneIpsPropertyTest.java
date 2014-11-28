package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfOneIpsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateIp.Aggregate1S1Ip> aggregate1S1IpRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfOneIpsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S1IpRepository = locator.resolve(ocd.AggregateSurrogateIp.repositories.Aggregate1S1IpRepository.class);
    }

    /* Testing the "p1S1Ip" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1IpDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S1Ip();
        final java.util.Set<java.net.InetAddress> testValue = aggregate.getP1S1Ip();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1S1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Ip());
    }

    /* Testing the "p1S1Ip" Default property value after active record persist */
    @org.junit.Test
    public void testP1S1IpDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S1Ip();
        final java.util.Set<java.net.InetAddress> testValue = aggregate.getP1S1Ip();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Ip().getP1S1Ip());

        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1Ip" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1IpNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff")); }};
        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S1Ip()
                .setP1S1Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1S1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Ip());
    }

    /* Testing the "p1S1Ip" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S1IpNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff")); }};
        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S1Ip()
                .setP1S1Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Ip().getP1S1Ip());

        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S1Ip" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S1IpNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("0")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("::1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff")); }};
        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S1Ip()
                .setP1S1Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1S1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP1S1Ip());
    }

    /* Testing the "p1S1Ip" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S1IpNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.net.InetAddress> testValue = new java.util.HashSet<java.net.InetAddress>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("0")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("::1")); add(com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff")); }};
        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1S1Ip()
                .setP1S1Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregate.getP1S1Ip().getP1S1Ip());

        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1S1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1S1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneSetOfOneEquals(
                testValue,
                aggregateFound.getP1S1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}