module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneBinaries_3 {
    List<Binary>? nullableListOfOneBinaries;

    calculated List<Binary>? calculatedNullableListOfOneBinaries from 'it => it.nullableListOfOneBinaries';

    calculated List<Binary>? persistedNullableListOfOneBinaries from 'it => it.nullableListOfOneBinaries' { persisted; }
  }
}
