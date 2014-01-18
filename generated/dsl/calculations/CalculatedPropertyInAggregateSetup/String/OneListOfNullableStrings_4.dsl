module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableStrings_4 {
    List<String?> oneListOfNullableStrings;

    calculated List<String?> calculatedOneListOfNullableStrings from 'it => it.oneListOfNullableStrings';

    calculated List<String?> persistedOneListOfNullableStrings from 'it => it.oneListOfNullableStrings' { persisted; }
  }
}
