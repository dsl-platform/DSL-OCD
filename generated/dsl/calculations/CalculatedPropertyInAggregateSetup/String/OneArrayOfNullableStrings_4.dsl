module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableStrings_4 {
    Array<String?> oneArrayOfNullableStrings;

    calculated Array<String?> calculatedOneArrayOfNullableStrings from 'it => it.oneArrayOfNullableStrings';

    calculated Array<String?> persistedOneArrayOfNullableStrings from 'it => it.oneArrayOfNullableStrings' { persisted; }
  }
}
