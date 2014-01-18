module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableStrings_4 {
    Set<String?> oneSetOfNullableStrings;

    calculated Set<String?> calculatedOneSetOfNullableStrings from 'it => it.oneSetOfNullableStrings';

    calculated Set<String?> persistedOneSetOfNullableStrings from 'it => it.oneSetOfNullableStrings' { persisted; }
  }
}
