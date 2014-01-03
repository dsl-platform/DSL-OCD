module OptListOptDecimalWithSurrogateInAggregate
{
  root OptListOptDecimalWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Decimal?>? optListOptDecimal;
  }
}
