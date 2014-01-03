module OptListDecimalWithSurrogateInAggregate
{
  root OptListDecimalWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Decimal>? optListDecimal;
  }
}
