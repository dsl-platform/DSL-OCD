module ArrayOptDecimalWithSurrogateInAggregate
{
  root ArrayOptDecimalWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Decimal?[]  arrayOptDecimal;
  }
}
