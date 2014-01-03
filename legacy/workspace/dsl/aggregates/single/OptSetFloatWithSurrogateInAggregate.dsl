module OptSetFloatWithSurrogateInAggregate
{
  root OptSetFloatWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Float>? optSetFloat;
  }
}
