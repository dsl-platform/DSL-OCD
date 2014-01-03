module ListOptDoubleWithSurrogateInAggregate
{
  root ListOptDoubleWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Double?>  listOptDouble;
  }
}
