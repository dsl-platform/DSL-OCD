module ArrayOptDateWithSurrogateInAggregate
{
  root ArrayOptDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Date?[]  arrayOptDate;
  }
}
