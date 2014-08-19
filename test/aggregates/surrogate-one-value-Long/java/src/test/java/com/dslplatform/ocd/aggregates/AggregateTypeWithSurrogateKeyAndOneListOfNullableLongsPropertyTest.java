package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfNullableLongsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLong.Aggregate1L0Lo> aggregate1L0LoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfNullableLongsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L0LoRepository = locator.resolve(ocd.AggregateSurrogateLong.repositories.Aggregate1L0LoRepository.class);
    }

    /* Testing the "p1L0Lo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0LoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo();
        final java.util.List<Long> testValue = aggregate.getP1L0Lo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1L0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Lo());
    }

    /* Testing the "p1L0Lo" Default property value after active record persist */
    @org.junit.Test
    public void testP1L0LoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo();
        final java.util.List<Long> testValue = aggregate.getP1L0Lo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo().getP1L0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Lo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0LoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(null); }};
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo()
                .setP1L0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1L0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Lo());
    }

    /* Testing the "p1L0Lo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L0LoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(null); }};
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo()
                .setP1L0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo().getP1L0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Lo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0LoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); }};
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo()
                .setP1L0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1L0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Lo());
    }

    /* Testing the "p1L0Lo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L0LoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); }};
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo()
                .setP1L0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo().getP1L0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Lo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0LoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo()
                .setP1L0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1L0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Lo());
    }

    /* Testing the "p1L0Lo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L0LoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo()
                .setP1L0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo().getP1L0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Lo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0LoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo()
                .setP1L0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1L0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Lo());
    }

    /* Testing the "p1L0Lo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1L0LoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo()
                .setP1L0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo().getP1L0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Lo" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0LoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(null); add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo()
                .setP1L0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1L0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Lo());
    }

    /* Testing the "p1L0Lo" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1L0LoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(null); add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L0Lo()
                .setP1L0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Lo().getP1L0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1L0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
