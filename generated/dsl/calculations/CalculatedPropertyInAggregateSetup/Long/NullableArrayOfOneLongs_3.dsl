module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneLongs_3 {
    Array<Long>? nullableArrayOfOneLongs;

    calculated Array<Long>? calculatedNullableArrayOfOneLongs from 'it => it.nullableArrayOfOneLongs';

    calculated Array<Long>? persistedNullableArrayOfOneLongs from 'it => it.nullableArrayOfOneLongs' { persisted; }
  }
}
