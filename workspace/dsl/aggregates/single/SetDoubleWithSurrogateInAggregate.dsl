module SetDoubleWithSurrogateInAggregate
{
  root SetDoubleWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Double>  setDouble;
  }
}
