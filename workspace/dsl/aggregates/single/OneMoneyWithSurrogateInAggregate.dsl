module OneMoneyWithSurrogateInAggregate
{
  root OneMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Money  oneMoney;
  }
}
