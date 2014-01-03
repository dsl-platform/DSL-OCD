module SetOptMapWithSurrogateInAggregate
{
  root SetOptMapWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Map?>  setOptMap;
  }
}
