module ArrayMoneyWithSurrogateInAggregate
{
  root ArrayMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Money[]  arrayMoney;
  }
}
