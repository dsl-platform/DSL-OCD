module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableFloats_4 {
    Array<Float?>? nullableArrayOfNullableFloats;

    calculated Array<Float?>? calculatedNullableArrayOfNullableFloats from 'it => it.nullableArrayOfNullableFloats';

    calculated Array<Float?>? persistedNullableArrayOfNullableFloats from 'it => it.nullableArrayOfNullableFloats' { persisted; }
  }
}
