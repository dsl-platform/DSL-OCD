package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneFloatPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateFloat.Aggregate1Fl> aggregate1FlRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneFloatPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1FlRepository = locator.resolve(ocd.AggregateSurrogateFloat.repositories.Aggregate1FlRepository.class);
    }

    /* Testing the "p1Fl" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1FlDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl();
        final float testValue = aggregate.getP1Fl();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Fl());
    }

    /* Testing the "p1Fl" Default property value after active record persist */
    @org.junit.Test
    public void testP1FlDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl();
        final float testValue = aggregate.getP1Fl();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl().getP1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Fl" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1FlNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final float testValue = -1.2345E-10f;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Fl());
    }

    /* Testing the "p1Fl" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1FlNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final float testValue = -1.2345E-10f;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl().getP1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Fl" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1FlNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final float testValue = 1.2345E20f;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Fl());
    }

    /* Testing the "p1Fl" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1FlNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final float testValue = 1.2345E20f;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl().getP1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Fl" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1FlNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final float testValue = -1E-5f;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Fl());
    }

    /* Testing the "p1Fl" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1FlNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final float testValue = -1E-5f;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl().getP1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Fl" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1FlNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final float testValue = Float.NaN;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Fl());
    }

    /* Testing the "p1Fl" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1FlNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final float testValue = Float.NaN;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl().getP1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Fl" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1FlNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final float testValue = Float.NEGATIVE_INFINITY;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Fl());
    }

    /* Testing the "p1Fl" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1FlNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final float testValue = Float.NEGATIVE_INFINITY;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl().getP1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Fl" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1FlNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final float testValue = Float.POSITIVE_INFINITY;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Fl());
    }

    /* Testing the "p1Fl" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP1FlNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final float testValue = Float.POSITIVE_INFINITY;
        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1Fl()
                .setP1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Fl().getP1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
