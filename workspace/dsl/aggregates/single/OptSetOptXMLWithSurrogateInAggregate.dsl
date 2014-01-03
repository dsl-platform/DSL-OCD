module OptSetOptXMLWithSurrogateInAggregate
{
  root OptSetOptXMLWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<XML?>? optSetOptXML;
  }
}
