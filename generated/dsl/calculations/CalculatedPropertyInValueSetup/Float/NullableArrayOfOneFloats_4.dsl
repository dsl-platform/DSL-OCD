module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneFloats_4 {
    Array<Float>? nullableArrayOfOneFloats;

    calculated Array<Float>? calculatedNullableArrayOfOneFloats from 'it => it.nullableArrayOfOneFloats';

    calculated Array<Float>? persistedNullableArrayOfOneFloats from 'it => it.nullableArrayOfOneFloats' { persisted; }
  }
}
