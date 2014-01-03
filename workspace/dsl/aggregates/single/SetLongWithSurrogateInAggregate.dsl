module SetLongWithSurrogateInAggregate
{
  root SetLongWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Long>  setLong;
  }
}
