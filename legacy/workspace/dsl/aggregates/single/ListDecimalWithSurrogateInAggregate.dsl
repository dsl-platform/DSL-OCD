module ListDecimalWithSurrogateInAggregate
{
  root ListDecimalWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Decimal>  listDecimal;
  }
}
