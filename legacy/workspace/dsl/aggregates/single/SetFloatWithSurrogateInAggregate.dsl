module SetFloatWithSurrogateInAggregate
{
  root SetFloatWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Float>  setFloat;
  }
}
