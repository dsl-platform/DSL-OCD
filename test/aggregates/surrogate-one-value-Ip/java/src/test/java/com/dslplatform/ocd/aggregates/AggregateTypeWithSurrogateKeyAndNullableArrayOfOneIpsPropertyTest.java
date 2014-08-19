package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfOneIpsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateIp.Aggregate0A1Ip> aggregate0A1IpRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfOneIpsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A1IpRepository = locator.resolve(ocd.AggregateSurrogateIp.repositories.Aggregate0A1IpRepository.class);
    }

    /* Testing the "p0A1Ip" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1IpDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate0A1Ip();
        final java.net.InetAddress[] testValue = aggregate.getP0A1Ip();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate0A1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Ip());
    }

    /* Testing the "p0A1Ip" Default property value after active record persist */
    @org.junit.Test
    public void testP0A1IpDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate0A1Ip();
        final java.net.InetAddress[] testValue = aggregate.getP0A1Ip();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ip().getP0A1Ip());

        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate0A1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate0A1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Ip" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1IpNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff") };
        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate0A1Ip()
                .setP0A1Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate0A1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Ip());
    }

    /* Testing the "p0A1Ip" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A1IpNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff") };
        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate0A1Ip()
                .setP0A1Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ip().getP0A1Ip());

        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate0A1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate0A1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Ip" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1IpNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1"), com.dslplatform.ocd.test.TypeFactory.buildIP("0"), com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255"), com.dslplatform.ocd.test.TypeFactory.buildIP("::1"), com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff") };
        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate0A1Ip()
                .setP0A1Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate0A1Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Ip());
    }

    /* Testing the "p0A1Ip" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A1IpNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1"), com.dslplatform.ocd.test.TypeFactory.buildIP("0"), com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255"), com.dslplatform.ocd.test.TypeFactory.buildIP("::1"), com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff") };
        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate0A1Ip()
                .setP0A1Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ip().getP0A1Ip());

        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate0A1Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate0A1Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate0A1Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
