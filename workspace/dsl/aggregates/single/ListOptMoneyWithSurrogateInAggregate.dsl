module ListOptMoneyWithSurrogateInAggregate
{
  root ListOptMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Money?>  listOptMoney;
  }
}
