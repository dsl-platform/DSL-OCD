module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableStrings_5 {
    Set<String?> oneSetOfNullableStrings;

    calculated Set<String?> calculatedOneSetOfNullableStrings from 'it => it.oneSetOfNullableStrings';

    calculated Set<String?> persistedOneSetOfNullableStrings from 'it => it.oneSetOfNullableStrings' { persisted; }
  }
}
