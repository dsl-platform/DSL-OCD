module ArrayOptMoneyWithSurrogateInAggregate
{
  root ArrayOptMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Money?[]  arrayOptMoney;
  }
}
