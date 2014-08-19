package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfNullableBinariesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBinary.Aggregate0L0Bi> aggregate0L0BiRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfNullableBinariesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L0BiRepository = locator.resolve(ocd.AggregateSurrogateBinary.repositories.Aggregate0L0BiRepository.class);
    }

    /* Testing the "p0L0Bi" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0BiDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi();
        final java.util.List<byte[]> testValue = aggregate.getP0L0Bi();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0L0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Bi());
    }

    /* Testing the "p0L0Bi" Default property value after active record persist */
    @org.junit.Test
    public void testP0L0BiDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi();
        final java.util.List<byte[]> testValue = aggregate.getP0L0Bi();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi().getP0L0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Bi" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0BiNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(null); }};
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi()
                .setP0L0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0L0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Bi());
    }

    /* Testing the "p0L0Bi" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L0BiNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(null); }};
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi()
                .setP0L0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi().getP0L0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Bi" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0BiNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[0]); }};
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi()
                .setP0L0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0L0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Bi());
    }

    /* Testing the "p0L0Bi" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L0BiNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[0]); }};
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi()
                .setP0L0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi().getP0L0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Bi" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0BiNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi()
                .setP0L0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0L0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Bi());
    }

    /* Testing the "p0L0Bi" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0L0BiNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi()
                .setP0L0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi().getP0L0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Bi" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0BiNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi()
                .setP0L0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0L0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Bi());
    }

    /* Testing the "p0L0Bi" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0L0BiNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi()
                .setP0L0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi().getP0L0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Bi" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0BiNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(null); add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi()
                .setP0L0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0L0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Bi());
    }

    /* Testing the "p0L0Bi" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0L0BiNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<byte[]> testValue = new java.util.ArrayList<byte[]>() {{ add(null); add(new byte[0]); add(new byte[] { Byte.MIN_VALUE }); add(new byte[] { Byte.MIN_VALUE, 0 }); add(new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE }); }};
        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0L0Bi()
                .setP0L0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Bi().getP0L0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0L0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0L0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
