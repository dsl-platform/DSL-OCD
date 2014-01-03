module OptListOptMoneyWithSurrogateInAggregate
{
  root OptListOptMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Money?>? optListOptMoney;
  }
}
