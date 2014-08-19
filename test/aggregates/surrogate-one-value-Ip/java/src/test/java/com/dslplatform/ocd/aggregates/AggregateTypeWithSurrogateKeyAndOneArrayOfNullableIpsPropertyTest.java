package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfNullableIpsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateIp.Aggregate1A0Ip> aggregate1A0IpRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfNullableIpsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A0IpRepository = locator.resolve(ocd.AggregateSurrogateIp.repositories.Aggregate1A0IpRepository.class);
    }

    /* Testing the "p1A0Ip" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0IpDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1A0Ip();
        final java.net.InetAddress[] testValue = aggregate.getP1A0Ip();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1A0Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Ip());
    }

    /* Testing the "p1A0Ip" Default property value after active record persist */
    @org.junit.Test
    public void testP1A0IpDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1A0Ip();
        final java.net.InetAddress[] testValue = aggregate.getP1A0Ip();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ip().getP1A0Ip());

        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1A0Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1A0Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Ip" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0IpNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { null };
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1A0Ip()
                .setP1A0Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1A0Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Ip());
    }

    /* Testing the "p1A0Ip" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A0IpNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { null };
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1A0Ip()
                .setP1A0Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ip().getP1A0Ip());

        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1A0Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1A0Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Ip" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0IpNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff") };
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1A0Ip()
                .setP1A0Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1A0Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Ip());
    }

    /* Testing the "p1A0Ip" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A0IpNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff") };
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1A0Ip()
                .setP1A0Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ip().getP1A0Ip());

        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1A0Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1A0Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Ip" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0IpNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1"), com.dslplatform.ocd.test.TypeFactory.buildIP("0"), com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255"), com.dslplatform.ocd.test.TypeFactory.buildIP("::1"), com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff") };
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1A0Ip()
                .setP1A0Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1A0Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Ip());
    }

    /* Testing the "p1A0Ip" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1A0IpNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1"), com.dslplatform.ocd.test.TypeFactory.buildIP("0"), com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255"), com.dslplatform.ocd.test.TypeFactory.buildIP("::1"), com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff") };
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1A0Ip()
                .setP1A0Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ip().getP1A0Ip());

        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1A0Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1A0Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Ip" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0IpNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { null, com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1"), com.dslplatform.ocd.test.TypeFactory.buildIP("0"), com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255"), com.dslplatform.ocd.test.TypeFactory.buildIP("::1"), com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff") };
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1A0Ip()
                .setP1A0Ip(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ip());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateIp.Aggregate1A0Ip.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Ip());
    }

    /* Testing the "p1A0Ip" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1A0IpNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.InetAddress[] testValue = new java.net.InetAddress[] { null, com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1"), com.dslplatform.ocd.test.TypeFactory.buildIP("0"), com.dslplatform.ocd.test.TypeFactory.buildIP("255.255.255.255"), com.dslplatform.ocd.test.TypeFactory.buildIP("::1"), com.dslplatform.ocd.test.TypeFactory.buildIP("ffff::ffff") };
        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregate =
                new ocd.AggregateSurrogateIp.Aggregate1A0Ip()
                .setP1A0Ip(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ip().getP1A0Ip());

        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1A0Ip.find(aggregate.getURI());

        final ocd.AggregateSurrogateIp.Aggregate1A0Ip aggregateFound =
                ocd.AggregateSurrogateIp.Aggregate1A0Ip.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IpAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Ip());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
