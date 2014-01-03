module SetOptXMLWithSurrogateInAggregate
{
  root SetOptXMLWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<XML?>  setOptXML;
  }
}
