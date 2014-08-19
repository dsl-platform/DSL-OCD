package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfOneXmlsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateXml.Aggregate1A1Xm> aggregate1A1XmRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfOneXmlsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A1XmRepository = locator.resolve(ocd.AggregateSurrogateXml.repositories.Aggregate1A1XmRepository.class);
    }

    /* Testing the "p1A1Xm" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1XmDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1A1Xm();
        final org.w3c.dom.Element[] testValue = aggregate.getP1A1Xm();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1A1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Xm());
    }

    /* Testing the "p1A1Xm" Default property value after active record persist */
    @org.junit.Test
    public void testP1A1XmDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1A1Xm();
        final org.w3c.dom.Element[] testValue = aggregate.getP1A1Xm();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Xm().getP1A1Xm());

        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1A1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1A1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Xm" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1XmNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>") };
        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1A1Xm()
                .setP1A1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1A1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Xm());
    }

    /* Testing the "p1A1Xm" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A1XmNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>") };
        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1A1Xm()
                .setP1A1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Xm().getP1A1Xm());

        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1A1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1A1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Xm" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1XmNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { com.dslplatform.ocd.test.Utils.stringToElement("<document/>"), com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>"), com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>"), com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>") };
        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1A1Xm()
                .setP1A1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate1A1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Xm());
    }

    /* Testing the "p1A1Xm" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A1XmNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element[] testValue = new org.w3c.dom.Element[] { com.dslplatform.ocd.test.Utils.stringToElement("<document/>"), com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>"), com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>"), com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>"), com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>") };
        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate1A1Xm()
                .setP1A1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Xm().getP1A1Xm());

        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1A1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate1A1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate1A1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
