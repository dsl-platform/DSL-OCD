module ListOptDecimalWithSurrogateInAggregate
{
  root ListOptDecimalWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Decimal?>  listOptDecimal;
  }
}
