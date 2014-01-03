module SetOptDecimalWithSurrogateInAggregate
{
  root SetOptDecimalWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Decimal?>  setOptDecimal;
  }
}
