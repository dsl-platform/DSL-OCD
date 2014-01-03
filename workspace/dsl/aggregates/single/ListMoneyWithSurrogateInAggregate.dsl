module ListMoneyWithSurrogateInAggregate
{
  root ListMoneyWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Money>  listMoney;
  }
}
