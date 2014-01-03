module ArrayDateWithSurrogateInAggregate
{
  root ArrayDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Date[]  arrayDate;
  }
}
