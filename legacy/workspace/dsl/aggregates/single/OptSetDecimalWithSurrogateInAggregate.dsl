module OptSetDecimalWithSurrogateInAggregate
{
  root OptSetDecimalWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Decimal>? optSetDecimal;
  }
}
