module OptMoneyWithSurrogateInAggregate
{
  root OptMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Money? optMoney;
  }
}
