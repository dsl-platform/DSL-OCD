package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneIpPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateIp.Aggregate1Ip> aggregate1IpRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneIpPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1IpRepository = locator.resolve(ocd.AggregateSurrogateIp.repositories.Aggregate1IpRepository.class);
    }

    /* Testing the "p1Ip" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1IpDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip();
        final java.net.InetAddress testValue = aggregate.getP1Ip();

        // check that the property was properly assigned
        // special null check for dissalowed null value in a non-nullable property
        org.junit.Assert.assertNull(aggregate.getP1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1Ip.class),
                serialized);

        // check that the property was properly deserialized
        // special null check for dissalowed null value in a non-nullable property
        org.junit.Assert.assertNull(aggregateDeserialized.getP1Ip());
    }

    /* Testing the "p1Ip" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1IpNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress testValue = com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1");
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip()
                .setP1Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ip());
    }

    /* Testing the "p1Ip" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1IpNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress testValue = com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1");
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip()
                .setP1Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ip().getP1Ip());

        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ip" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1IpNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress testValue = com.dslplatform.ocd.test.TypeFactory.buildIP("0");
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip()
                .setP1Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ip());
    }

    /* Testing the "p1Ip" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1IpNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress testValue = com.dslplatform.ocd.test.TypeFactory.buildIP("0");
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip()
                .setP1Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ip().getP1Ip());

        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ip" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1IpNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress testValue = com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255");
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip()
                .setP1Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ip());
    }

    /* Testing the "p1Ip" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1IpNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress testValue = com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255");
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip()
                .setP1Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ip().getP1Ip());

        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ip" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1IpNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress testValue = com.dslplatform.ocd.test.TypeFactory.buildIP("::1");
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip()
                .setP1Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ip());
    }

    /* Testing the "p1Ip" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1IpNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress testValue = com.dslplatform.ocd.test.TypeFactory.buildIP("::1");
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip()
                .setP1Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ip().getP1Ip());

        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ip" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1IpNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress testValue = com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff");
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip()
                .setP1Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ip());
    }

    /* Testing the "p1Ip" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1IpNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress testValue = com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff");
        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1Ip()
                .setP1Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ip().getP1Ip());

        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
