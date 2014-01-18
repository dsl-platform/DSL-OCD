module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableBinaries_3 {
    Array<Binary?>? nullableArrayOfNullableBinaries;

    calculated Array<Binary?>? calculatedNullableArrayOfNullableBinaries from 'it => it.nullableArrayOfNullableBinaries';

    calculated Array<Binary?>? persistedNullableArrayOfNullableBinaries from 'it => it.nullableArrayOfNullableBinaries' { persisted; }
  }
}
