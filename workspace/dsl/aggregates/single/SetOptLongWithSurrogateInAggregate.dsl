module SetOptLongWithSurrogateInAggregate
{
  root SetOptLongWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Long?>  setOptLong;
  }
}
