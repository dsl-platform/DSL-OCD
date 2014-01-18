module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneBinaries_3 {
    Set<Binary>? nullableSetOfOneBinaries;

    calculated Set<Binary>? calculatedNullableSetOfOneBinaries from 'it => it.nullableSetOfOneBinaries';

    calculated Set<Binary>? persistedNullableSetOfOneBinaries from 'it => it.nullableSetOfOneBinaries' { persisted; }
  }
}
