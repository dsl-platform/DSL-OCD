package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfNullableLongsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLong.Aggregate1A0Lo> aggregate1A0LoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfNullableLongsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A0LoRepository = locator.resolve(ocd.AggregateSurrogateLong.repositories.Aggregate1A0LoRepository.class);
    }

    /* Testing the "p1A0Lo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0LoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo();
        final Long[] testValue = aggregate.getP1A0Lo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1A0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Lo());
    }

    /* Testing the "p1A0Lo" Default property value after active record persist */
    @org.junit.Test
    public void testP1A0LoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo();
        final Long[] testValue = aggregate.getP1A0Lo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo().getP1A0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Lo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0LoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long[] testValue = new Long[] { null };
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo()
                .setP1A0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1A0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Lo());
    }

    /* Testing the "p1A0Lo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A0LoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long[] testValue = new Long[] { null };
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo()
                .setP1A0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo().getP1A0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Lo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0LoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long[] testValue = new Long[] { 0L };
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo()
                .setP1A0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1A0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Lo());
    }

    /* Testing the "p1A0Lo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A0LoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long[] testValue = new Long[] { 0L };
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo()
                .setP1A0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo().getP1A0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Lo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0LoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long[] testValue = new Long[] { Long.MAX_VALUE };
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo()
                .setP1A0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1A0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Lo());
    }

    /* Testing the "p1A0Lo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1A0LoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long[] testValue = new Long[] { Long.MAX_VALUE };
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo()
                .setP1A0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo().getP1A0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Lo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0LoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long[] testValue = new Long[] { 0L, 1L, 1000000000000000000L, -1000000000000000000L, Long.MIN_VALUE, Long.MAX_VALUE };
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo()
                .setP1A0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1A0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Lo());
    }

    /* Testing the "p1A0Lo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1A0LoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long[] testValue = new Long[] { 0L, 1L, 1000000000000000000L, -1000000000000000000L, Long.MIN_VALUE, Long.MAX_VALUE };
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo()
                .setP1A0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo().getP1A0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Lo" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0LoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long[] testValue = new Long[] { null, 0L, 1L, 1000000000000000000L, -1000000000000000000L, Long.MIN_VALUE, Long.MAX_VALUE };
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo()
                .setP1A0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1A0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Lo());
    }

    /* Testing the "p1A0Lo" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1A0LoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long[] testValue = new Long[] { null, 0L, 1L, 1000000000000000000L, -1000000000000000000L, Long.MIN_VALUE, Long.MAX_VALUE };
        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1A0Lo()
                .setP1A0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Lo().getP1A0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1A0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1A0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
