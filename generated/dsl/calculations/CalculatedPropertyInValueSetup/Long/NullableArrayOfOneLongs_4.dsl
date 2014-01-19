module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneLongs_4 {
    Array<Long>? nullableArrayOfOneLongs;

    calculated Array<Long>? calculatedNullableArrayOfOneLongs from 'it => it.nullableArrayOfOneLongs';

    calculated Array<Long>? persistedNullableArrayOfOneLongs from 'it => it.nullableArrayOfOneLongs' { persisted; }
  }
}
