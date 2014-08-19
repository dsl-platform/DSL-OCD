package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneXmlPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateXml.Aggregate1Xm> aggregate1XmRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneXmlPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1XmRepository = locator.resolve(ocd.AggregateSurrogateXml.repositories.Aggregate1XmRepository.class);
    }

    /* Testing the "p1Xm" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1XmDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm();
        final org.w3c.dom.Element testValue = aggregate.getP1Xm();

        // check that the property was properly assigned
        // special null check for dissalowed null value in a non-nullable property
        org.junit.Assert.assertNull(aggregate.getP1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1Xm.class),
                serialized);

        // check that the property was properly deserialized
        // special null check for dissalowed null value in a non-nullable property
        org.junit.Assert.assertNull(aggregateDeserialized.getP1Xm());
    }

    /* Testing the "p1Xm" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1XmNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<document/>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Xm());
    }

    /* Testing the "p1Xm" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1XmNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<document/>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm().getP1Xm());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Xm" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1XmNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Xm());
    }

    /* Testing the "p1Xm" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1XmNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm().getP1Xm());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Xm" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1XmNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Xm());
    }

    /* Testing the "p1Xm" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1XmNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm().getP1Xm());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Xm" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1XmNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Xm());
    }

    /* Testing the "p1Xm" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1XmNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm().getP1Xm());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Xm" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1XmNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Xm());
    }

    /* Testing the "p1Xm" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1XmNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm().getP1Xm());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Xm" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1XmNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Xm());
    }

    /* Testing the "p1Xm" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP1XmNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>");
        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1Xm()
                .setP1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Xm().getP1Xm());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
