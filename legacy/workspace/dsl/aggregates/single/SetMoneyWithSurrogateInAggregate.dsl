module SetMoneyWithSurrogateInAggregate
{
  root SetMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Money>  setMoney;
  }
}
