module SetBoolWithSurrogateInAggregate
{
  root SetBoolWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Bool>  setBool;
  }
}
