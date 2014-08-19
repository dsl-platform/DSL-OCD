package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneDatePropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDate.Aggregate1Da> aggregate1DaRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneDatePropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1DaRepository = locator.resolve(ocd.AggregateSurrogateDate.repositories.Aggregate1DaRepository.class);
    }

    /* Testing the "p1Da" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DaDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da();
        final org.joda.time.LocalDate testValue = aggregate.getP1Da();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Da());
    }

    /* Testing the "p1Da" Default property value after active record persist */
    @org.junit.Test
    public void testP1DaDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da();
        final org.joda.time.LocalDate testValue = aggregate.getP1Da();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da().getP1Da());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Da" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DaNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(1, 2, 3);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da()
                .setP1Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Da());
    }

    /* Testing the "p1Da" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1DaNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(1, 2, 3);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da()
                .setP1Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da().getP1Da());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Da" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DaNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(1, 1, 1);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da()
                .setP1Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Da());
    }

    /* Testing the "p1Da" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1DaNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(1, 1, 1);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da()
                .setP1Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da().getP1Da());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Da" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DaNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(0);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da()
                .setP1Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Da());
    }

    /* Testing the "p1Da" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1DaNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(0);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da()
                .setP1Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da().getP1Da());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Da" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DaNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da()
                .setP1Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Da());
    }

    /* Testing the "p1Da" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1DaNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da()
                .setP1Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da().getP1Da());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Da" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1DaNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(9999, 12, 31);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da()
                .setP1Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Da());
    }

    /* Testing the "p1Da" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1DaNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(9999, 12, 31);
        final ocd.AggregateSurrogateDate.Aggregate1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1Da()
                .setP1Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Da().getP1Da());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
