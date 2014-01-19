module CalculatedPropertyInValueSetup
{
  value OneTimestamp_5 {
    Timestamp oneTimestamp;

    calculated Timestamp calculatedOneTimestamp from 'it => it.oneTimestamp';

    calculated Timestamp persistedOneTimestamp from 'it => it.oneTimestamp' { persisted; }
  }
}
