module OptDateWithSurrogateInAggregate
{
  root OptDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Date? optDate;
  }
}
