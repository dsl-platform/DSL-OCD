module OptSetMoneyWithSurrogateInAggregate
{
  root OptSetMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Money>? optSetMoney;
  }
}
