module OptArrayDateWithSurrogateInAggregate
{
  root OptArrayDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Date[]? optArrayDate;
  }
}
