module OptSetDoubleWithSurrogateInAggregate
{
  root OptSetDoubleWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Double>? optSetDouble;
  }
}
