package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfNullableBinariesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBinary.Aggregate1S0Bi> aggregate1S0BiRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfNullableBinariesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S0BiRepository = locator.resolve(ocd.AggregateSurrogateBinary.repositories.Aggregate1S0BiRepository.class);
    }

    /* Testing the "p1S0Bi" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BiDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi();
        final java.util.Set<byte[]> testValue = aggregate.getP1S0Bi();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1S0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bi());
    }

    /* Testing the "p1S0Bi" Default property value after active record persist */
    @org.junit.Test
    public void testP1S0BiDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi();
        final java.util.Set<byte[]> testValue = aggregate.getP1S0Bi();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi().getP1S0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Bi" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BiNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(null); }};
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi()
                .setP1S0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1S0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bi());
    }

    /* Testing the "p1S0Bi" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S0BiNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(null); }};
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi()
                .setP1S0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi().getP1S0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Bi" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BiNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[0]); }};
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi()
                .setP1S0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1S0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bi());
    }

    /* Testing the "p1S0Bi" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S0BiNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[0]); }};
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi()
                .setP1S0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi().getP1S0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Bi" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BiNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi()
                .setP1S0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1S0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bi());
    }

    /* Testing the "p1S0Bi" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S0BiNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi()
                .setP1S0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi().getP1S0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Bi" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BiNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi()
                .setP1S0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1S0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bi());
    }

    /* Testing the "p1S0Bi" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1S0BiNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi()
                .setP1S0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi().getP1S0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Bi" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BiNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(null); add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi()
                .setP1S0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1S0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bi());
    }

    /* Testing the "p1S0Bi" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1S0BiNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<byte[]> testValue = new java.util.HashSet<byte[]>() {{ add(null); add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1S0Bi()
                .setP1S0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bi().getP1S0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1S0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1S0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}