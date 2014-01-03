module OptSetOptDecimalWithSurrogateInAggregate
{
  root OptSetOptDecimalWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Decimal?>? optSetOptDecimal;
  }
}
