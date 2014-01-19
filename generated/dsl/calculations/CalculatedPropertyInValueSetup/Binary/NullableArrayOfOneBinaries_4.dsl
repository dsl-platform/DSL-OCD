module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneBinaries_4 {
    Array<Binary>? nullableArrayOfOneBinaries;

    calculated Array<Binary>? calculatedNullableArrayOfOneBinaries from 'it => it.nullableArrayOfOneBinaries';

    calculated Array<Binary>? persistedNullableArrayOfOneBinaries from 'it => it.nullableArrayOfOneBinaries' { persisted; }
  }
}
