module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableBinaries_3 {
    List<Binary?>? nullableListOfNullableBinaries;

    calculated List<Binary?>? calculatedNullableListOfNullableBinaries from 'it => it.nullableListOfNullableBinaries';

    calculated List<Binary?>? persistedNullableListOfNullableBinaries from 'it => it.nullableListOfNullableBinaries' { persisted; }
  }
}
