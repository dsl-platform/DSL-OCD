module CalculatedPropertyInAggregateSetup
{
  aggregate OneTimestamp_4 {
    Timestamp oneTimestamp;

    calculated Timestamp calculatedOneTimestamp from 'it => it.oneTimestamp';

    calculated Timestamp persistedOneTimestamp from 'it => it.oneTimestamp' { persisted; }
  }
}
