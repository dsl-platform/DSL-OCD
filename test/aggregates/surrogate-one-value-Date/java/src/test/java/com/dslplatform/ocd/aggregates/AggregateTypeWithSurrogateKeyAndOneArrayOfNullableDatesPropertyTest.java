package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfNullableDatesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDate.Aggregate1A0Da> aggregate1A0DaRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfNullableDatesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A0DaRepository = locator.resolve(ocd.AggregateSurrogateDate.repositories.Aggregate1A0DaRepository.class);
    }

    /* Testing the "p1A0Da" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0DaDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da();
        final org.joda.time.LocalDate[] testValue = aggregate.getP1A0Da();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1A0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Da());
    }

    /* Testing the "p1A0Da" Default property value after active record persist */
    @org.junit.Test
    public void testP1A0DaDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da();
        final org.joda.time.LocalDate[] testValue = aggregate.getP1A0Da();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da().getP1A0Da());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Da" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0DaNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate[] testValue = new org.joda.time.LocalDate[] { null };
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da()
                .setP1A0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1A0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Da());
    }

    /* Testing the "p1A0Da" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A0DaNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate[] testValue = new org.joda.time.LocalDate[] { null };
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da()
                .setP1A0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da().getP1A0Da());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Da" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0DaNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate[] testValue = new org.joda.time.LocalDate[] { org.joda.time.LocalDate.now() };
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da()
                .setP1A0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1A0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Da());
    }

    /* Testing the "p1A0Da" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A0DaNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate[] testValue = new org.joda.time.LocalDate[] { org.joda.time.LocalDate.now() };
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da()
                .setP1A0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da().getP1A0Da());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Da" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0DaNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate[] testValue = new org.joda.time.LocalDate[] { new org.joda.time.LocalDate(9999, 12, 31) };
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da()
                .setP1A0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1A0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Da());
    }

    /* Testing the "p1A0Da" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1A0DaNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate[] testValue = new org.joda.time.LocalDate[] { new org.joda.time.LocalDate(9999, 12, 31) };
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da()
                .setP1A0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da().getP1A0Da());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Da" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0DaNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate[] testValue = new org.joda.time.LocalDate[] { org.joda.time.LocalDate.now(), new org.joda.time.LocalDate(1, 2, 3), new org.joda.time.LocalDate(1, 1, 1), new org.joda.time.LocalDate(0), new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L), new org.joda.time.LocalDate(9999, 12, 31) };
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da()
                .setP1A0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1A0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Da());
    }

    /* Testing the "p1A0Da" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1A0DaNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate[] testValue = new org.joda.time.LocalDate[] { org.joda.time.LocalDate.now(), new org.joda.time.LocalDate(1, 2, 3), new org.joda.time.LocalDate(1, 1, 1), new org.joda.time.LocalDate(0), new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L), new org.joda.time.LocalDate(9999, 12, 31) };
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da()
                .setP1A0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da().getP1A0Da());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Da" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0DaNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate[] testValue = new org.joda.time.LocalDate[] { null, org.joda.time.LocalDate.now(), new org.joda.time.LocalDate(1, 2, 3), new org.joda.time.LocalDate(1, 1, 1), new org.joda.time.LocalDate(0), new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L), new org.joda.time.LocalDate(9999, 12, 31) };
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da()
                .setP1A0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1A0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Da());
    }

    /* Testing the "p1A0Da" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1A0DaNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate[] testValue = new org.joda.time.LocalDate[] { null, org.joda.time.LocalDate.now(), new org.joda.time.LocalDate(1, 2, 3), new org.joda.time.LocalDate(1, 1, 1), new org.joda.time.LocalDate(0), new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L), new org.joda.time.LocalDate(9999, 12, 31) };
        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1A0Da()
                .setP1A0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Da().getP1A0Da());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1A0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1A0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
