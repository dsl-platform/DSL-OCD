module OptListMoneyWithSurrogateInAggregate
{
  root OptListMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Money>? optListMoney;
  }
}
