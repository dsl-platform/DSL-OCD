module CalculatedPropertyInAggregateSetup
{
  aggregate OneLong_4 {
    Long oneLong;

    calculated Long calculatedOneLong from 'it => it.oneLong';

    calculated Long persistedOneLong from 'it => it.oneLong' { persisted; }
  }
}
