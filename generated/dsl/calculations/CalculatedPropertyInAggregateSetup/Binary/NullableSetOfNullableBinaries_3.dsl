module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableBinaries_3 {
    Set<Binary?>? nullableSetOfNullableBinaries;

    calculated Set<Binary?>? calculatedNullableSetOfNullableBinaries from 'it => it.nullableSetOfNullableBinaries';

    calculated Set<Binary?>? persistedNullableSetOfNullableBinaries from 'it => it.nullableSetOfNullableBinaries' { persisted; }
  }
}
