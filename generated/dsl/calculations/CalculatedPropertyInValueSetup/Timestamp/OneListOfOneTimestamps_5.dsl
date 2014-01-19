module CalculatedPropertyInValueSetup
{
  value OneListOfOneTimestamps_5 {
    List<Timestamp> oneListOfOneTimestamps;

    calculated List<Timestamp> calculatedOneListOfOneTimestamps from 'it => it.oneListOfOneTimestamps';

    calculated List<Timestamp> persistedOneListOfOneTimestamps from 'it => it.oneListOfOneTimestamps' { persisted; }
  }
}
