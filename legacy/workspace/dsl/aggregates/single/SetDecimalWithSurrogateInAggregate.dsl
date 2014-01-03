module SetDecimalWithSurrogateInAggregate
{
  root SetDecimalWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Decimal>  setDecimal;
  }
}
