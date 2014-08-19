package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfOneBinariesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBinary.Aggregate1L1Bi> aggregate1L1BiRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfOneBinariesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L1BiRepository = locator.resolve(ocd.AggregateSurrogateBinary.repositories.Aggregate1L1BiRepository.class);
    }

    /* Testing the "p1L1Bi" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1BiDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1L1Bi();
        final java.util.List<byte[]> testValue = aggregate.getP1L1Bi();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1L1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Bi());
    }

    /* Testing the "p1L1Bi" Default property value after active record persist */
    @org.junit.Test
    public void testP1L1BiDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1L1Bi();
        final java.util.List<byte[]> testValue = aggregate.getP1L1Bi();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bi().getP1L1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1L1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1L1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Bi" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1BiNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[0]); }};
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1L1Bi()
                .setP1L1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1L1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Bi());
    }

    /* Testing the "p1L1Bi" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L1BiNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[0]); }};
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1L1Bi()
                .setP1L1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bi().getP1L1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1L1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1L1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Bi" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1BiNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1L1Bi()
                .setP1L1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1L1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Bi());
    }

    /* Testing the "p1L1Bi" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L1BiNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1L1Bi()
                .setP1L1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bi().getP1L1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1L1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1L1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Bi" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1BiNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1L1Bi()
                .setP1L1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1L1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Bi());
    }

    /* Testing the "p1L1Bi" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L1BiNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1L1Bi()
                .setP1L1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bi().getP1L1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1L1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1L1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1L1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
