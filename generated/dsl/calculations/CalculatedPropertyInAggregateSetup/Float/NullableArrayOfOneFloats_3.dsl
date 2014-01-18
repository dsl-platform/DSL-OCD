module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneFloats_3 {
    Array<Float>? nullableArrayOfOneFloats;

    calculated Array<Float>? calculatedNullableArrayOfOneFloats from 'it => it.nullableArrayOfOneFloats';

    calculated Array<Float>? persistedNullableArrayOfOneFloats from 'it => it.nullableArrayOfOneFloats' { persisted; }
  }
}
