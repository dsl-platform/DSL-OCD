package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneBinariesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBinary.Aggregate0S1Bi> aggregate0S1BiRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneBinariesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1BiRepository = locator.resolve(ocd.AggregateSurrogateBinary.repositories.Aggregate0S1BiRepository.class);
    }

    /* Testing the "p0S1Bi" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1BiDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0S1Bi();
        final java.util.Set<byte[]> testValue = aggregate.getP0S1Bi();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0S1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Bi());
    }

    /* Testing the "p0S1Bi" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1BiDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0S1Bi();
        final java.util.Set<byte[]> testValue = aggregate.getP0S1Bi();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bi().getP0S1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0S1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0S1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Bi" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1BiNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[0]); }};
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0S1Bi()
                .setP0S1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0S1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Bi());
    }

    /* Testing the "p0S1Bi" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1BiNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[0]); }};
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0S1Bi()
                .setP0S1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bi().getP0S1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0S1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0S1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Bi" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1BiNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0S1Bi()
                .setP0S1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0S1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Bi());
    }

    /* Testing the "p0S1Bi" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1BiNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0S1Bi()
                .setP0S1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bi().getP0S1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0S1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0S1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Bi" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1BiNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0S1Bi()
                .setP0S1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0S1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Bi());
    }

    /* Testing the "p0S1Bi" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S1BiNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0S1Bi()
                .setP0S1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bi().getP0S1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0S1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0S1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0S1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
