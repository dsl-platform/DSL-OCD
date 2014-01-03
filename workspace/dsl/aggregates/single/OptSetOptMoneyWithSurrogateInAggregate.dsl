module OptSetOptMoneyWithSurrogateInAggregate
{
  root OptSetOptMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Money?>? optSetOptMoney;
  }
}
