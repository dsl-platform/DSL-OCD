module SetXMLWithSurrogateInAggregate
{
  root SetXMLWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<XML>  setXML;
  }
}
