module OptArrayOptMoneyWithSurrogateInAggregate
{
  root OptArrayOptMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Money?[]? optArrayOptMoney;
  }
}
