module OptDecimalWithSurrogateInAggregate
{
  root OptDecimalWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Decimal? optDecimal;
  }
}
