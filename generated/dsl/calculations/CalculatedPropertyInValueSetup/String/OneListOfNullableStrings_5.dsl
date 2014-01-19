module CalculatedPropertyInValueSetup
{
  value OneListOfNullableStrings_5 {
    List<String?> oneListOfNullableStrings;

    calculated List<String?> calculatedOneListOfNullableStrings from 'it => it.oneListOfNullableStrings';

    calculated List<String?> persistedOneListOfNullableStrings from 'it => it.oneListOfNullableStrings' { persisted; }
  }
}
