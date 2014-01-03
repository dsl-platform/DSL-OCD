module OptArrayMoneyWithSurrogateInAggregate
{
  root OptArrayMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Money[]? optArrayMoney;
  }
}
