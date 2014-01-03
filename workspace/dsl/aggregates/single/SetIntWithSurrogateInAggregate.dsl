module SetIntWithSurrogateInAggregate
{
  root SetIntWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Int>  setInt;
  }
}
