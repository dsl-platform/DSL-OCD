module SetOptIntWithSurrogateInAggregate
{
  root SetOptIntWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Int?>  setOptInt;
  }
}
