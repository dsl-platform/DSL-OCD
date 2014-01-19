module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableBinaries_4 {
    Array<Binary?>? nullableArrayOfNullableBinaries;

    calculated Array<Binary?>? calculatedNullableArrayOfNullableBinaries from 'it => it.nullableArrayOfNullableBinaries';

    calculated Array<Binary?>? persistedNullableArrayOfNullableBinaries from 'it => it.nullableArrayOfNullableBinaries' { persisted; }
  }
}
