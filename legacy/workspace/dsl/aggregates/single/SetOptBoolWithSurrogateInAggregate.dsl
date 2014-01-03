module SetOptBoolWithSurrogateInAggregate
{
  root SetOptBoolWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Bool?>  setOptBool;
  }
}
