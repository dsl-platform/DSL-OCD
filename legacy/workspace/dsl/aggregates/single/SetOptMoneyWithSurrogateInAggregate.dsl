module SetOptMoneyWithSurrogateInAggregate
{
  root SetOptMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Money?>  setOptMoney;
  }
}
